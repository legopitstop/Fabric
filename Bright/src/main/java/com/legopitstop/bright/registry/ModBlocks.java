package com.legopitstop.bright.registry;

import com.legopitstop.bright.Bright;
import com.legopitstop.bright.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // CANDLE_STICK
    public static Block COPPER_CANDLE_STICK = createCandleStick(MapColor.PALE_YELLOW);
    public static Block COPPER_WHITE_CANDLE_STICK = createCandleStick(MapColor.WHITE_GRAY);
    public static Block COPPER_LIGHT_GRAY_CANDLE_STICK = createCandleStick(MapColor.LIGHT_GRAY);
    public static Block COPPER_GRAY_CANDLE_STICK = createCandleStick(MapColor.GRAY);
    public static Block COPPER_BLACK_CANDLE_STICK = createCandleStick(MapColor.BLACK);
    public static Block COPPER_BROWN_CANDLE_STICK = createCandleStick(MapColor.BROWN);
    public static Block COPPER_RED_CANDLE_STICK = createCandleStick(MapColor.RED);
    public static Block COPPER_ORANGE_CANDLE_STICK = createCandleStick(MapColor.ORANGE);
    public static Block COPPER_YELLOW_CANDLE_STICK = createCandleStick(MapColor.YELLOW);
    public static Block COPPER_LIME_CANDLE_STICK = createCandleStick(MapColor.LIME);
    public static Block COPPER_GREEN_CANDLE_STICK = createCandleStick(MapColor.GREEN);
    public static Block COPPER_CYAN_CANDLE_STICK = createCandleStick(MapColor.CYAN);
    public static Block COPPER_LIGHT_BLUE_CANDLE_STICK = createCandleStick(MapColor.LIGHT_BLUE);
    public static Block COPPER_BLUE_CANDLE_STICK = createCandleStick(MapColor.BLUE);
    public static Block COPPER_PURPLE_CANDLE_STICK = createCandleStick(MapColor.PURPLE);
    public static Block COPPER_MAGENTA_CANDLE_STICK = createCandleStick(MapColor.MAGENTA);
    public static Block COPPER_PINK_CANDLE_STICK = createCandleStick(MapColor.PINK);
    public static Block DIAMOND_CANDLE_STICK = createCandleStick(MapColor.PALE_YELLOW);
    public static Block DIAMOND_WHITE_CANDLE_STICK = createCandleStick(MapColor.WHITE_GRAY);
    public static Block DIAMOND_LIGHT_GRAY_CANDLE_STICK = createCandleStick(MapColor.LIGHT_GRAY);
    public static Block DIAMOND_GRAY_CANDLE_STICK = createCandleStick(MapColor.GRAY);
    public static Block DIAMOND_BLACK_CANDLE_STICK = createCandleStick(MapColor.BLACK);
    public static Block DIAMOND_BROWN_CANDLE_STICK = createCandleStick(MapColor.BROWN);
    public static Block DIAMOND_RED_CANDLE_STICK = createCandleStick(MapColor.RED);
    public static Block DIAMOND_ORANGE_CANDLE_STICK = createCandleStick(MapColor.ORANGE);
    public static Block DIAMOND_YELLOW_CANDLE_STICK = createCandleStick(MapColor.YELLOW);
    public static Block DIAMOND_LIME_CANDLE_STICK = createCandleStick(MapColor.LIME);
    public static Block DIAMOND_GREEN_CANDLE_STICK = createCandleStick(MapColor.GREEN);
    public static Block DIAMOND_CYAN_CANDLE_STICK = createCandleStick(MapColor.CYAN);
    public static Block DIAMOND_LIGHT_BLUE_CANDLE_STICK = createCandleStick(MapColor.LIGHT_BLUE);
    public static Block DIAMOND_BLUE_CANDLE_STICK = createCandleStick(MapColor.BLUE);
    public static Block DIAMOND_PURPLE_CANDLE_STICK = createCandleStick(MapColor.PURPLE);
    public static Block DIAMOND_MAGENTA_CANDLE_STICK = createCandleStick(MapColor.MAGENTA);
    public static Block DIAMOND_PINK_CANDLE_STICK = createCandleStick(MapColor.PINK);
    public static Block GOLD_CANDLE_STICK = createCandleStick(MapColor.PALE_YELLOW);
    public static Block GOLD_WHITE_CANDLE_STICK = createCandleStick(MapColor.WHITE_GRAY);
    public static Block GOLD_LIGHT_GRAY_CANDLE_STICK = createCandleStick(MapColor.LIGHT_GRAY);
    public static Block GOLD_GRAY_CANDLE_STICK = createCandleStick(MapColor.GRAY);
    public static Block GOLD_BLACK_CANDLE_STICK = createCandleStick(MapColor.BLACK);
    public static Block GOLD_BROWN_CANDLE_STICK = createCandleStick(MapColor.BROWN);
    public static Block GOLD_RED_CANDLE_STICK = createCandleStick(MapColor.RED);
    public static Block GOLD_ORANGE_CANDLE_STICK = createCandleStick(MapColor.ORANGE);
    public static Block GOLD_YELLOW_CANDLE_STICK = createCandleStick(MapColor.YELLOW);
    public static Block GOLD_LIME_CANDLE_STICK = createCandleStick(MapColor.LIME);
    public static Block GOLD_GREEN_CANDLE_STICK = createCandleStick(MapColor.GREEN);
    public static Block GOLD_CYAN_CANDLE_STICK = createCandleStick(MapColor.CYAN);
    public static Block GOLD_LIGHT_BLUE_CANDLE_STICK = createCandleStick(MapColor.LIGHT_BLUE);
    public static Block GOLD_BLUE_CANDLE_STICK = createCandleStick(MapColor.BLUE);
    public static Block GOLD_PURPLE_CANDLE_STICK = createCandleStick(MapColor.PURPLE);
    public static Block GOLD_MAGENTA_CANDLE_STICK = createCandleStick(MapColor.MAGENTA);
    public static Block GOLD_PINK_CANDLE_STICK = createCandleStick(MapColor.PINK);
    public static Block IRON_CANDLE_STICK = createCandleStick(MapColor.PALE_YELLOW);
    public static Block IRON_WHITE_CANDLE_STICK = createCandleStick(MapColor.WHITE_GRAY);
    public static Block IRON_LIGHT_GRAY_CANDLE_STICK = createCandleStick(MapColor.LIGHT_GRAY);
    public static Block IRON_GRAY_CANDLE_STICK = createCandleStick(MapColor.GRAY);
    public static Block IRON_BLACK_CANDLE_STICK = createCandleStick(MapColor.BLACK);
    public static Block IRON_BROWN_CANDLE_STICK = createCandleStick(MapColor.BROWN);
    public static Block IRON_RED_CANDLE_STICK = createCandleStick(MapColor.RED);
    public static Block IRON_ORANGE_CANDLE_STICK = createCandleStick(MapColor.ORANGE);
    public static Block IRON_YELLOW_CANDLE_STICK = createCandleStick(MapColor.YELLOW);
    public static Block IRON_LIME_CANDLE_STICK = createCandleStick(MapColor.LIME);
    public static Block IRON_GREEN_CANDLE_STICK = createCandleStick(MapColor.GREEN);
    public static Block IRON_CYAN_CANDLE_STICK = createCandleStick(MapColor.CYAN);
    public static Block IRON_LIGHT_BLUE_CANDLE_STICK = createCandleStick(MapColor.LIGHT_BLUE);
    public static Block IRON_BLUE_CANDLE_STICK = createCandleStick(MapColor.BLUE);
    public static Block IRON_PURPLE_CANDLE_STICK = createCandleStick(MapColor.PURPLE);
    public static Block IRON_MAGENTA_CANDLE_STICK = createCandleStick(MapColor.MAGENTA);
    public static Block IRON_PINK_CANDLE_STICK = createCandleStick(MapColor.PINK);
    public static Block NETHERITE_CANDLE_STICK = createCandleStick(MapColor.PALE_YELLOW);
    public static Block NETHERITE_WHITE_CANDLE_STICK = createCandleStick(MapColor.WHITE_GRAY);
    public static Block NETHERITE_LIGHT_GRAY_CANDLE_STICK = createCandleStick(MapColor.LIGHT_GRAY);
    public static Block NETHERITE_GRAY_CANDLE_STICK = createCandleStick(MapColor.GRAY);
    public static Block NETHERITE_BLACK_CANDLE_STICK = createCandleStick(MapColor.BLACK);
    public static Block NETHERITE_BROWN_CANDLE_STICK = createCandleStick(MapColor.BROWN);
    public static Block NETHERITE_RED_CANDLE_STICK = createCandleStick(MapColor.RED);
    public static Block NETHERITE_ORANGE_CANDLE_STICK = createCandleStick(MapColor.ORANGE);
    public static Block NETHERITE_YELLOW_CANDLE_STICK = createCandleStick(MapColor.YELLOW);
    public static Block NETHERITE_LIME_CANDLE_STICK = createCandleStick(MapColor.LIME);
    public static Block NETHERITE_GREEN_CANDLE_STICK = createCandleStick(MapColor.GREEN);
    public static Block NETHERITE_CYAN_CANDLE_STICK = createCandleStick(MapColor.CYAN);
    public static Block NETHERITE_LIGHT_BLUE_CANDLE_STICK = createCandleStick(MapColor.LIGHT_BLUE);
    public static Block NETHERITE_BLUE_CANDLE_STICK = createCandleStick(MapColor.BLUE);
    public static Block NETHERITE_PURPLE_CANDLE_STICK = createCandleStick(MapColor.PURPLE);
    public static Block NETHERITE_MAGENTA_CANDLE_STICK = createCandleStick(MapColor.MAGENTA);
    public static Block NETHERITE_PINK_CANDLE_STICK = createCandleStick(MapColor.PINK);

    public static Block createCandleStick(MapColor mapcolor) {
        return new CandleStickBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.HAT).strength(0.3f).sounds(BlockSoundGroup.CANDLE).luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().solidBlock(Blocks::never));
    }
    
    // CEILING_LIGHT
    public static Block WHITE_CEILING_LIGHT = createCeilingLight(DyeColor.WHITE);
    public static Block ORANGE_CEILING_LIGHT = createCeilingLight(DyeColor.LIGHT_GRAY);
    public static Block MAGENTA_CEILING_LIGHT = createCeilingLight(DyeColor.GRAY);
    public static Block LIGHT_BLUE_CEILING_LIGHT = createCeilingLight(DyeColor.BLACK);
    public static Block YELLOW_CEILING_LIGHT = createCeilingLight(DyeColor.BROWN);
    public static Block LIME_CEILING_LIGHT = createCeilingLight(DyeColor.RED);
    public static Block PINK_CEILING_LIGHT = createCeilingLight(DyeColor.ORANGE);
    public static Block GRAY_CEILING_LIGHT = createCeilingLight(DyeColor.YELLOW);
    public static Block LIGHT_GRAY_CEILING_LIGHT = createCeilingLight(DyeColor.LIME);
    public static Block CYAN_CEILING_LIGHT = createCeilingLight(DyeColor.GREEN);
    public static Block PURPLE_CEILING_LIGHT = createCeilingLight(DyeColor.CYAN);
    public static Block BLUE_CEILING_LIGHT = createCeilingLight(DyeColor.LIGHT_BLUE);
    public static Block BROWN_CEILING_LIGHT = createCeilingLight(DyeColor.BLUE);
    public static Block GREEN_CEILING_LIGHT = createCeilingLight(DyeColor.PURPLE);
    public static Block RED_CEILING_LIGHT = createCeilingLight(DyeColor.MAGENTA);
    public static Block BLACK_CEILING_LIGHT = createCeilingLight(DyeColor.PINK);
    
    public static Block createCeilingLight(DyeColor mapcolor) {
        return new CeilingLightBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.HAT).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(Blocks.createLightLevelFromLitBlockState(15)).solidBlock(Blocks::never));
    }
    
    // FLOOR_LIGHTS
    public static Block WHITE_FLOOR_LIGHT = createFloorLight(DyeColor.WHITE);
    public static Block ORANGE_FLOOR_LIGHT = createFloorLight(DyeColor.LIGHT_GRAY);
    public static Block MAGENTA_FLOOR_LIGHT = createFloorLight(DyeColor.GRAY);
    public static Block LIGHT_BLUE_FLOOR_LIGHT = createFloorLight(DyeColor.BLACK);
    public static Block YELLOW_FLOOR_LIGHT = createFloorLight(DyeColor.BROWN);
    public static Block LIME_FLOOR_LIGHT = createFloorLight(DyeColor.RED);
    public static Block PINK_FLOOR_LIGHT = createFloorLight(DyeColor.ORANGE);
    public static Block GRAY_FLOOR_LIGHT = createFloorLight(DyeColor.YELLOW);
    public static Block LIGHT_GRAY_FLOOR_LIGHT = createFloorLight(DyeColor.LIME);
    public static Block CYAN_FLOOR_LIGHT = createFloorLight(DyeColor.GREEN);
    public static Block PURPLE_FLOOR_LIGHT = createFloorLight(DyeColor.CYAN);
    public static Block BLUE_FLOOR_LIGHT = createFloorLight(DyeColor.LIGHT_BLUE);
    public static Block BROWN_FLOOR_LIGHT = createFloorLight(DyeColor.BLUE);
    public static Block GREEN_FLOOR_LIGHT = createFloorLight(DyeColor.PURPLE);
    public static Block RED_FLOOR_LIGHT = createFloorLight(DyeColor.MAGENTA);
    public static Block BLACK_FLOOR_LIGHT = createFloorLight(DyeColor.PINK);

    public static Block createFloorLight(DyeColor mapcolor) {
        return new FloorLightBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.HAT).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(Blocks.createLightLevelFromLitBlockState(15)).solidBlock(Blocks::never));
    }
    
    // LIGHT_BULBS
    public static Block WHITE_LIGHT_BULB = createLightBulb(DyeColor.WHITE);
    public static Block ORANGE_LIGHT_BULB = createLightBulb(DyeColor.LIGHT_GRAY);
    public static Block MAGENTA_LIGHT_BULB = createLightBulb(DyeColor.GRAY);
    public static Block LIGHT_BLUE_LIGHT_BULB = createLightBulb(DyeColor.BLACK);
    public static Block YELLOW_LIGHT_BULB = createLightBulb(DyeColor.BROWN);
    public static Block LIME_LIGHT_BULB = createLightBulb(DyeColor.RED);
    public static Block PINK_LIGHT_BULB = createLightBulb(DyeColor.ORANGE);
    public static Block GRAY_LIGHT_BULB = createLightBulb(DyeColor.YELLOW);
    public static Block LIGHT_GRAY_LIGHT_BULB = createLightBulb(DyeColor.LIME);
    public static Block CYAN_LIGHT_BULB = createLightBulb(DyeColor.GREEN);
    public static Block PURPLE_LIGHT_BULB = createLightBulb(DyeColor.CYAN);
    public static Block BLUE_LIGHT_BULB = createLightBulb(DyeColor.LIGHT_BLUE);
    public static Block BROWN_LIGHT_BULB = createLightBulb(DyeColor.BLUE);
    public static Block GREEN_LIGHT_BULB = createLightBulb(DyeColor.PURPLE);
    public static Block RED_LIGHT_BULB = createLightBulb(DyeColor.MAGENTA);
    public static Block BLACK_LIGHT_BULB = createLightBulb(DyeColor.PINK);

    public static Block createLightBulb(DyeColor mapcolor) {
        return new LightBulbBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.HAT).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(Blocks.createLightLevelFromLitBlockState(15)).solidBlock(Blocks::never));
    }
    
    // LIGHT_FIXTURE
    public static Block WHITE_LIGHT_FIXTURE = createLightFixture(DyeColor.WHITE);
    public static Block ORANGE_LIGHT_FIXTURE = createLightFixture(DyeColor.LIGHT_GRAY);
    public static Block MAGENTA_LIGHT_FIXTURE = createLightFixture(DyeColor.GRAY);
    public static Block LIGHT_BLUE_LIGHT_FIXTURE = createLightFixture(DyeColor.BLACK);
    public static Block YELLOW_LIGHT_FIXTURE = createLightFixture(DyeColor.BROWN);
    public static Block LIME_LIGHT_FIXTURE = createLightFixture(DyeColor.RED);
    public static Block PINK_LIGHT_FIXTURE = createLightFixture(DyeColor.ORANGE);
    public static Block GRAY_LIGHT_FIXTURE = createLightFixture(DyeColor.YELLOW);
    public static Block LIGHT_GRAY_LIGHT_FIXTURE = createLightFixture(DyeColor.LIME);
    public static Block CYAN_LIGHT_FIXTURE = createLightFixture(DyeColor.GREEN);
    public static Block PURPLE_LIGHT_FIXTURE = createLightFixture(DyeColor.CYAN);
    public static Block BLUE_LIGHT_FIXTURE = createLightFixture(DyeColor.LIGHT_BLUE);
    public static Block BROWN_LIGHT_FIXTURE = createLightFixture(DyeColor.BLUE);
    public static Block GREEN_LIGHT_FIXTURE = createLightFixture(DyeColor.PURPLE);
    public static Block RED_LIGHT_FIXTURE = createLightFixture(DyeColor.MAGENTA);
    public static Block BLACK_LIGHT_FIXTURE = createLightFixture(DyeColor.PINK);
    
    public static Block createLightFixture(DyeColor mapcolor) {
        return new LightFixtureBlock(FabricBlockSettings.create().mapColor(mapcolor).instrument(Instrument.HAT).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(Blocks.createLightLevelFromLitBlockState(15)).solidBlock(Blocks::never));
    }

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_candle_stick"), COPPER_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_white_candle_stick"), COPPER_WHITE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_light_gray_candle_stick"), COPPER_LIGHT_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_gray_candle_stick"), COPPER_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_black_candle_stick"), COPPER_BLACK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_brown_candle_stick"), COPPER_BROWN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_red_candle_stick"), COPPER_RED_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_orange_candle_stick"), COPPER_ORANGE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_yellow_candle_stick"), COPPER_YELLOW_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_lime_candle_stick"), COPPER_LIME_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_green_candle_stick"), COPPER_GREEN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_cyan_candle_stick"), COPPER_CYAN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_light_blue_candle_stick"), COPPER_LIGHT_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_blue_candle_stick"), COPPER_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_purple_candle_stick"), COPPER_PURPLE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_magenta_candle_stick"), COPPER_MAGENTA_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "copper_pink_candle_stick"), COPPER_PINK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_candle_stick"), DIAMOND_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_white_candle_stick"), DIAMOND_WHITE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_light_gray_candle_stick"), DIAMOND_LIGHT_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_gray_candle_stick"), DIAMOND_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_black_candle_stick"), DIAMOND_BLACK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_brown_candle_stick"), DIAMOND_BROWN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_red_candle_stick"), DIAMOND_RED_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_orange_candle_stick"), DIAMOND_ORANGE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_yellow_candle_stick"), DIAMOND_YELLOW_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_lime_candle_stick"), DIAMOND_LIME_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_green_candle_stick"), DIAMOND_GREEN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_cyan_candle_stick"), DIAMOND_CYAN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_light_blue_candle_stick"), DIAMOND_LIGHT_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_blue_candle_stick"), DIAMOND_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_purple_candle_stick"), DIAMOND_PURPLE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_magenta_candle_stick"), DIAMOND_MAGENTA_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "diamond_pink_candle_stick"), DIAMOND_PINK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_candle_stick"), GOLD_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_white_candle_stick"), GOLD_WHITE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_light_gray_candle_stick"), GOLD_LIGHT_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_gray_candle_stick"), GOLD_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_black_candle_stick"), GOLD_BLACK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_brown_candle_stick"), GOLD_BROWN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_red_candle_stick"), GOLD_RED_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_orange_candle_stick"), GOLD_ORANGE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_yellow_candle_stick"), GOLD_YELLOW_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_lime_candle_stick"), GOLD_LIME_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_green_candle_stick"), GOLD_GREEN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_cyan_candle_stick"), GOLD_CYAN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_light_blue_candle_stick"), GOLD_LIGHT_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_blue_candle_stick"), GOLD_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_purple_candle_stick"), GOLD_PURPLE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_magenta_candle_stick"), GOLD_MAGENTA_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gold_pink_candle_stick"), GOLD_PINK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_candle_stick"), IRON_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_white_candle_stick"), IRON_WHITE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_light_gray_candle_stick"), IRON_LIGHT_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_gray_candle_stick"), IRON_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_black_candle_stick"), IRON_BLACK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_brown_candle_stick"), IRON_BROWN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_red_candle_stick"), IRON_RED_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_orange_candle_stick"), IRON_ORANGE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_yellow_candle_stick"), IRON_YELLOW_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_lime_candle_stick"), IRON_LIME_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_green_candle_stick"), IRON_GREEN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_cyan_candle_stick"), IRON_CYAN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_light_blue_candle_stick"), IRON_LIGHT_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_blue_candle_stick"), IRON_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_purple_candle_stick"), IRON_PURPLE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_magenta_candle_stick"), IRON_MAGENTA_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "iron_pink_candle_stick"), IRON_PINK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_candle_stick"), NETHERITE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_white_candle_stick"), NETHERITE_WHITE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_light_gray_candle_stick"), NETHERITE_LIGHT_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_gray_candle_stick"), NETHERITE_GRAY_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_black_candle_stick"), NETHERITE_BLACK_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_brown_candle_stick"), NETHERITE_BROWN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_red_candle_stick"), NETHERITE_RED_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_orange_candle_stick"), NETHERITE_ORANGE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_yellow_candle_stick"), NETHERITE_YELLOW_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_lime_candle_stick"), NETHERITE_LIME_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_green_candle_stick"), NETHERITE_GREEN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_cyan_candle_stick"), NETHERITE_CYAN_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_light_blue_candle_stick"), NETHERITE_LIGHT_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_blue_candle_stick"), NETHERITE_BLUE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_purple_candle_stick"), NETHERITE_PURPLE_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_magenta_candle_stick"), NETHERITE_MAGENTA_CANDLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "netherite_pink_candle_stick"), NETHERITE_PINK_CANDLE_STICK);

        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "white_ceiling_light"), WHITE_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "orange_ceiling_light"), ORANGE_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "magenta_ceiling_light"), MAGENTA_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "light_blue_ceiling_light"), LIGHT_BLUE_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "yellow_ceiling_light"), YELLOW_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "lime_ceiling_light"), LIME_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "pink_ceiling_light"), PINK_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gray_ceiling_light"), GRAY_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "light_gray_ceiling_light"), LIGHT_GRAY_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "cyan_ceiling_light"), CYAN_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "purple_ceiling_light"), PURPLE_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "blue_ceiling_light"), BLUE_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "brown_ceiling_light"), BROWN_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "green_ceiling_light"), GREEN_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "red_ceiling_light"), RED_CEILING_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "black_ceiling_light"), BLACK_CEILING_LIGHT);

        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "white_floor_light"), WHITE_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "orange_floor_light"), ORANGE_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "magenta_floor_light"), MAGENTA_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "light_blue_floor_light"), LIGHT_BLUE_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "yellow_floor_light"), YELLOW_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "lime_floor_light"), LIME_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "pink_floor_light"), PINK_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gray_floor_light"), GRAY_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "light_gray_floor_light"), LIGHT_GRAY_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "cyan_floor_light"), CYAN_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "purple_floor_light"), PURPLE_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "blue_floor_light"), BLUE_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "brown_floor_light"), BROWN_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "green_floor_light"), GREEN_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "red_floor_light"), RED_FLOOR_LIGHT);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "black_floor_light"), BLACK_FLOOR_LIGHT);

        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "white_light_bulb"), WHITE_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "orange_light_bulb"), ORANGE_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "magenta_light_bulb"), MAGENTA_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "light_blue_light_bulb"), LIGHT_BLUE_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "yellow_light_bulb"), YELLOW_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "lime_light_bulb"), LIME_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "pink_light_bulb"), PINK_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gray_light_bulb"), GRAY_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "light_gray_light_bulb"), LIGHT_GRAY_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "cyan_light_bulb"), CYAN_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "purple_light_bulb"), PURPLE_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "blue_light_bulb"), BLUE_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "brown_light_bulb"), BROWN_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "green_light_bulb"), GREEN_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "red_light_bulb"), RED_LIGHT_BULB);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "black_light_bulb"), BLACK_LIGHT_BULB);

        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "white_light_fixture"), WHITE_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "orange_light_fixture"), ORANGE_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "magenta_light_fixture"), MAGENTA_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "light_blue_light_fixture"), LIGHT_BLUE_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "yellow_light_fixture"), YELLOW_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "lime_light_fixture"), LIME_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "pink_light_fixture"), PINK_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "gray_light_fixture"), GRAY_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "light_gray_light_fixture"), LIGHT_GRAY_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "cyan_light_fixture"), CYAN_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "purple_light_fixture"), PURPLE_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "blue_light_fixture"), BLUE_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "brown_light_fixture"), BROWN_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "green_light_fixture"), GREEN_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "red_light_fixture"), RED_LIGHT_FIXTURE);
        Registry.register(Registries.BLOCK, new Identifier(Bright.MOD_ID, "black_light_fixture"), BLACK_LIGHT_FIXTURE);
    }
}
