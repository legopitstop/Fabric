package com.legopitstop.poses.mixin;

import com.legopitstop.poses.ArmorStandPoses;
import com.legopitstop.poses.registry.PoseRegistry;
import com.legopitstop.poses.server.pose.Pose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.Optional;

@Mixin(ArmorStandEntity.class)
public abstract class ArmorStandEntityMixin {
    private Identifier DEFAULT_POSE_TYPE = new Identifier("default");
    private Identifier poseType = DEFAULT_POSE_TYPE;
    private int lastPower;
    private int power;

    @Inject(at=@At("TAIL"), method= "<init>")
    public void init(CallbackInfo io) {
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        if (!entity.getWorld().isClient()) {
            this.setPoseType(new Identifier("default"), null);
        }
    }

    @Overwrite
    public boolean shouldShowArms() {
        return true;
    }

    @Inject(at=@At(value="TAIL"), method="writeCustomDataToNbt")
    private void writeNbt(NbtCompound nbt, CallbackInfo ci) {
        nbt.putString("PoseType", this.poseType.toString());
        nbt.putInt("Power", this.power);
    }

    @Inject(at=@At(value="TAIL"), method="readCustomDataFromNbt")
    private void readNbt(NbtCompound nbt, CallbackInfo ci) {
        this.poseType = new Identifier(nbt.getString("PoseType"));
        this.power = nbt.getInt("Power");
    }

    @Inject(at=@At(value = "HEAD"), method = "interactAt", cancellable = true)
    private void interactAt(PlayerEntity player, Vec3d hitPos, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        if (player.getWorld().isClient()) {return;}
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isEmpty() && player.isSneaking() && !entity.isInvisible() && this.power == 0) {
            setNextPoseType(player, cir);
        }
    }

    public Identifier getPoseType() {
        return this.poseType == null ? DEFAULT_POSE_TYPE : this.poseType;
    }

    public void setNextPoseType(PlayerEntity player, CallbackInfoReturnable<ActionResult> cir) {
        ArrayList<Identifier> list = new ArrayList<>();
        for (Pose p : PoseRegistry.INSTANCE.values()) {
            list.add(p.getId());
        }

        for (int i=0; i<list.size(); i++) {
            Identifier id = list.get(i);
            if (id.equals(this.getPoseType())) {
                Identifier next = i<list.size()-1 ? list.get(i+1) : null;
                if (next != null) {
                    this.setPoseType(next, player);
                } else {
                    this.setPoseType(list.get(0), player);
                }
                cir.setReturnValue(ActionResult.SUCCESS);
                break;
            }
        }
    }

    public void setPowerPoseType(int power, boolean notify) {
        for (Pose p : PoseRegistry.INSTANCE.values()) {
            if (p.getPower() ==  power) {
                this.setPoseType(p.getId(), null);
                break;
            }
        }
    }

    @Unique
    public void setPoseType(Identifier id, PlayerEntity player) {
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        Pose pose = PoseRegistry.get(id);
        if (pose != null) {
            pose.setPose(entity);
            this.poseType = id;
            if (player != null) {
                player.sendMessage(Text.translatable(pose.getTranslationKey(), pose.getDisplayName()), true);
            }
        } else {
            ArmorStandPoses.LOGGER.warn("Unknown pose '"+id+"'");
        }
    }

    @Inject(at=@At("TAIL"), method="tick")
    public void injectTick(CallbackInfo ci) {
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        BlockPos sourcePos = entity.getBlockPos();
        if (!entity.getWorld().isClient()) {
            this.power = entity.getWorld().getReceivedRedstonePower(sourcePos);
            if (this.power != this.lastPower) {
                this.lastPower = power;
                this.setPowerPoseType(this.power, false);
            }
        }
    }
}
