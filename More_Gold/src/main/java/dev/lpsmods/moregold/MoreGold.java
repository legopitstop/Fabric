package dev.lpsmods.moregold;

import dev.lpsmods.moregold.block.MoreGoldFlammableBlockRegistry;
import dev.lpsmods.moregold.registry.MoreGoldBlocks;
import dev.lpsmods.moregold.registry.MoreGoldItemGroups;
import dev.lpsmods.moregold.registry.MoreGoldItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MoreGold implements ModInitializer {
    public static final String MOD_ID = "moregold";

	@Override
	public void onInitialize() {
		MoreGoldBlocks.register();
		MoreGoldItems.register();
		MoreGoldItemGroups.register();

		MoreGoldFlammableBlockRegistry.register();
		StrippableBlockRegistry.register(MoreGoldBlocks.GOLDEN_LOG, MoreGoldBlocks.STRIPPED_GOLDEN_LOG);
		StrippableBlockRegistry.register(MoreGoldBlocks.GOLDEN_WOOD, MoreGoldBlocks.STRIPPED_GOLDEN_WOOD);

		FuelRegistry.INSTANCE.add(MoreGoldItems.GOLDEN_LOG, 300);
		FuelRegistry.INSTANCE.add(MoreGoldItems.STRIPPED_GOLDEN_LOG, 300);
		FuelRegistry.INSTANCE.add(MoreGoldItems.GOLDEN_WOOD, 300);
		FuelRegistry.INSTANCE.add(MoreGoldItems.STRIPPED_GOLDEN_WOOD, 300);

		CompostingChanceRegistry.INSTANCE.add(MoreGoldItems.GOLDEN_FRUIT_SAPLING, 0.3F);
		CompostingChanceRegistry.INSTANCE.add(MoreGoldItems.GOLDEN_FRUIT_SEEDS, 0.3F);
	}
}