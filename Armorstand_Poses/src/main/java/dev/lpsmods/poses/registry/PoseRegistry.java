package dev.lpsmods.poses.registry;

import dev.lpsmods.poses.server.pose.ArmorStandPose;
import net.minecraft.util.Identifier;

import java.util.concurrent.ConcurrentHashMap;

public class PoseRegistry {
    public static final ConcurrentHashMap<Identifier, ArmorStandPose> INSTANCE = new ConcurrentHashMap<>();

    public static void add(Identifier id, ArmorStandPose pose) {
        PoseRegistry.INSTANCE.put(id, pose);
    }

    public static void clear() {
        PoseRegistry.INSTANCE.clear();
    }

    public static void remove(Identifier id) {
        PoseRegistry.INSTANCE.remove(id);
    }

    public static int size() {
        return PoseRegistry.INSTANCE.size();
    }

    public static ArmorStandPose get(Identifier id) {
        return INSTANCE.get(id);
    }
}
