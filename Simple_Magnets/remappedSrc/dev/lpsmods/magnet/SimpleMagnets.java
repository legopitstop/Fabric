package dev.lpsmods.magnet;

import dev.lpsmods.magnet.block.MagnetBlocks;
import dev.lpsmods.magnet.item.MagnetItemGroups;
import dev.lpsmods.magnet.item.MagnetItems;
import net.fabricmc.api.ModInitializer;

public class SimpleMagnets implements ModInitializer {
	public static final String MOD_ID = "magnet";

	@Override
	public void onInitialize() {
		MagnetBlocks.register();
		MagnetItems.register();
		MagnetItemGroups.register();
	}
}