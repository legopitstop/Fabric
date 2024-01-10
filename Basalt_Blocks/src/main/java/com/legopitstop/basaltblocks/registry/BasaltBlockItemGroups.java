package com.legopitstop.basaltblocks.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class BasaltBlockItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.BASALT, BasaltBlockItems.BASALT_BUTTON);
            entries.addAfter(Items.BASALT, BasaltBlockItems.BASALT_PRESSURE_PLATE);
            entries.addAfter(Items.BASALT, BasaltBlockItems.BASALT_WALL);
            entries.addAfter(Items.BASALT, BasaltBlockItems.BASALT_SLAB);
            entries.addAfter(Items.BASALT, BasaltBlockItems.BASALT_STAIRS);

            entries.addAfter(Items.SMOOTH_BASALT, BasaltBlockItems.SMOOTH_BASALT_BUTTON);
            entries.addAfter(Items.SMOOTH_BASALT, BasaltBlockItems.SMOOTH_BASALT_PRESSURE_PLATE);
            entries.addAfter(Items.SMOOTH_BASALT, BasaltBlockItems.SMOOTH_BASALT_WALL);
            entries.addAfter(Items.SMOOTH_BASALT, BasaltBlockItems.SMOOTH_BASALT_SLAB);
            entries.addAfter(Items.SMOOTH_BASALT, BasaltBlockItems.SMOOTH_BASALT_STAIRS);

            entries.addAfter(Items.POLISHED_BASALT, BasaltBlockItems.POLISHED_BASALT_BUTTON);
            entries.addAfter(Items.POLISHED_BASALT, BasaltBlockItems.POLISHED_BASALT_PRESSURE_PLATE);
            entries.addAfter(Items.POLISHED_BASALT, BasaltBlockItems.POLISHED_BASALT_WALL);
            entries.addAfter(Items.POLISHED_BASALT, BasaltBlockItems.POLISHED_BASALT_SLAB);
            entries.addAfter(Items.POLISHED_BASALT, BasaltBlockItems.POLISHED_BASALT_STAIRS);
            entries.addAfter(Items.POLISHED_BASALT, BasaltBlockItems.CHISELED_POLISHED_BASALT);

            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BUTTON, BasaltBlockItems.POLISHED_BASALT_BRICKS);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.POLISHED_BASALT_BRICK_BUTTON);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.POLISHED_BASALT_BRICK_PRESSURE_PLATE);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.POLISHED_BASALT_BRICK_DOOR);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.POLISHED_BASALT_BRICK_TRAPDOOR);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.POLISHED_BASALT_BRICK_WALL);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.POLISHED_BASALT_BRICK_SLAB);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.POLISHED_BASALT_BRICK_STAIRS);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.CRACKED_POLISHED_BASALT_BRICKS);
            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICKS, BasaltBlockItems.POLISHED_BASALT_BRICK_PILLAR);

            entries.addAfter(BasaltBlockItems.POLISHED_BASALT_BRICK_BUTTON, BasaltBlockItems.COBBLED_BASALT);
            entries.addAfter(BasaltBlockItems.COBBLED_BASALT, BasaltBlockItems.COBBLED_BASALT_BUTTON);
            entries.addAfter(BasaltBlockItems.COBBLED_BASALT, BasaltBlockItems.COBBLED_BASALT_PRESSURE_PLATE);
            entries.addAfter(BasaltBlockItems.COBBLED_BASALT, BasaltBlockItems.COBBLED_BASALT_WALL);
            entries.addAfter(BasaltBlockItems.COBBLED_BASALT, BasaltBlockItems.COBBLED_BASALT_SLAB);
            entries.addAfter(BasaltBlockItems.COBBLED_BASALT, BasaltBlockItems.COBBLED_BASALT_STAIRS);
        });
    }

}
