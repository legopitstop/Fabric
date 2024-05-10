package dev.lpsmods.poses.api;

import dev.lpsmods.poses.server.pose.ArmorStandPose;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.decoration.ArmorStandEntity;

public interface ChangePoseCallback {
    Event<ChangePoseCallback> EVENT = EventFactory.createArrayBacked(ChangePoseCallback.class, (listeners) -> (ArmorStandEntity entity, ArmorStandPose pose) -> {
        for (ChangePoseCallback listener : listeners) {
            listener.changePose(entity, pose);
        }
    });

    void changePose(ArmorStandEntity entity, ArmorStandPose pose);
}
