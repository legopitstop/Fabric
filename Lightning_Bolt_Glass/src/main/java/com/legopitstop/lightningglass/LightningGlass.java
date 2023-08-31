package com.legopitstop.lightningglass;

import com.legopitstop.lightningglass.server.FulguriteLoader;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightningGlass implements ModInitializer {
    public static final String MOD_ID = "lightning_glass";
	public static final Logger LOGGER = LoggerFactory.getLogger("Lightning Glass");

	@Override
	public void onInitialize() {
		ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new FulguriteLoader());
	}
}
