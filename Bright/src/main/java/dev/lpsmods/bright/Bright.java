package dev.lpsmods.bright;

import dev.lpsmods.bright.registry.BrightBlocks;
import dev.lpsmods.bright.registry.BrightItemGroups;
import dev.lpsmods.bright.registry.BrightItems;
import net.fabricmc.api.ModInitializer;

// TODO: Use data generator to create recipes and loot tables.
public class Bright implements ModInitializer {

	public static final String MOD_ID = "bright";

	@Override
	public void onInitialize() {
		BrightItems.register();
		BrightBlocks.register();
		BrightItemGroups.register();
	}
}