package com.legopitstop.magnet;

import com.legopitstop.magnet.block.MagnetBlocks;
import com.legopitstop.magnet.item.MagnetItemGroups;
import com.legopitstop.magnet.item.MagnetItems;
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