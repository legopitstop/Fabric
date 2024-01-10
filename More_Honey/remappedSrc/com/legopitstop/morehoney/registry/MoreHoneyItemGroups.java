package com.legopitstop.morehoney.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class MoreHoneyItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(MoreHoneyItems.HONEY_COOKED_BEEF);
            entries.add(MoreHoneyItems.HONEY_COOKED_CHICKEN);
            entries.add(MoreHoneyItems.HONEY_COOKED_MUTTON);
            entries.add(MoreHoneyItems.HONEY_COOKED_PORKCHOP);
            entries.add(MoreHoneyItems.HONEY_COOKIE);
            entries.add(MoreHoneyItems.HONEY_LEMON_TEA);
            entries.add(MoreHoneyItems.HONEY_PANCAKES);
            entries.add(MoreHoneyItems.HONEY_SANDWICH);
            entries.add(MoreHoneyItems.HONEY_TOASTIE);
            entries.add(MoreHoneyItems.HONEY_WAFFLE);
        });
    }
}
