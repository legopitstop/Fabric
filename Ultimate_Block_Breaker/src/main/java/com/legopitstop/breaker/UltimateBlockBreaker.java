package com.legopitstop.breaker;

import com.legopitstop.breaker.block.BreakerBlocks;
import com.legopitstop.breaker.item.BreakerItemGroups;
import com.legopitstop.breaker.item.BreakerItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateBlockBreaker implements ModInitializer {
	public static final String MOD_ID = "breaker";
    public static final Logger LOGGER = LoggerFactory.getLogger("Breaker");

	@Override
	public void onInitialize() {
		BreakerBlocks.register();
		BreakerItems.register();
		BreakerItemGroups.register();
	}
}