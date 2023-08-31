package com.legopitstop.lightningglass.server;

import com.google.gson.*;
import com.legopitstop.lightningglass.LightningGlass;
import com.legopitstop.lightningglass.registry.Fulgurite;
import com.legopitstop.lightningglass.registry.FulguriteRegistry;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.io.InputStreamReader;
import java.util.Map;

public class FulguriteLoader implements SimpleSynchronousResourceReloadListener {
    public static final Identifier ID = new Identifier(LightningGlass.MOD_ID, "fulgurites");
    private static final Gson GSON = (new GsonBuilder()).create();
    @Override
    public Identifier getFabricId() {
        return ID;
    }

    @Override
    public void reload(ResourceManager manager) {
        FulguriteRegistry.clear();
        Map<Identifier, Resource> resources = manager.findResources("fulgurites", (identifier) -> identifier.getPath().endsWith(".json"));
        for (Identifier id : resources.keySet()) {
            try {
                JsonObject jsonObj = (JsonObject) JsonParser.parseReader(new InputStreamReader(resources.get(id).getInputStream()));
                Fulgurite fulgurite = Fulgurite.fromJson(id, jsonObj);
                FulguriteRegistry.add(id, fulgurite);

            }  catch (Exception e) {
                Identifier id2 = id.withPath(id.getPath().replace("fulgurites/", "").replace(".json", ""));
                LightningGlass.LOGGER.error("Failed to load "+id2+": "+e);
            }
        }
    }
}
