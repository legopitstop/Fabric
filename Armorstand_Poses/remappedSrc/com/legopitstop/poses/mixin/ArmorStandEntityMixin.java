package com.legopitstop.poses.mixin;

import com.legopitstop.poses.registry.PoseRegistry;
import com.legopitstop.poses.server.pose.ArmorStandPose;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
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

@Mixin(ArmorStandEntity.class)
public abstract class ArmorStandEntityMixin {
    private Identifier DEFAULT_POSE_TYPE = new Identifier("default");
    private Identifier poseType = DEFAULT_POSE_TYPE;
    private int lastPower;
    private int power;

    @Inject(at=@At("TAIL"), method= "<init>")
    public void init(CallbackInfo io) {
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        if (!entity.method_48926().isClient()) {
            this.setPoseType(new Identifier("default"), false);
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
        if (player.method_48926().isClient()) {return;}
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isEmpty() && player.isSneaking() && !entity.isInvisible() && this.power == 0) {
            setNextPoseType(true, cir);
        }
    }

    public Identifier getPoseType() {
        return this.poseType == null ? DEFAULT_POSE_TYPE : this.poseType;
    }

    public void setNextPoseType(boolean notify, CallbackInfoReturnable<ActionResult> cir) {
        ArrayList<Identifier> list = new ArrayList<>();
        for (ArmorStandPose p : PoseRegistry.INSTANCE.values()) {
            list.add(p.id());
        }

        for (int i=0; i<list.size(); i++) {
            Identifier id = list.get(i);
            if (id.equals(this.getPoseType())) {
                Identifier next = i<list.size()-1 ? list.get(i+1) : null;
                if (next != null) {
                    this.setPoseType(next, notify);
                } else {
                    this.setPoseType(list.get(0), notify);
                }
                cir.setReturnValue(ActionResult.SUCCESS);
                break;
            }
        }
    }

    public void setPowerPoseType(int power, boolean notify) {
        for (ArmorStandPose p : PoseRegistry.INSTANCE.values()) {
            if (p.power() ==  power) {
                this.setPoseType(p.id(), notify);
                break;
            }
        }
    }

    @Unique
    public void setPoseType(Identifier id, boolean notify) {
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        ArmorStandPose pose = PoseRegistry.get(id);
        if (pose != null) {
            pose.setPose(entity);
            this.poseType = id;
            if (notify) {
                MinecraftClient.getInstance().inGameHud.setOverlayMessage(Text.translatable(EntityType.ARMOR_STAND.getTranslationKey() + ".pose", pose.displayName()), false);
            }
        } else {
            System.out.println("Unknown pose '"+id+"'");
        }
    }

    @Inject(at=@At("TAIL"), method="tick")
    public void injectTick(CallbackInfo ci) {
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        BlockPos sourcePos = entity.getBlockPos();
        if (!entity.method_48926().isClient()) {
            this.power = entity.method_48926().getReceivedRedstonePower(sourcePos);
            if (this.power != this.lastPower) {
                this.lastPower = power;
                this.setPowerPoseType(this.power, false);
            }
        }
    }
}
