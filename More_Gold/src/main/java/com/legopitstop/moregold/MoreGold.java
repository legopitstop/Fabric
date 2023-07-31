package com.legopitstop.moregold;

import com.legopitstop.moregold.block.ModFlammableBlockRegistry;
import com.legopitstop.moregold.registry.ModBlocks;
import com.legopitstop.moregold.registry.ModItemGroups;
import com.legopitstop.moregold.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class MoreGold implements ModInitializer {
    public static final String MOD_ID = "moregold";

	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModItemGroups.register();

		ModFlammableBlockRegistry.register();
		StrippableBlockRegistry.register(ModBlocks.GOLDEN_LOG, ModBlocks.STRIPPED_GOLDEN_LOG);
		StrippableBlockRegistry.register(ModBlocks.GOLDEN_WOOD, ModBlocks.STRIPPED_GOLDEN_WOOD);
	}
}