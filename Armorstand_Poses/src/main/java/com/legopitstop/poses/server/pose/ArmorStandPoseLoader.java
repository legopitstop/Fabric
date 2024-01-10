package com.legopitstop.poses.server.pose;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.legopitstop.poses.ArmorStandPoses;
import com.legopitstop.poses.registry.PoseRegistry;
import com.mojang.serialization.JsonOps;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.io.InputStreamReader;
import java.util.Map;
import java.util.Optional;

public class ArmorStandPoseLoader implements SimpleSynchronousResourceReloadListener {
    public static final Identifier ID = new Identifier(ArmorStandPoses.MOD_ID, "poses");
    @Override
    public Identifier getFabricId() {
        return ID;
    }

    @Override
    public void reload(ResourceManager manager) {
        PoseRegistry.clear();
        ArmorStandPoses.LOGGER.info("Loading poses...");
        Map<Identifier, Resource> resources = manager.findResources("poses", (identifer) -> identifer.getPath().endsWith(".json"));
        for (Identifier resourceId : resources.keySet()) {
            Identifier id = resourceId.withPath(resourceId.getPath().replace("poses/", "").replace(".json", ""));
            try {
                JsonObject jsonObj = (JsonObject) JsonParser.parseReader(new InputStreamReader(resources.get(resourceId).getInputStream()));
                Optional<? extends ArmorStandPose> poseOptional =  ArmorStandPose.CODEC.parse(JsonOps.INSTANCE, jsonObj).result();
                poseOptional.ifPresent(pose -> PoseRegistry.add(id, pose));
            } catch (Exception e) {
                ArmorStandPoses.LOGGER.error("Failed to load "+id+": "+e);
            }
        }
        System.out.println(PoseRegistry.size());
    }
}
