package com.legopitstop.moregold.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class MoreGoldItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.WARPED_BUTTON, MoreGoldItems.GOLDEN_LOG);
            entries.addAfter(MoreGoldItems.GOLDEN_LOG, MoreGoldItems.STRIPPED_GOLDEN_LOG);
            entries.addAfter(MoreGoldItems.STRIPPED_GOLDEN_LOG, MoreGoldItems.GOLDEN_WOOD);
            entries.addAfter(MoreGoldItems.GOLDEN_WOOD, MoreGoldItems.STRIPPED_GOLDEN_WOOD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.addAfter(Items.BEETROOT_SEEDS, MoreGoldItems.GOLDEN_FRUIT_SEEDS);
            entries.addAfter(Items.CHERRY_SAPLING, MoreGoldItems.GOLDEN_FRUIT_SAPLING);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(MoreGoldItems.GOLDEN_BANANA);
            entries.add(MoreGoldItems.ENCHANTED_GOLDEN_BANANA);
            entries.add(MoreGoldItems.GOLDEN_GRAPE);
            entries.add(MoreGoldItems.ENCHANTED_GOLDEN_GRAPE);
            entries.add(MoreGoldItems.GOLDEN_LEMON);
            entries.add(MoreGoldItems.ENCHANTED_GOLDEN_LEMON);
            entries.add(MoreGoldItems.GOLDEN_ORANGE);
            entries.add(MoreGoldItems.ENCHANTED_GOLDEN_ORANGE);
            entries.add(MoreGoldItems.GOLDEN_STRAWBERRY);
            entries.add(MoreGoldItems.ENCHANTED_GOLDEN_STRAWBERRY);
        });
    }
}
