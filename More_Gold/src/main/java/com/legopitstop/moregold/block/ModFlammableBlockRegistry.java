package com.legopitstop.moregold.block;

import com.legopitstop.moregold.registry.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void register() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.GOLDEN_LOG, 5, 5);
        registry.add(ModBlocks.GOLDEN_WOOD, 5, 5);
    }
}
