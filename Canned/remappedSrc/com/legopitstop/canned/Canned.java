package com.legopitstop.canned;

import com.legopitstop.canned.registry.CannedBlocks;
import com.legopitstop.canned.registry.CannedItemGroups;
import com.legopitstop.canned.registry.CannedItems;
import net.fabricmc.api.ModInitializer;

public class Canned implements ModInitializer {
    public static final String MOD_ID = "canned";

	@Override
	public void onInitialize() {
		CannedBlocks.register();
		CannedItems.register();
		CannedItemGroups.register();
	}
}