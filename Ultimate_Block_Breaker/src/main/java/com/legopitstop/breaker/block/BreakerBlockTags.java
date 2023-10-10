package com.legopitstop.breaker.block;

import com.legopitstop.breaker.UltimateBlockBreaker;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BreakerBlockTags {
    public static final TagKey<Block> WOOD_BREAKER = of("wood_breaker");
    public static final TagKey<Block> STONE_BREAKER = of("stone_breaker");
    public static final TagKey<Block> IRON_BREAKER = of("iron_breaker");
    public static final TagKey<Block> GOLD_BREAKER = of("gold_breaker");
    public static final TagKey<Block> DIAMOND_BREAKER = of("diamond_breaker");
    public static final TagKey<Block> NETHERITE_BREAKER = of("netherite_breaker");

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(UltimateBlockBreaker.MOD_ID, id));
    }
}
