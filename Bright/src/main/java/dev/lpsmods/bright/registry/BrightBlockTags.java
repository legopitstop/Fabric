package dev.lpsmods.bright.registry;

import dev.lpsmods.bright.Bright;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BrightBlockTags {
    public static final TagKey<Block> CANDLE_STICKS = TagKey.of(RegistryKeys.BLOCK, new Identifier(Bright.MOD_ID, "candle_sticks"));
}
