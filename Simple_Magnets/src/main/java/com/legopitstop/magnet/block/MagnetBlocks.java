package com.legopitstop.magnet.block;

import com.legopitstop.magnet.SimpleMagnets;
import com.legopitstop.magnet.block.MagnetBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MagnetBlocks {
    public static final Block IRON_MAGNET_BLOCK = createMagnetBlock(3.425, 10);
    public static final Block GOLD_MAGNET_BLOCK = createMagnetBlock(5.425, 8);
    public static final Block COPPER_MAGNET_BLOCK = createMagnetBlock(7.425, 6);
    public static final Block DIAMOND_MAGNET_BLOCK = createMagnetBlock(9.425, 4);
    public static final Block NETHERITE_MAGNET_BLOCK = createMagnetBlock(11.425, 2);

    public static Block createMagnetBlock(double radius, int delay) {
        return new MagnetBlock(radius, delay, FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).strength(1.5f).solid().pistonBehavior(PistonBehavior.NORMAL).ticksRandomly());
    }
    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(SimpleMagnets.MOD_ID, "copper_magnet_block"), COPPER_MAGNET_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(SimpleMagnets.MOD_ID, "diamond_magnet_block"), DIAMOND_MAGNET_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(SimpleMagnets.MOD_ID, "gold_magnet_block"), GOLD_MAGNET_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(SimpleMagnets.MOD_ID, "iron_magnet_block"), IRON_MAGNET_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(SimpleMagnets.MOD_ID, "netherite_magnet_block"), NETHERITE_MAGNET_BLOCK);
    }
}
