package dev.lpsmods.magnet.item;

import dev.lpsmods.magnet.SimpleMagnets;
import dev.lpsmods.magnet.block.MagnetBlocks;
import net.fabricmc.fabric.api.item.v1.Item.Settings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MagnetItems {
    
    public static final Item IRON_MAGNET = new MagnetItem(ToolMaterials.IRON,3.425, 100, new Item.Settings().maxCount(1));
    public static final Item GOLD_MAGNET = new MagnetItem(ToolMaterials.GOLD,5.425, 80, new Item.Settings().maxCount(1));
    public static final Item COPPER_MAGNET = new MagnetItem(MagnetToolMaterials.COPPER,7.425, 60,new Item.Settings().maxCount(1));
    public static final Item DIAMOND_MAGNET = new MagnetItem(ToolMaterials.DIAMOND,9.425, 40,new Item.Settings().maxCount(1));
    public static final Item NETHERITE_MAGNET = new MagnetItem(ToolMaterials.NETHERITE,11.425, 20,new Item.Settings().maxCount(1));

    public static final Item COPPER_MAGNET_BLOCK = new BlockItem(MagnetBlocks.COPPER_MAGNET_BLOCK, new Item.Settings());
    public static final Item DIAMOND_MAGNET_BLOCK = new BlockItem(MagnetBlocks.DIAMOND_MAGNET_BLOCK, new Item.Settings());
    public static final Item GOLD_MAGNET_BLOCK = new BlockItem(MagnetBlocks.GOLD_MAGNET_BLOCK, new Item.Settings());
    public static final Item IRON_MAGNET_BLOCK = new BlockItem(MagnetBlocks.IRON_MAGNET_BLOCK, new Item.Settings());
    public static final Item NETHERITE_MAGNET_BLOCK = new BlockItem(MagnetBlocks.NETHERITE_MAGNET_BLOCK, new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "copper_magnet"), COPPER_MAGNET);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "diamond_magnet"), DIAMOND_MAGNET);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "gold_magnet"), GOLD_MAGNET);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "iron_magnet"), IRON_MAGNET);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "netherite_magnet"), NETHERITE_MAGNET);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "copper_magnet_block"), COPPER_MAGNET_BLOCK);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "diamond_magnet_block"), DIAMOND_MAGNET_BLOCK);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "gold_magnet_block"), GOLD_MAGNET_BLOCK);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "iron_magnet_block"), IRON_MAGNET_BLOCK);
        Registry.register(Registries.ITEM, Identifier.of(SimpleMagnets.MOD_ID, "netherite_magnet_block"), NETHERITE_MAGNET_BLOCK);
    }
}
