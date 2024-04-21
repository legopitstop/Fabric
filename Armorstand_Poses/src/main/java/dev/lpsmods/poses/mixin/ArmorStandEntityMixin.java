package dev.lpsmods.poses.mixin;

import dev.lpsmods.poses.ArmorStandPoses;
import dev.lpsmods.poses.registry.PoseRegistry;
import dev.lpsmods.poses.server.pose.ArmorStandPose;
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
import java.util.Map;

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
        if (player.getWorld().isClient()) {return;}
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isEmpty() && player.isSneaking() && !entity.isInvisible() && this.power == 0) {
            Identifier pose = setNextPoseType(true, cir);
            if (pose != null) {
                Text displayName = Text.translatable("pose."+pose.getNamespace()+"."+pose.getPath());
                player.sendMessage(Text.translatable(EntityType.ARMOR_STAND.getTranslationKey() + ".pose", displayName), true);
            }
        }
    }

    public Identifier getPoseType() {
        return this.poseType == null ? DEFAULT_POSE_TYPE : this.poseType;
    }

    public Identifier setNextPoseType(boolean notify, CallbackInfoReturnable<ActionResult> cir) {
        Identifier pose = new Identifier("default");
        ArrayList<Identifier> list = new ArrayList<Identifier>();
        for (Map.Entry<Identifier, ArmorStandPose> entry : PoseRegistry.INSTANCE.entrySet()) {
            list.add(entry.getKey());
        }

        for (int i=0; i<list.size(); i++) {
            Identifier id = list.get(i);
            if (id.equals(this.getPoseType())) {
                Identifier next = i<list.size()-1 ? list.get(i+1) : null;
                if (next != null) {
                    pose = this.setPoseType(next, notify);
                } else {
                    pose = this.setPoseType(list.get(0), notify);
                }
                cir.setReturnValue(ActionResult.SUCCESS);
                break;
            }
        }
        return pose;
    }

    public void setPowerPoseType(int power, boolean notify) {
        for (Map.Entry<Identifier, ArmorStandPose> entry : PoseRegistry.INSTANCE.entrySet()) {
            ArmorStandPose pose = entry.getValue();
            if (pose.power() ==  power) {
                this.setPoseType(entry.getKey(), notify);
                break;
            }
        }
    }

    @Unique
    public Identifier setPoseType(Identifier id, boolean notify) {
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        ArmorStandPose pose = PoseRegistry.get(id);
        if (pose != null) {
            pose.setPose(entity);
            this.poseType = id;
        } else {
            ArmorStandPoses.LOGGER.warn("Unknown pose '"+id+"'");
            return null;
        }
        return id;
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
