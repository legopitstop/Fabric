package com.legopitstop.morehoney.registry;

import com.legopitstop.morehoney.MoreHoney;
import com.legopitstop.morehoney.item.MoreHoneyFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreHoneyItems {
    // Create Items
    public static Item HONEY_PRESS = new BlockItem(MoreHoneyBlocks.HONEY_PRESS, new FabricItemSettings());
    public static Item HONEY_COOKED_BEEF = new Item(new FabricItemSettings().food(MoreHoneyFoodComponents.HONEY_COOKED_BEEF));
    public static Item HONEY_COOKED_CHICKEN = new Item(new FabricItemSettings().food(FoodComponents.APPLE));
    public static Item HONEY_COOKED_MUTTON = new Item(new FabricItemSettings().food(FoodComponents.APPLE));
    public static Item HONEY_COOKED_PORKCHOP = new Item(new FabricItemSettings().food(FoodComponents.APPLE));
    public static Item HONEY_COOKIE = new Item(new FabricItemSettings().food(FoodComponents.APPLE));
    public static Item HONEY_LEMON_TEA = new Item(new FabricItemSettings().food(FoodComponents.APPLE));
    public static Item HONEY_PANCAKES = new Item(new FabricItemSettings().food(FoodComponents.APPLE));
    public static Item HONEY_SANDWICH = new Item(new FabricItemSettings().food(FoodComponents.APPLE));
    public static Item HONEY_TOASTIE = new Item(new FabricItemSettings().food(FoodComponents.APPLE));
    public static Item HONEY_WAFFLE = new Item(new FabricItemSettings().food(FoodComponents.APPLE));

    public static void register() {
        // Register Items
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_press"), HONEY_PRESS);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_cooked_beef"), HONEY_COOKED_BEEF);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_cooked_chicken"), HONEY_COOKED_CHICKEN);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_cooked_mutton"), HONEY_COOKED_MUTTON);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_cooked_porkchop"), HONEY_COOKED_PORKCHOP);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_cookie"), HONEY_COOKIE);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_lemon_tea"), HONEY_LEMON_TEA);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_pancakes"), HONEY_PANCAKES);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_sandwich"), HONEY_SANDWICH);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_toastie"), HONEY_TOASTIE);
        Registry.register(Registries.ITEM, new Identifier(MoreHoney.MOD_ID, "honey_waffle"), HONEY_WAFFLE);
    }
}
