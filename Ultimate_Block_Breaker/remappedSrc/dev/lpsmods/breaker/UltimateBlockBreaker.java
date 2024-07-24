package dev.lpsmods.breaker;

import dev.lpsmods.breaker.block.BreakerBlocks;
import dev.lpsmods.breaker.item.BreakerItemGroups;
import dev.lpsmods.breaker.item.BreakerItems;
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