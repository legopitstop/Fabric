package dev.lpsmods.basaltblocks;

import dev.lpsmods.basaltblocks.registry.BasaltBlockBlocks;
import dev.lpsmods.basaltblocks.registry.BasaltBlockItemGroups;
import dev.lpsmods.basaltblocks.registry.BasaltBlockItems;
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