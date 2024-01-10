package com.legopitstop.moreblock;

import com.legopitstop.moreblock.registry.MoreBlockBlocks;
import com.legopitstop.moreblock.registry.MoreBlockItemGroups;
import com.legopitstop.moreblock.registry.MoreBlockItems;
import net.fabricmc.api.ModInitializer;

public class MoreBlock implements ModInitializer {
    public static final String MOD_ID = "moreblock";

	@Override
	public void onInitialize() {
		MoreBlockBlocks.register();
		MoreBlockItems.register();
		MoreBlockItemGroups.register();
	}
}