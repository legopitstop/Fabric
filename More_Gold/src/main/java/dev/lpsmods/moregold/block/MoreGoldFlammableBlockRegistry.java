package dev.lpsmods.moregold.block;

import dev.lpsmods.moregold.registry.MoreGoldBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class MoreGoldFlammableBlockRegistry {
    public static void register() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(MoreGoldBlocks.GOLDEN_LOG, 5, 5);
        registry.add(MoreGoldBlocks.GOLDEN_WOOD, 5, 5);
    }
}
