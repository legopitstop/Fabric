package com.legopitstop.breaker.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class BreakerItemGroups {

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((entries) -> {
            entries.add(BreakerItems.ULTIMATE_BLOCK_BREAKER);
        });
    }
}
