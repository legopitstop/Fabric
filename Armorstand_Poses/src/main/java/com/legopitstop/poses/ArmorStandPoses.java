package com.legopitstop.poses;

import com.legopitstop.poses.server.pose.PosesLoader;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmorStandPoses implements ModInitializer {
    public static final String MOD_ID = "armorstandposes";
	public static final Logger LOGGER = LoggerFactory.getLogger("Armor Stand Poses");

	@Override
	public void onInitialize() {
		ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new PosesLoader());
	}
}