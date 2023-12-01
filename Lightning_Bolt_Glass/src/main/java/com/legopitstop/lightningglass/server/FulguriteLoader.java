package com.legopitstop.lightningglass.server;

import com.google.gson.*;
import com.legopitstop.lightningglass.LightningGlass;
import com.legopitstop.lightningglass.registry.FulguriteRegistry;
import com.legopitstop.lightningglass.server.fulgurite.FulguriteType;
import com.legopitstop.lightningglass.server.fulgurite.FulguriteTypes;
import com.legopitstop.lightningglass.server.fulgurite.Fulgurite;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;

import java.io.InputStreamReader;
import java.util.Map;

public class FulguriteLoader implements SimpleSynchronousResourceReloadListener {
    public static final Identifier ID = new Identifier(LightningGlass.MOD_ID, "fulgurites");
    @Override
    public Identifier getFabricId() {
        return ID;
    }

    @Override
    public void reload(ResourceManager manager) {
        FulguriteRegistry.clearFulgurites();
        LightningGlass.LOGGER.info("Loading fulgurites...");
        Map<Identifier, Resource> resources = manager.findResources("fulgurites", (identifier) -> identifier.getPath().endsWith(".json"));
        for (Identifier resourceId : resources.keySet()) {
            Identifier id = resourceId.withPath(resourceId.getPath().replace("fulgurites/", "").replace(".json", ""));
            try {
                JsonObject jsonObj = (JsonObject) JsonParser.parseReader(new InputStreamReader(resources.get(resourceId).getInputStream()));
                String string = JsonHelper.getString(jsonObj, "type");
                FulguriteType type = FulguriteTypes.get(string);
                Fulgurite fulgurite = type.codec().apply(jsonObj);
                FulguriteRegistry.registerFulgurite(id, fulgurite);
            }  catch (Exception e) {
                LightningGlass.LOGGER.error("Failed to load "+id+": "+e);
            }
        }
        LightningGlass.LOGGER.info("Loaded ("+FulguriteRegistry.sizeFulgurite()+") fulgurites");
    }
}
