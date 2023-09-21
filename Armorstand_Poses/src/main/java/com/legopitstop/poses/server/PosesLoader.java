package com.legopitstop.poses.server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.legopitstop.poses.ArmorStandPoses;
import com.legopitstop.poses.registry.Pose;
import com.legopitstop.poses.registry.PoseRegistry;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.io.InputStreamReader;
import java.util.Map;

public class PosesLoader implements SimpleSynchronousResourceReloadListener {
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
        for (Identifier id : resources.keySet()) {
            try {
                JsonObject jsonObj = (JsonObject) JsonParser.parseReader(new InputStreamReader(resources.get(id).getInputStream()));
                Pose pose = Pose.fromJson(id, jsonObj);
                PoseRegistry.add(id, pose);
            } catch (Exception e) {
                Identifier id2 = id.withPath(id.getPath().replace("poses/", "").replace(".json", ""));
                ArmorStandPoses.LOGGER.error("Failed to load "+id2+": "+e);
            }
        }
        System.out.println(PoseRegistry.size());


    }
}
