package dev.lpsmods.basaltblocks.block;

import net.minecraft.block.BlockSetType;
import net.minecraft.sound.BlockSoundGroup;

public class BasaltSetType {
    public static final BlockSetType BASALT = new BlockSetType("basalt", true, true, true,BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.BASALT, BasaltSoundEvents.BLOCK_BASALT_DOOR_CLOSE, BasaltSoundEvents.BLOCK_BASALT_DOOR_OPEN, BasaltSoundEvents.BLOCK_BASALT_TRAPDOOR_CLOSE, BasaltSoundEvents.BLOCK_BASALT_TRAPDOOR_OPEN, BasaltSoundEvents.BLOCK_BASALT_PRESSURE_PLATE_CLICK_OFF, BasaltSoundEvents.BLOCK_BASALT_PRESSURE_PLATE_CLICK_ON, BasaltSoundEvents.BLOCK_BASALT_BUTTON_CLICK_OFF, BasaltSoundEvents.BLOCK_BASALT_BUTTON_CLICK_ON);
}
