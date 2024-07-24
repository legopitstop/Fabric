package dev.lpsmods.morehoney.item;

import com.legopitstop.morefood.registry.MoreFoodItems;
import net.minecraft.component.type.FoodComponent;

public class MoreHoneyFoodComponents {
    // BEETROOT_SOUP
    public static final FoodComponent HONEY_LEMON_TEA = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6F).usingConvertsTo(MoreFoodItems.HOT_BEVERAGE_CUP).build();

    // GOLDEN_APPLE
    public static final FoodComponent HONEY_COOKED_BEEF = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodComponent HONEY_COOKED_CHICKEN = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodComponent HONEY_COOKED_MUTTON = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodComponent HONEY_COOKED_PORKCHOP = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodComponent HONEY_COOKIE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodComponent HONEY_PANCAKES = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodComponent HONEY_SANDWICH = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodComponent HONEY_TOASTIE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
    public static final FoodComponent HONEY_WAFFLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F).build();
}
