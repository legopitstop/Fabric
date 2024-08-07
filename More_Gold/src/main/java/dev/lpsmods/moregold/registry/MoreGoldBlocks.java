package dev.lpsmods.moregold.registry;

import dev.lpsmods.moregold.MoreGold;
import dev.lpsmods.moregold.block.GoldenFruitCropBlock;
import dev.lpsmods.moregold.world.tree.GoldenFruitSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MoreGoldBlocks {
    // Create Blocks
    public static final Block GOLDEN_WOOD = new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());
    public static final Block STRIPPED_GOLDEN_WOOD = new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());
    public static final Block GOLDEN_LOG = Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.SPRUCE_BROWN);
    public static final Block STRIPPED_GOLDEN_LOG = Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.OAK_TAN);
    public static final Block GOLDEN_FRUIT_SAPLING = new SaplingBlock(new GoldenFruitSaplingGenerator(), FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY).nonOpaque());
    public static final Block GOLDEN_FRUIT_CROP = new GoldenFruitCropBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY).nonOpaque());

    public static void register() {
        // Register Blocks
        Registry.register(Registries.BLOCK, Identifier.of(MoreGold.MOD_ID, "golden_wood"), GOLDEN_WOOD);
        Registry.register(Registries.BLOCK, Identifier.of(MoreGold.MOD_ID, "stripped_golden_wood"), STRIPPED_GOLDEN_WOOD);
        Registry.register(Registries.BLOCK, Identifier.of(MoreGold.MOD_ID, "golden_log"), GOLDEN_LOG);
        Registry.register(Registries.BLOCK, Identifier.of(MoreGold.MOD_ID, "stripped_golden_log"), STRIPPED_GOLDEN_LOG);
        Registry.register(Registries.BLOCK, Identifier.of(MoreGold.MOD_ID, "golden_fruit_sapling"), GOLDEN_FRUIT_SAPLING);
        Registry.register(Registries.BLOCK, Identifier.of(MoreGold.MOD_ID, "golden_fruit_crop"), GOLDEN_FRUIT_CROP);
    }
}
