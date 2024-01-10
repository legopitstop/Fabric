package com.legopitstop.magnet.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class MagnetItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((entries) -> {
            entries.add(MagnetItems.COPPER_MAGNET);
            entries.add(MagnetItems.COPPER_MAGNET_BLOCK);
            entries.add(MagnetItems.DIAMOND_MAGNET);
            entries.add(MagnetItems.DIAMOND_MAGNET_BLOCK);
            entries.add(MagnetItems.GOLD_MAGNET);
            entries.add(MagnetItems.GOLD_MAGNET_BLOCK);
            entries.add(MagnetItems.IRON_MAGNET);
            entries.add(MagnetItems.IRON_MAGNET_BLOCK);
            entries.add(MagnetItems.NETHERITE_MAGNET);
            entries.add(MagnetItems.NETHERITE_MAGNET_BLOCK);
        });
    }
}
