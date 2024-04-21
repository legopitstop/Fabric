package dev.lpsmods.canned;

import dev.lpsmods.canned.registry.CannedBlocks;
import dev.lpsmods.canned.registry.CannedItemGroups;
import dev.lpsmods.canned.registry.CannedItems;
import dev.lpsmods.farmersdelight.FarmersDelightCans;
import dev.lpsmods.morefood.MoreFoodCans;
import dev.lpsmods.moregold.MoreGoldCans;
import dev.lpsmods.morehoney.MoreHoneyCans;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Canned implements ModInitializer {
    public static final String MOD_ID = "canned";
	public static final Logger LOGGER = LoggerFactory.getLogger("Canned");

	@Override
	public void onInitialize() {
		CannedBlocks.register();
		CannedItems.register();
		CannedItemGroups.register();

		// Register Supported Mods
		FabricLoader loader = FabricLoader.getInstance();
		loader.getModContainer("farmersdelight").ifPresent(FarmersDelightCans::register);
		loader.getModContainer("morefood").ifPresent(MoreFoodCans::register);
		loader.getModContainer("moregold").ifPresent(MoreGoldCans::register);
		loader.getModContainer("morehoney").ifPresent(MoreHoneyCans::register);
	}
}