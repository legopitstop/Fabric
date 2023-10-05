package com.legopitstop.magnet;

import com.legopitstop.magnet.block.MagnetBlocks;
import com.legopitstop.magnet.item.MagnetItemGroups;
import com.legopitstop.magnet.item.MagnetItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleMagnets implements ModInitializer {
	public static final String MOD_ID = "magnet";
    public static final Logger LOGGER = LoggerFactory.getLogger("Simple Magnets");

	@Override
	public void onInitialize() {
		MagnetBlocks.register();
		MagnetItems.register();
		MagnetItemGroups.register();
	}
}