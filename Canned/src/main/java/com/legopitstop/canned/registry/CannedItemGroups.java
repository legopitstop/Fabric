package com.legopitstop.canned.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class CannedItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(CannedItems.CAN_OPENER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(CannedItems.CAN);
            entries.add(CannedItems.APPLE_CAN);
            entries.add(CannedItems.BAKED_POTATO_CAN);
            entries.add(CannedItems.BEETROOT_CAN);
            entries.add(CannedItems.BEETROOT_SOUP_CAN);
            entries.add(CannedItems.BREAD_CAN);
            entries.add(CannedItems.CAKE_CAN);
            entries.add(CannedItems.CARROT_CAN);
            entries.add(CannedItems.CHORUS_FRUIT_CAN);
            entries.add(CannedItems.COOKED_BEEF_CAN);
            entries.add(CannedItems.COOKED_CHICKEN_CAN);
            entries.add(CannedItems.COOKED_COD_CAN);
            entries.add(CannedItems.COOKED_MUTTON_CAN);
            entries.add(CannedItems.COOKED_PORKCHOP_CAN);
            entries.add(CannedItems.COOKED_RABBIT_CAN);
            entries.add(CannedItems.COOKED_SALMON_CAN);
            entries.add(CannedItems.COOKIE_CAN);
            entries.add(CannedItems.DRIED_KELP_CAN);
            entries.add(CannedItems.ENCHANTED_GOLDEN_APPLE_CAN);
            entries.add(CannedItems.GLOW_BERRIES_CAN);
            entries.add(CannedItems.GOLDEN_APPLE_CAN);
            entries.add(CannedItems.GOLDEN_CARROT_CAN);
            entries.add(CannedItems.HONEY_CAN);
            entries.add(CannedItems.MELON_CAN);
            entries.add(CannedItems.MUSHROOM_STEW_CAN);
            entries.add(CannedItems.POISONOUS_POTATO_CAN);
            entries.add(CannedItems.POTATO_CAN);
            entries.add(CannedItems.PUFFERFISH_CAN);
            entries.add(CannedItems.PUMPKIN_PIE_CAN);
            entries.add(CannedItems.RABBIT_STEW_CAN);
            entries.add(CannedItems.ROTTEN_FLESH_CAN);
            entries.add(CannedItems.SPIDER_EYE_CAN);
            entries.add(CannedItems.SUSPICIOUS_STEW_CAN);
            entries.add(CannedItems.SWEET_BERRIES_CAN);
            entries.add(CannedItems.TROPICAL_FISH_CAN);
        });
    }
}
