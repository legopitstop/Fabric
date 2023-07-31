package com.legopitstop.moregold.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ModItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.WARPED_BUTTON, ModItems.GOLDEN_LOG);
            entries.addAfter(ModItems.GOLDEN_LOG, ModItems.STRIPPED_GOLDEN_LOG);
            entries.addAfter(ModItems.STRIPPED_GOLDEN_LOG, ModItems.GOLDEN_WOOD);
            entries.addAfter(ModItems.GOLDEN_WOOD, ModItems.STRIPPED_GOLDEN_WOOD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.addAfter(Items.BEETROOT_SEEDS, ModItems.GOLDEN_FRUIT_SEEDS);
            entries.addAfter(Items.CHERRY_SAPLING, ModItems.GOLDEN_FRUIT_SAPLING);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(ModItems.GOLDEN_BANANA);
            entries.add(ModItems.GOLDEN_GRAPE);
            entries.add(ModItems.GOLDEN_LEMON);
            entries.add(ModItems.GOLDEN_ORANGE);
            entries.add(ModItems.GOLDEN_STRAWBERRY);
        });
    }
}
