package dev.lpsmods.basaltblocks.block;

import dev.lpsmods.basaltblocks.BasaltBlocks;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class BasaltSoundEvents {
    public static final SoundEvent BLOCK_BASALT_DOOR_CLOSE = SoundEvent.of(new Identifier(BasaltBlocks.MOD_ID, "block.basalt_door.close"));
    public static final SoundEvent BLOCK_BASALT_DOOR_OPEN = SoundEvent.of(new Identifier(BasaltBlocks.MOD_ID,"block.basalt_door.open"));
    public static final SoundEvent BLOCK_BASALT_TRAPDOOR_CLOSE = SoundEvent.of(new Identifier(BasaltBlocks.MOD_ID,"block.basalt_trapdoor.close"));
    public static final SoundEvent BLOCK_BASALT_TRAPDOOR_OPEN = SoundEvent.of(new Identifier(BasaltBlocks.MOD_ID,"block.basalt_trapdoor.open"));
    public static final SoundEvent BLOCK_BASALT_BUTTON_CLICK_OFF = SoundEvent.of(new Identifier(BasaltBlocks.MOD_ID,"block.basalt_button.click_off"));
    public static final SoundEvent BLOCK_BASALT_BUTTON_CLICK_ON = SoundEvent.of(new Identifier(BasaltBlocks.MOD_ID,"block.basalt_button.click_on"));
    public static final SoundEvent BLOCK_BASALT_PRESSURE_PLATE_CLICK_OFF = SoundEvent.of(new Identifier(BasaltBlocks.MOD_ID,"block.basalt_pressure_plate.click_off"));
    public static final SoundEvent BLOCK_BASALT_PRESSURE_PLATE_CLICK_ON = SoundEvent.of(new Identifier(BasaltBlocks.MOD_ID,"block.basalt_pressure_plate.click_on"));
}
