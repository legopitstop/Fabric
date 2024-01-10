package com.legopitstop.basaltblocks.registry;

import com.legopitstop.basaltblocks.BasaltBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BasaltBlockItems {
    public static final Item BASALT_SLAB = new BlockItem(BasaltBlockBlocks.BASALT_SLAB, new FabricItemSettings());
    public static final Item BASALT_STAIRS = new BlockItem(BasaltBlockBlocks.BASALT_STAIRS, new FabricItemSettings());
    public static final Item BASALT_WALL = new BlockItem(BasaltBlockBlocks.BASALT_WALL, new FabricItemSettings());
    public static final Item BASALT_BUTTON = new BlockItem(BasaltBlockBlocks.BASALT_BUTTON, new FabricItemSettings());
    public static final Item BASALT_PRESSURE_PLATE = new BlockItem(BasaltBlockBlocks.BASALT_PRESSURE_PLATE, new FabricItemSettings());
    public static final Item SMOOTH_BASALT_SLAB = new BlockItem(BasaltBlockBlocks.SMOOTH_BASALT_SLAB, new FabricItemSettings());
    public static final Item SMOOTH_BASALT_STAIRS = new BlockItem(BasaltBlockBlocks.SMOOTH_BASALT_STAIRS, new FabricItemSettings());
    public static final Item SMOOTH_BASALT_WALL = new BlockItem(BasaltBlockBlocks.SMOOTH_BASALT_WALL, new FabricItemSettings());
    public static final Item SMOOTH_BASALT_BUTTON = new BlockItem(BasaltBlockBlocks.SMOOTH_BASALT_BUTTON, new FabricItemSettings());
    public static final Item SMOOTH_BASALT_PRESSURE_PLATE = new BlockItem(BasaltBlockBlocks.SMOOTH_BASALT_PRESSURE_PLATE, new FabricItemSettings());
    public static final Item CHISELED_POLISHED_BASALT = new BlockItem(BasaltBlockBlocks.CHISELED_POLISHED_BASALT, new FabricItemSettings());
    public static final Item POLISHED_BASALT_SLAB = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_SLAB, new FabricItemSettings());
    public static final Item POLISHED_BASALT_STAIRS = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_STAIRS, new FabricItemSettings());
    public static final Item POLISHED_BASALT_WALL = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_WALL, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BUTTON = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BUTTON, new FabricItemSettings());
    public static final Item POLISHED_BASALT_PRESSURE_PLATE = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_PRESSURE_PLATE, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICK_DOOR = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICK_DOOR, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICK_TRAPDOOR = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICK_TRAPDOOR, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICKS = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICKS, new FabricItemSettings());
    public static final Item CRACKED_POLISHED_BASALT_BRICKS = new BlockItem(BasaltBlockBlocks.CRACKED_POLISHED_BASALT_BRICKS, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICK_PILLAR = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICK_PILLAR, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICK_SLAB = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICK_SLAB, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICK_STAIRS = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICK_STAIRS, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICK_WALL = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICK_WALL, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICK_BUTTON = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICK_BUTTON, new FabricItemSettings());
    public static final Item POLISHED_BASALT_BRICK_PRESSURE_PLATE = new BlockItem(BasaltBlockBlocks.POLISHED_BASALT_BRICK_PRESSURE_PLATE, new FabricItemSettings());
    public static final Item COBBLED_BASALT = new BlockItem(BasaltBlockBlocks.COBBLED_BASALT, new FabricItemSettings());
    public static final Item COBBLED_BASALT_SLAB = new BlockItem(BasaltBlockBlocks.COBBLED_BASALT_SLAB, new FabricItemSettings());
    public static final Item COBBLED_BASALT_STAIRS = new BlockItem(BasaltBlockBlocks.COBBLED_BASALT_STAIRS, new FabricItemSettings());
    public static final Item COBBLED_BASALT_WALL = new BlockItem(BasaltBlockBlocks.COBBLED_BASALT_WALL, new FabricItemSettings());
    public static final Item COBBLED_BASALT_BUTTON = new BlockItem(BasaltBlockBlocks.COBBLED_BASALT_BUTTON, new FabricItemSettings());
    public static final Item COBBLED_BASALT_PRESSURE_PLATE = new BlockItem(BasaltBlockBlocks.COBBLED_BASALT_PRESSURE_PLATE, new FabricItemSettings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_slab"), BASALT_SLAB);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_stairs"), BASALT_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_wall"), BASALT_WALL);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_button"), BASALT_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_pressure_plate"), BASALT_PRESSURE_PLATE);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_slab"), SMOOTH_BASALT_SLAB);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_stairs"), SMOOTH_BASALT_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_wall"), SMOOTH_BASALT_WALL);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_button"), SMOOTH_BASALT_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "smooth_basalt_pressure_plate"), SMOOTH_BASALT_PRESSURE_PLATE);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "chiseled_polished_basalt"), CHISELED_POLISHED_BASALT);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_slab"), POLISHED_BASALT_SLAB);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_stairs"), POLISHED_BASALT_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_wall"), POLISHED_BASALT_WALL);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_button"), POLISHED_BASALT_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_pressure_plate"), POLISHED_BASALT_PRESSURE_PLATE);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_door"), POLISHED_BASALT_BRICK_DOOR);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_trapdoor"), POLISHED_BASALT_BRICK_TRAPDOOR);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_bricks"), POLISHED_BASALT_BRICKS);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "cracked_polished_basalt_bricks"), CRACKED_POLISHED_BASALT_BRICKS);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_pillar"), POLISHED_BASALT_BRICK_PILLAR);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_slab"), POLISHED_BASALT_BRICK_SLAB);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_stairs"), POLISHED_BASALT_BRICK_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_wall"), POLISHED_BASALT_BRICK_WALL);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_button"), POLISHED_BASALT_BRICK_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "polished_basalt_brick_pressure_plate"), POLISHED_BASALT_BRICK_PRESSURE_PLATE);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone"), COBBLED_BASALT);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_slab"), COBBLED_BASALT_SLAB);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_stairs"), COBBLED_BASALT_STAIRS);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_wall"), COBBLED_BASALT_WALL);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_button"), COBBLED_BASALT_BUTTON);
        Registry.register(Registries.ITEM, new Identifier(BasaltBlocks.MOD_ID, "basalt_cobblestone_pressure_plate"), COBBLED_BASALT_PRESSURE_PLATE);
    }
}
