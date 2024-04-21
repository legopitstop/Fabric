package dev.lpsmods.moreblock;

import dev.lpsmods.moreblock.registry.MoreBlockBlocks;
import dev.lpsmods.moreblock.registry.MoreBlockItemGroups;
import dev.lpsmods.moreblock.registry.MoreBlockItems;
import net.fabricmc.api.ModInitializer;

public class MoreBlock implements ModInitializer {
    public static final String MOD_ID = "moreblock";

	@Override
	public void onInitialize() {
		MoreBlockBlocks.register();
		MoreBlockItems.register();
		MoreBlockItemGroups.register();

		// Strippable
		// Needs custom implemntation (StrippableBlockRegistry requires 'axis' property)
	}
}