package com.legopitstop.poses.mixin;

import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// TODO - This should use Poses when the player R-Clicks on the armor stand.
@Mixin(ArmorStandEntity.class)
public class ArmorStandEntityMixin {
    // setShowArms
    // setHeadRotation

    @Inject(at=@At(value = "HEAD"), method = "interactAt")
    private void interactAt(PlayerEntity player, Vec3d hitPos, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        System.out.println("worked");

    }
}
