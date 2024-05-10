package dev.lpsmods.canned.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class CanFoodItem extends BlockItem {
    private final Item resultItem;
    public CanFoodItem(Block block, Item resultItem, Settings settings) {
        super(block, settings);
        this.resultItem = resultItem;
    }

    public Item getResultItem() {
        return this.resultItem;
    }
}
