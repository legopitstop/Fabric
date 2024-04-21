package dev.lpsmods.basaltblocks.registry;

import dev.lpsmods.basaltblocks.BasaltBlocks;
import dev.lpsmods.basaltblocks.block.BasaltSetType;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BasaltBlockBlocks {
    public static final Block BASALT_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block BASALT_STAIRS = new StairsBlock(Blocks.BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block BASALT_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block BASALT_BUTTON = new ButtonBlock(BasaltSetType.BASALT, 30, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block BASALT_PRESSURE_PLATE = new PressurePlateBlock(BasaltSetType.BASALT,  FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block SMOOTH_BASALT_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block SMOOTH_BASALT_STAIRS = new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block SMOOTH_BASALT_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block SMOOTH_BASALT_BUTTON = new ButtonBlock(BasaltSetType.BASALT, 30, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block SMOOTH_BASALT_PRESSURE_PLATE = new PressurePlateBlock(BasaltSetType.BASALT, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block CHISELED_POLISHED_BASALT = new Block(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_STAIRS = new StairsBlock(Blocks.POLISHED_BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BUTTON = new ButtonBlock(BasaltSetType.BASALT, 30, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_PRESSURE_PLATE = new PressurePlateBlock(BasaltSetType.BASALT, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICK_DOOR = new DoorBlock(BasaltSetType.BASALT, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICK_TRAPDOOR = new TrapdoorBlock(BasaltSetType.BASALT, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block CRACKED_POLISHED_BASALT_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICK_PILLAR = new PillarBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICK_STAIRS = new StairsBlock(POLISHED_BASALT_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICK_BUTTON = new ButtonBlock(BasaltSetType.BASALT, 30, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block POLISHED_BASALT_BRICK_PRESSURE_PLATE = new PressurePlateBlock(BasaltSetType.BASALT, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block COBBLED_BASALT = new Block(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block COBBLED_BASALT_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block COBBLED_BASALT_STAIRS = new StairsBlock(COBBLED_BASALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block COBBLED_BASALT_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block COBBLED_BASALT_BUTTON = new ButtonBlock(BasaltSetType.BASALT, 30, FabricBlockSettings.copyOf(Blocks.BASALT));
    public static final Block COBBLED_BASALT_PRESSURE_PLATE = new PressurePlateBlock(BasaltSetType.BASALT, FabricBlockSettings.copyOf(Blocks.BASALT));
    
    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_slab"), BASALT_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_stairs"), BASALT_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_wall"), BASALT_WALL);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_button"), BASALT_BUTTON);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_pressure_plate"), BASALT_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_slab"), SMOOTH_BASALT_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_stairs"), SMOOTH_BASALT_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_wall"), SMOOTH_BASALT_WALL);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_button"), SMOOTH_BASALT_BUTTON);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_pressure_plate"), SMOOTH_BASALT_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "chiseled_polished_basalt"), CHISELED_POLISHED_BASALT);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_slab"), POLISHED_BASALT_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_stairs"), POLISHED_BASALT_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_wall"), POLISHED_BASALT_WALL);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_button"), POLISHED_BASALT_BUTTON);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_pressure_plate"), POLISHED_BASALT_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_door"), POLISHED_BASALT_BRICK_DOOR);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_trapdoor"), POLISHED_BASALT_BRICK_TRAPDOOR);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_bricks"), POLISHED_BASALT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "cracked_polished_basalt_bricks"), CRACKED_POLISHED_BASALT_BRICKS);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_pillar"), POLISHED_BASALT_BRICK_PILLAR);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_slab"), POLISHED_BASALT_BRICK_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_stairs"), POLISHED_BASALT_BRICK_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_wall"), POLISHED_BASALT_BRICK_WALL);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_button"), POLISHED_BASALT_BRICK_BUTTON);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_pressure_plate"), POLISHED_BASALT_BRICK_PRESSURE_PLATE);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone"), COBBLED_BASALT);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_slab"), COBBLED_BASALT_SLAB);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_stairs"), COBBLED_BASALT_STAIRS);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_wall"), COBBLED_BASALT_WALL);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_button"), COBBLED_BASALT_BUTTON);
        Registry.register(Registries.BLOCK, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_pressure_plate"), COBBLED_BASALT_PRESSURE_PLATE);
    }
}
