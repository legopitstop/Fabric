package com.legopitstop.morehoney.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(ModItems.HONEY_COOKED_BEEF);
            entries.add(ModItems.HONEY_COOKED_CHICKEN);
            entries.add(ModItems.HONEY_COOKED_MUTTON);
            entries.add(ModItems.HONEY_COOKED_PORKCHOP);
            entries.add(ModItems.HONEY_COOKIE);
            entries.add(ModItems.HONEY_LEMON_TEA);
            entries.add(ModItems.HONEY_PANCAKES);
            entries.add(ModItems.HONEY_SANDWICH);
            entries.add(ModItems.HONEY_TOASTIE);
            entries.add(ModItems.HONEY_WAFFLE);
        });
    }
}
