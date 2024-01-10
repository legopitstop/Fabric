package com.legopitstop.morehoney.registry;

import com.legopitstop.morefood.item.MoreFoodComponents;
import com.legopitstop.morefood.registry.MoreFoodItems;
import com.legopitstop.morehoney.MoreHoney;
import com.legopitstop.morehoney.item.HoneyLemonTeaItem;
import com.legopitstop.morehoney.item.MoreHoneyFoodComponents;
import com.legopitstop.morehoney.item.MoreHoneyItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreHoneyItems {
    // Create Items
    public static final Item HONEY_LEMON_TEA = new HoneyLemonTeaItem(new FabricItemSettings().maxCount(16).food(MoreFoodComponents.HOT_BEVERAGE).recipeRemainder(MoreFoodItems.HOT_BEVERAGE_CUP));
    public static final Item HONEY_COOKED_BEEF = new MoreHoneyItem(new FabricItemSettings().food(MoreHoneyFoodComponents.HONEY_COOKED_BEEF));
    public static final Item HONEY_COOKED_CHICKEN = new MoreHoneyItem(new FabricItemSettings().food(MoreHoneyFoodComponents.HONEY_COOKED_CHICKEN));
    public static final Item HONEY_COOKED_MUTTON = new MoreHoneyItem(new FabricItemSettings().food(MoreHoneyFoodComponents.HONEY_COOKED_MUTTON));
    public static final Item HONEY_COOKED_PORKCHOP = new MoreHoneyItem(new FabricItemSettings().food(MoreHoneyFoodComponents.HONEY_COOKED_PORKCHOP));
    public static final Item HONEY_COOKIE = new MoreHoneyItem(new FabricItemSettings().food(MoreHoneyFoodComponents.HONEY_COOKIE));
    public static final Item HONEY_PANCAKES = new MoreHoneyItem(new FabricItemSettings().food(MoreFoodComponents.PANCAKES));
    public static final Item HONEY_SANDWICH = new MoreHoneyItem(new FabricItemSettings().food(MoreHoneyFoodComponents.HONEY_SANDWICH));
    public static final Item HONEY_TOASTIE = new MoreHoneyItem(new FabricItemSettings().food(MoreFoodComponents.CHEESE_TOASTIE));
    public static final Item HONEY_WAFFLE = new MoreHoneyItem(new FabricItemSettings().food(MoreFoodComponents.WAFFLE));

    public static void register() {
        // Register Items
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
