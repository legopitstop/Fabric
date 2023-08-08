package com.legopitstop.minecoin.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModItems.WHITE_PIGGY_BANK);
            entries.add(ModItems.LIGHT_GRAY_PIGGY_BANK);
            entries.add(ModItems.GRAY_PIGGY_BANK);
            entries.add(ModItems.BLACK_PIGGY_BANK);
            entries.add(ModItems.BROWN_PIGGY_BANK);
            entries.add(ModItems.RED_PIGGY_BANK);
            entries.add(ModItems.ORANGE_PIGGY_BANK);
            entries.add(ModItems.YELLOW_PIGGY_BANK);
            entries.add(ModItems.LIME_PIGGY_BANK);
            entries.add(ModItems.GREEN_PIGGY_BANK);
            entries.add(ModItems.CYAN_PIGGY_BANK);
            entries.add(ModItems.LIGHT_BLUE_PIGGY_BANK);
            entries.add(ModItems.BLUE_PIGGY_BANK);
            entries.add(ModItems.PURPLE_PIGGY_BANK);
            entries.add(ModItems.MAGENTA_PIGGY_BANK);
            entries.add(ModItems.PINK_PIGGY_BANK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.MINECOIN);
            entries.add(ModItems.DEBIT_CARD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModItems.AUTOMATIC_TELLER_MACHINE);
            entries.add(ModItems.MINECOIN_REGISTER);

            entries.add(ModItems.WHITE_PIGGY_BANK);
            entries.add(ModItems.LIGHT_GRAY_PIGGY_BANK);
            entries.add(ModItems.GRAY_PIGGY_BANK);
            entries.add(ModItems.BLACK_PIGGY_BANK);
            entries.add(ModItems.BROWN_PIGGY_BANK);
            entries.add(ModItems.RED_PIGGY_BANK);
            entries.add(ModItems.ORANGE_PIGGY_BANK);
            entries.add(ModItems.YELLOW_PIGGY_BANK);
            entries.add(ModItems.LIME_PIGGY_BANK);
            entries.add(ModItems.GREEN_PIGGY_BANK);
            entries.add(ModItems.CYAN_PIGGY_BANK);
            entries.add(ModItems.LIGHT_BLUE_PIGGY_BANK);
            entries.add(ModItems.BLUE_PIGGY_BANK);
            entries.add(ModItems.PURPLE_PIGGY_BANK);
            entries.add(ModItems.MAGENTA_PIGGY_BANK);
            entries.add(ModItems.PINK_PIGGY_BANK);
        });
    }
}
