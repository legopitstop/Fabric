package dev.lpsmods.breaker.block;

import dev.lpsmods.breaker.UltimateBlockBreaker;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BreakerBlocks {
    public static final Block ULTIMATE_BLOCK_BREAKER = new BreakerBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).strength(1.5f).solid().pistonBehavior(PistonBehavior.NORMAL).ticksRandomly());

    // Legacy
    public static final Block WOOD_BREAKER_BLOCK = createBreakerBlock(BreakerBlockTags.WOOD_BREAKER, 11);
    public static final Block STONE_BREAKER_BLOCK = createBreakerBlock(BreakerBlockTags.STONE_BREAKER,9);
    public static final Block IRON_BREAKER_BLOCK = createBreakerBlock(BreakerBlockTags.IRON_BREAKER,7);
    public static final Block GOLD_BREAKER_BLOCK = createBreakerBlock(BreakerBlockTags.GOLD_BREAKER,5);
    public static final Block DIAMOND_BREAKER_BLOCK = createBreakerBlock(BreakerBlockTags.DIAMOND_BREAKER,3);
    public static final Block NETHERITE_BREAKER_BLOCK = createBreakerBlock(BreakerBlockTags.NETHERITE_BREAKER,1);

    public static Block createBreakerBlock(TagKey<Block> blockTag, int delay) {
        return new LegacyBreakerBlock(blockTag, delay, FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).strength(1.5f).solid().pistonBehavior(PistonBehavior.NORMAL).ticksRandomly());
    }

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(UltimateBlockBreaker.MOD_ID, "ultimate_block_breaker"), ULTIMATE_BLOCK_BREAKER);

        // Legacy
        Registry.register(Registries.BLOCK, new Identifier(UltimateBlockBreaker.MOD_ID, "wood_breaker_block"), WOOD_BREAKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(UltimateBlockBreaker.MOD_ID, "stone_breaker_block"), STONE_BREAKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(UltimateBlockBreaker.MOD_ID, "iron_breaker_block"), IRON_BREAKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(UltimateBlockBreaker.MOD_ID, "gold_breaker_block"), GOLD_BREAKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(UltimateBlockBreaker.MOD_ID, "diamond_breaker_block"), DIAMOND_BREAKER_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(UltimateBlockBreaker.MOD_ID, "netherite_breaker_block"), NETHERITE_BREAKER_BLOCK);

    }
}
