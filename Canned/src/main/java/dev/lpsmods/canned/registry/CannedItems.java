package dev.lpsmods.canned.registry;

import dev.lpsmods.canned.Canned;
import dev.lpsmods.canned.item.CanFoodItem;
import dev.lpsmods.canned.item.CanOpenerItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CannedItems {
    public static final Item CAN_OPENER = new CanOpenerItem(ToolMaterials.IRON,  new Item.Settings().attributeModifiers(CanOpenerItem.createAttributeModifiers(ToolMaterials.IRON, 1, -3.1f)));
    public static final Item CAN = new BlockItem(CannedBlocks.CAN, new Item.Settings());
    public static final Item APPLE_CAN = new CanFoodItem(CannedBlocks.APPLE_CAN, Items.APPLE, new Item.Settings());
    public static final Item BAKED_POTATO_CAN = new CanFoodItem(CannedBlocks.BAKED_POTATO_CAN, Items.BAKED_POTATO, new Item.Settings());
    public static final Item BEETROOT_CAN = new CanFoodItem(CannedBlocks.BEETROOT_CAN, Items.BEETROOT, new Item.Settings());
    public static final Item BEETROOT_SOUP_CAN = new CanFoodItem(CannedBlocks.BEETROOT_SOUP_CAN, Items.BEETROOT_SOUP, new Item.Settings());
    public static final Item BREAD_CAN = new CanFoodItem(CannedBlocks.BREAD_CAN, Items.BREAD, new Item.Settings());
    public static final Item CAKE_CAN = new CanFoodItem(CannedBlocks.CAKE_CAN, Items.CAKE, new Item.Settings());
    public static final Item CARROT_CAN = new CanFoodItem(CannedBlocks.CARROT_CAN, Items.CARROT, new Item.Settings());
    public static final Item CHORUS_FRUIT_CAN = new CanFoodItem(CannedBlocks.CHORUS_FRUIT_CAN, Items.CHORUS_FRUIT, new Item.Settings());
    public static final Item COOKED_BEEF_CAN = new CanFoodItem(CannedBlocks.COOKED_BEEF_CAN, Items.COOKED_BEEF, new Item.Settings());
    public static final Item COOKED_CHICKEN_CAN = new CanFoodItem(CannedBlocks.COOKED_CHICKEN_CAN, Items.COOKED_CHICKEN, new Item.Settings());
    public static final Item COOKED_COD_CAN = new CanFoodItem(CannedBlocks.COOKED_COD_CAN, Items.COOKED_COD, new Item.Settings());
    public static final Item COOKED_MUTTON_CAN = new CanFoodItem(CannedBlocks.COOKED_MUTTON_CAN, Items.COOKED_MUTTON, new Item.Settings());
    public static final Item COOKED_PORKCHOP_CAN = new CanFoodItem(CannedBlocks.COOKED_PORKCHOP_CAN, Items.COOKED_PORKCHOP, new Item.Settings());
    public static final Item COOKED_RABBIT_CAN = new CanFoodItem(CannedBlocks.COOKED_RABBIT_CAN, Items.COOKED_RABBIT, new Item.Settings());
    public static final Item COOKED_SALMON_CAN = new CanFoodItem(CannedBlocks.COOKED_SALMON_CAN, Items.COOKED_SALMON, new Item.Settings());
    public static final Item COOKIE_CAN = new CanFoodItem(CannedBlocks.COOKIE_CAN, Items.COOKIE, new Item.Settings());
    public static final Item DRIED_KELP_CAN = new CanFoodItem(CannedBlocks.DRIED_KELP_CAN, Items.DRIED_KELP, new Item.Settings());
    public static final Item ENCHANTED_GOLDEN_APPLE_CAN = new CanFoodItem(CannedBlocks.ENCHANTED_GOLDEN_APPLE_CAN, Items.ENCHANTED_GOLDEN_APPLE, new Item.Settings());
    public static final Item GLOW_BERRIES_CAN = new CanFoodItem(CannedBlocks.GLOW_BERRIES_CAN, Items.GLOW_BERRIES, new Item.Settings());
    public static final Item GOLDEN_APPLE_CAN = new CanFoodItem(CannedBlocks.GOLDEN_APPLE_CAN, Items.GOLDEN_APPLE, new Item.Settings());
    public static final Item GOLDEN_CARROT_CAN = new CanFoodItem(CannedBlocks.GOLDEN_CARROT_CAN, Items.GOLDEN_CARROT, new Item.Settings());
    public static final Item HONEY_CAN = new CanFoodItem(CannedBlocks.HONEY_CAN, Items.HONEY_BOTTLE, new Item.Settings());
    public static final Item MELON_CAN = new CanFoodItem(CannedBlocks.MELON_CAN, Items.MELON, new Item.Settings());
    public static final Item MUSHROOM_STEW_CAN = new CanFoodItem(CannedBlocks.MUSHROOM_STEW_CAN, Items.MUSHROOM_STEW, new Item.Settings());
    public static final Item POISONOUS_POTATO_CAN = new CanFoodItem(CannedBlocks.POISONOUS_POTATO_CAN, Items.POISONOUS_POTATO, new Item.Settings());
    public static final Item POTATO_CAN = new CanFoodItem(CannedBlocks.POTATO_CAN, Items.POTATO, new Item.Settings());
    public static final Item PUFFERFISH_CAN = new CanFoodItem(CannedBlocks.PUFFERFISH_CAN, Items.PUFFERFISH, new Item.Settings());
    public static final Item PUMPKIN_PIE_CAN = new CanFoodItem(CannedBlocks.PUMPKIN_PIE_CAN, Items.PUMPKIN_PIE, new Item.Settings());
    public static final Item RABBIT_STEW_CAN = new CanFoodItem(CannedBlocks.RABBIT_STEW_CAN, Items.RABBIT_STEW, new Item.Settings());
    public static final Item ROTTEN_FLESH_CAN = new CanFoodItem(CannedBlocks.ROTTEN_FLESH_CAN, Items.ROTTEN_FLESH, new Item.Settings());
    public static final Item SPIDER_EYE_CAN = new CanFoodItem(CannedBlocks.SPIDER_EYE_CAN, Items.SPIDER_EYE, new Item.Settings());
    public static final Item SUSPICIOUS_STEW_CAN = new CanFoodItem(CannedBlocks.SUSPICIOUS_STEW_CAN, Items.SUSPICIOUS_STEW, new Item.Settings());
    public static final Item SWEET_BERRIES_CAN = new CanFoodItem(CannedBlocks.SWEET_BERRIES_CAN, Items.SWEET_BERRIES, new Item.Settings());
    public static final Item TROPICAL_FISH_CAN = new CanFoodItem(CannedBlocks.TROPICAL_FISH_CAN, Items.TROPICAL_FISH, new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "can_opener"), CAN_OPENER);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "can"), CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "apple_can"), APPLE_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "baked_potato_can"), BAKED_POTATO_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "beetroot_can"), BEETROOT_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "beetroot_soup_can"), BEETROOT_SOUP_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "bread_can"), BREAD_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cake_can"), CAKE_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "carrot_can"), CARROT_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "chorus_fruit_can"), CHORUS_FRUIT_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cooked_beef_can"), COOKED_BEEF_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cooked_chicken_can"), COOKED_CHICKEN_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cooked_cod_can"), COOKED_COD_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cooked_mutton_can"), COOKED_MUTTON_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cooked_porkchop_can"), COOKED_PORKCHOP_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cooked_rabbit_can"), COOKED_RABBIT_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cooked_salmon_can"), COOKED_SALMON_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "cookie_can"), COOKIE_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "dried_kelp_can"), DRIED_KELP_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "enchanted_golden_apple_can"), ENCHANTED_GOLDEN_APPLE_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "glow_berries_can"), GLOW_BERRIES_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "golden_apple_can"), GOLDEN_APPLE_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "golden_carrot_can"), GOLDEN_CARROT_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "honey_can"), HONEY_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "melon_can"), MELON_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "mushroom_stew_can"), MUSHROOM_STEW_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "poisonous_potato_can"), POISONOUS_POTATO_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "potato_can"), POTATO_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "pufferfish_can"), PUFFERFISH_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "pumpkin_pie_can"), PUMPKIN_PIE_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "rabbit_stew_can"), RABBIT_STEW_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "rotten_flesh_can"), ROTTEN_FLESH_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "spider_eye_can"), SPIDER_EYE_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "suspicious_stew_can"), SUSPICIOUS_STEW_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "sweet_berries_can"), SWEET_BERRIES_CAN);
        Registry.register(Registries.ITEM, Identifier.of(Canned.MOD_ID, "tropical_fish_can"), TROPICAL_FISH_CAN);

    }
}
