package com.legopitstop.poses.registry;

import com.legopitstop.poses.server.pose.Pose;
import net.minecraft.util.Identifier;

import java.util.concurrent.ConcurrentHashMap;

public class PoseRegistry {
    public static final ConcurrentHashMap<Identifier, Pose> INSTANCE = new ConcurrentHashMap<>();

    public static void add(Identifier id, Pose pose) {
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

    public static Pose get(Identifier id) {
        return INSTANCE.get(id);
    }
}
