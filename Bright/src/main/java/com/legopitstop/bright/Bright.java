package com.legopitstop.bright;

import com.legopitstop.bright.registry.ModBlocks;
import com.legopitstop.bright.registry.ModItemGroups;
import com.legopitstop.bright.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO - Add recipes
public class Bright implements ModInitializer {

	public static final String MOD_ID = "bright";

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
		ModItemGroups.register();
	}
}