package com.legopitstop.moregold.registry;

import com.legopitstop.moregold.MoreGold;
import com.legopitstop.moregold.item.EnchantedGoldenItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

// TODO
// - Golden crop should only drop 1 item
// - Golden Logs should have a chance to drop a nugget instead of log?
public class MoreGoldItems {
    // Create Items
    public static final Item GOLDEN_LOG = new BlockItem(MoreGoldBlocks.GOLDEN_LOG, new FabricItemSettings());
    public static final Item STRIPPED_GOLDEN_LOG = new BlockItem(MoreGoldBlocks.STRIPPED_GOLDEN_LOG, new FabricItemSettings());
    public static final Item GOLDEN_WOOD = new BlockItem(MoreGoldBlocks.GOLDEN_WOOD, new FabricItemSettings());
    public static final Item STRIPPED_GOLDEN_WOOD = new BlockItem(MoreGoldBlocks.STRIPPED_GOLDEN_WOOD, new FabricItemSettings());
    public static final Item GOLDEN_FRUIT_SAPLING = new BlockItem(MoreGoldBlocks.GOLDEN_FRUIT_SAPLING, new FabricItemSettings());
    public static final Item GOLDEN_FRUIT_SEEDS = new BlockItem(MoreGoldBlocks.GOLDEN_FRUIT_CROP, new FabricItemSettings());

    public static final Item GOLDEN_BANANA = new Item(new FabricItemSettings().food(FoodComponents.GOLDEN_APPLE).rarity(Rarity.RARE));
    public static final Item GOLDEN_GRAPE = new Item(new FabricItemSettings().food(FoodComponents.GOLDEN_APPLE).rarity(Rarity.RARE));
    public static final Item GOLDEN_LEMON = new Item(new FabricItemSettings().food(FoodComponents.GOLDEN_APPLE).rarity(Rarity.RARE));
    public static final Item GOLDEN_ORANGE = new Item(new FabricItemSettings().food(FoodComponents.GOLDEN_APPLE).rarity(Rarity.RARE));
    public static final Item GOLDEN_STRAWBERRY = new Item(new FabricItemSettings().food(FoodComponents.GOLDEN_APPLE).rarity(Rarity.RARE));

    public static final Item ENCHANTED_GOLDEN_BANANA = new EnchantedGoldenItem(new FabricItemSettings().food(FoodComponents.ENCHANTED_GOLDEN_APPLE).rarity(Rarity.EPIC));
    public static final Item ENCHANTED_GOLDEN_GRAPE = new EnchantedGoldenItem(new FabricItemSettings().food(FoodComponents.ENCHANTED_GOLDEN_APPLE).rarity(Rarity.EPIC));
    public static final Item ENCHANTED_GOLDEN_LEMON = new EnchantedGoldenItem(new FabricItemSettings().food(FoodComponents.ENCHANTED_GOLDEN_APPLE).rarity(Rarity.EPIC));
    public static final Item ENCHANTED_GOLDEN_ORANGE = new EnchantedGoldenItem(new FabricItemSettings().food(FoodComponents.ENCHANTED_GOLDEN_APPLE).rarity(Rarity.EPIC));
    public static final Item ENCHANTED_GOLDEN_STRAWBERRY = new EnchantedGoldenItem(new FabricItemSettings().food(FoodComponents.ENCHANTED_GOLDEN_APPLE).rarity(Rarity.EPIC));

    public static void register() {
        // Register Items
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_wood"), GOLDEN_WOOD);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "stripped_golden_wood"), STRIPPED_GOLDEN_WOOD);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_log"), GOLDEN_LOG);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "stripped_golden_log"), STRIPPED_GOLDEN_LOG);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_fruit_sapling"), GOLDEN_FRUIT_SAPLING);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_fruit_seeds"), GOLDEN_FRUIT_SEEDS);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_banana"), GOLDEN_BANANA);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_grape"), GOLDEN_GRAPE);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_lemon"), GOLDEN_LEMON);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_orange"), GOLDEN_ORANGE);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "golden_strawberry"), GOLDEN_STRAWBERRY);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "enchanted_golden_banana"), ENCHANTED_GOLDEN_BANANA);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "enchanted_golden_grape"), ENCHANTED_GOLDEN_GRAPE);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "enchanted_golden_lemon"),ENCHANTED_GOLDEN_LEMON);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "enchanted_golden_orange"), ENCHANTED_GOLDEN_ORANGE);
        Registry.register(Registries.ITEM, new Identifier(MoreGold.MOD_ID, "enchanted_golden_strawberry"),ENCHANTED_GOLDEN_STRAWBERRY);
    }
}
