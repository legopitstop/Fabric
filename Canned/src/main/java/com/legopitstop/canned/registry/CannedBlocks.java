package com.legopitstop.canned.registry;

import com.legopitstop.canned.Canned;
import com.legopitstop.canned.block.CanBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class CannedBlocks {
    public static final Block CAN = createCan();
    public static final Block APPLE_CAN = createCan();
    public static final Block BAKED_POTATO_CAN = createCan();
    public static final Block BEETROOT_CAN = createCan();
    public static final Block BEETROOT_SOUP_CAN = createCan();
    public static final Block BREAD_CAN = createCan();
    public static final Block CAKE_CAN = createCan();
    public static final Block CARROT_CAN = createCan();
    public static final Block CHORUS_FRUIT_CAN = createCan();
    public static final Block COOKED_BEEF_CAN = createCan();
    public static final Block COOKED_CHICKEN_CAN = createCan();
    public static final Block COOKED_COD_CAN = createCan();
    public static final Block COOKED_MUTTON_CAN = createCan();
    public static final Block COOKED_PORKCHOP_CAN = createCan();
    public static final Block COOKED_RABBIT_CAN = createCan();
    public static final Block COOKED_SALMON_CAN = createCan();
    public static final Block COOKIE_CAN = createCan();
    public static final Block DRIED_KELP_CAN = createCan();
    public static final Block ENCHANTED_GOLDEN_APPLE_CAN = createCan();
    public static final Block GLOW_BERRIES_CAN = createCan();
    public static final Block GOLDEN_APPLE_CAN = createCan();
    public static final Block GOLDEN_CARROT_CAN = createCan();
    public static final Block HONEY_CAN = createCan();
    public static final Block MELON_CAN = createCan();
    public static final Block MUSHROOM_STEW_CAN = createCan();
    public static final Block POISONOUS_POTATO_CAN = createCan();
    public static final Block POTATO_CAN = createCan();
    public static final Block PUFFERFISH_CAN = createCan();
    public static final Block PUMPKIN_PIE_CAN = createCan();
    public static final Block RABBIT_STEW_CAN = createCan();
    public static final Block ROTTEN_FLESH_CAN = createCan();
    public static final Block SPIDER_EYE_CAN = createCan();
    public static final Block SUSPICIOUS_STEW_CAN = createCan();
    public static final Block SWEET_BERRIES_CAN = createCan();
    public static final Block TROPICAL_FISH_CAN = createCan();

    public static Block createCan() {
        return new CanBlock(FabricBlockSettings.create().hardness(0.5F).resistance(0.5F).sounds(BlockSoundGroup.LANTERN).mapColor(MapColor.GRAY).solidBlock(Blocks::never).nonOpaque());
    }

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "can"), CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "apple_can"), APPLE_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "baked_potato_can"), BAKED_POTATO_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "beetroot_can"), BEETROOT_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "beetroot_soup_can"), BEETROOT_SOUP_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "bread_can"), BREAD_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cake_can"), CAKE_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "carrot_can"), CARROT_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "chorus_fruit_can"), CHORUS_FRUIT_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cooked_beef_can"), COOKED_BEEF_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cooked_chicken_can"), COOKED_CHICKEN_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cooked_cod_can"), COOKED_COD_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cooked_mutton_can"), COOKED_MUTTON_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cooked_porkchop_can"), COOKED_PORKCHOP_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cooked_rabbit_can"), COOKED_RABBIT_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cooked_salmon_can"), COOKED_SALMON_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "cookie_can"), COOKIE_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "dried_kelp_can"), DRIED_KELP_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "enchanted_golden_apple_can"), ENCHANTED_GOLDEN_APPLE_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "glow_berries_can"), GLOW_BERRIES_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "golden_apple_can"), GOLDEN_APPLE_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "golden_carrot_can"), GOLDEN_CARROT_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "honey_can"), HONEY_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "melon_can"), MELON_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "mushroom_stew_can"), MUSHROOM_STEW_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "poisonous_potato_can"), POISONOUS_POTATO_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "potato_can"), POTATO_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "pufferfish_can"), PUFFERFISH_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "pumpkin_pie_can"), PUMPKIN_PIE_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "rabbit_stew_can"), RABBIT_STEW_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "rotten_flesh_can"), ROTTEN_FLESH_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "spider_eye_can"), SPIDER_EYE_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "suspicious_stew_can"), SUSPICIOUS_STEW_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "sweet_berries_can"), SWEET_BERRIES_CAN);
        Registry.register(Registries.BLOCK, new Identifier(Canned.MOD_ID, "tropical_fish_can"), TROPICAL_FISH_CAN);
    }
}
