package com.legopitstop.poses.mixin;

import com.legopitstop.poses.registry.PoseRegistry;
import com.legopitstop.poses.server.pose.ArmorStandPose;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ArmorStandEntity.class)
public class ArmorStandEntityClientMixin {
    @Unique
    public void setPoseType(Identifier id, boolean notify) {
        ArmorStandEntity entity = (ArmorStandEntity)(Object)this;
        ArmorStandPose pose = PoseRegistry.get(id);
        if (pose != null) {
            if (notify) {
                MinecraftClient.getInstance().inGameHud.setOverlayMessage(Text.translatable(EntityType.ARMOR_STAND.getTranslationKey() + ".pose", pose.displayName()), false);
            }
        }
    }
}
