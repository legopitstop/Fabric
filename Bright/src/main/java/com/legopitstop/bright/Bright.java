package com.legopitstop.bright;

import com.legopitstop.bright.registry.BrightBlocks;
import com.legopitstop.bright.registry.BrightItemGroups;
import com.legopitstop.bright.registry.BrightItems;
import net.fabricmc.api.ModInitializer;

// TODO - Add recipes
public class Bright implements ModInitializer {

	public static final String MOD_ID = "bright";

	@Override
	public void onInitialize() {
		BrightItems.register();
		BrightBlocks.register();
		BrightItemGroups.register();
	}
}