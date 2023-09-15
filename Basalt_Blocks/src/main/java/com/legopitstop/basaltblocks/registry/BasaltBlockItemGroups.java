package com.legopitstop.basaltblocks.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class BasaltBlockItemGroups {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(BasaltBlockItems.BASALT_SLAB);
            entries.add(BasaltBlockItems.BASALT_STAIRS);
            entries.add(BasaltBlockItems.BASALT_WALL);
            entries.add(BasaltBlockItems.BASALT_BUTTON);
            entries.add(BasaltBlockItems.BASALT_PRESSURE_PLATE);
            entries.add(BasaltBlockItems.SMOOTH_BASALT_SLAB);
            entries.add(BasaltBlockItems.SMOOTH_BASALT_STAIRS);
            entries.add(BasaltBlockItems.SMOOTH_BASALT_WALL);
            entries.add(BasaltBlockItems.SMOOTH_BASALT_BUTTON);
            entries.add(BasaltBlockItems.SMOOTH_BASALT_PRESSURE_PLATE);
            entries.add(BasaltBlockItems.CHISELED_POLISHED_BASALT);
            entries.add(BasaltBlockItems.POLISHED_BASALT_SLAB);
            entries.add(BasaltBlockItems.POLISHED_BASALT_STAIRS);
            entries.add(BasaltBlockItems.POLISHED_BASALT_WALL);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BUTTON);
            entries.add(BasaltBlockItems.POLISHED_BASALT_PRESSURE_PLATE);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICK_DOOR);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICK_TRAPDOOR);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICKS);
            entries.add(BasaltBlockItems.CRACKED_POLISHED_BASALT_BRICKS);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICK_PILLAR);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICK_SLAB);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICK_STAIRS);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICK_WALL);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICK_BUTTON);
            entries.add(BasaltBlockItems.POLISHED_BASALT_BRICK_PRESSURE_PLATE);
            entries.add(BasaltBlockItems.BASALT_COBBLESTONE);
            entries.add(BasaltBlockItems.BASALT_COBBLESTONE_SLAB);
            entries.add(BasaltBlockItems.BASALT_COBBLESTONE_STAIRS);
            entries.add(BasaltBlockItems.BASALT_COBBLESTONE_WALL);
            entries.add(BasaltBlockItems.BASALT_COBBLESTONE_BUTTON);
            entries.add(BasaltBlockItems.BASALT_COBBLESTONE_PRESSURE_PLATE);
        });
    }

}
