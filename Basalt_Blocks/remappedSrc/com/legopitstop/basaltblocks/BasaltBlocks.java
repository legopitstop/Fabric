package com.legopitstop.basaltblocks;

import com.legopitstop.basaltblocks.registry.BasaltBlockBlocks;
import com.legopitstop.basaltblocks.registry.BasaltBlockItemGroups;
import com.legopitstop.basaltblocks.registry.BasaltBlockItems;
import net.fabricmc.api.ModInitializer;

public class BasaltBlocks implements ModInitializer {
    public static final String MOD_ID = "basaltblocks";

	@Override
	public void onInitialize() {
		BasaltBlockBlocks.register();
		BasaltBlockItems.register();
		BasaltBlockItemGroups.register();
	}
}