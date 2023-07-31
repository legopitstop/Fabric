package com.legopitstop.moregold.block;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GoldenFruitCropBlock extends CropBlock {
    public GoldenFruitCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(this);
    }
}
