package com.legopitstop.breaker.item;

import com.legopitstop.breaker.UltimateBlockBreaker;
import com.legopitstop.breaker.block.BreakerBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BreakerItems {
    public static final Item ULTIMATE_BLOCK_BREAKER = new BlockItem(BreakerBlocks.ULTIMATE_BLOCK_BREAKER, new FabricItemSettings());

    // Legacy
    public static final Item WOOD_BREAKER_BLOCK = new BlockItem(BreakerBlocks.WOOD_BREAKER_BLOCK, new FabricItemSettings());
    public static final Item STONE_BREAKER_BLOCK = new BlockItem(BreakerBlocks.STONE_BREAKER_BLOCK, new FabricItemSettings());
    public static final Item IRON_BREAKER_BLOCK = new BlockItem(BreakerBlocks.IRON_BREAKER_BLOCK, new FabricItemSettings());
    public static final Item GOLD_BREAKER_BLOCK = new BlockItem(BreakerBlocks.GOLD_BREAKER_BLOCK, new FabricItemSettings());
    public static final Item DIAMOND_BREAKER_BLOCK = new BlockItem(BreakerBlocks.DIAMOND_BREAKER_BLOCK, new FabricItemSettings());
    public static final Item NETHERITE_BREAKER_BLOCK = new BlockItem(BreakerBlocks.NETHERITE_BREAKER_BLOCK, new FabricItemSettings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(UltimateBlockBreaker.MOD_ID, "ultimate_block_breaker"), ULTIMATE_BLOCK_BREAKER);

        // Legacy
        Registry.register(Registries.ITEM, new Identifier(UltimateBlockBreaker.MOD_ID, "wood_breaker_block"), WOOD_BREAKER_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(UltimateBlockBreaker.MOD_ID, "stone_breaker_block"), STONE_BREAKER_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(UltimateBlockBreaker.MOD_ID, "iron_breaker_block"), IRON_BREAKER_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(UltimateBlockBreaker.MOD_ID, "gold_breaker_block"), GOLD_BREAKER_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(UltimateBlockBreaker.MOD_ID, "diamond_breaker_block"), DIAMOND_BREAKER_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(UltimateBlockBreaker.MOD_ID, "netherite_breaker_block"), NETHERITE_BREAKER_BLOCK);
    }
}
