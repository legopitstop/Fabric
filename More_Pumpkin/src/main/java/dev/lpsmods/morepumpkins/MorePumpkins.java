package dev.lpsmods.morepumpkins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.List;

public class MorePumpkins implements ModInitializer {
    public static final String MOD_ID = "morepumpkin";
	public static final List<String> pumpkins = List.of("creeper","flower","ghast","globe","observer","skeleton","snout","zero","one","two","three","four","five","six","seven","eight","nine","lowercase_a","lowercase_b","lowercase_c","lowercase_d","lowercase_e","lowercase_f","lowercase_g","lowercase_h","lowercase_i","lowercase_j","lowercase_k","lowercase_l","lowercase_m","lowercase_n","lowercase_o","lowercase_p","lowercase_q","lowercase_r","lowercase_s","lowercase_t","lowercase_u","lowercase_v","lowercase_w","lowercase_x","lowercase_y","lowercase_z","uppercase_a","uppercase_b","uppercase_c","uppercase_d","uppercase_e","uppercase_f","uppercase_g","uppercase_h","uppercase_i","uppercase_j","uppercase_k","uppercase_l","uppercase_m","uppercase_n","uppercase_o","uppercase_p","uppercase_q","uppercase_r","uppercase_s","uppercase_t","uppercase_u","uppercase_v","uppercase_w","uppercase_x","uppercase_y","uppercase_z");

	@Override
	public void onInitialize() {
		// Create soul_jack_o_lantern
		Block soul_block = new CarvedPumpkinBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance((state) -> {return 8;}).allowsSpawning(Blocks::always).pistonBehavior(PistonBehavior.DESTROY));
		Item soul_item = new BlockItem(soul_block, new FabricItemSettings());
		Registry.register(Registries.BLOCK, new Identifier(MorePumpkins.MOD_ID, "soul_jack_o_lantern"), soul_block);
		Registry.register(Registries.ITEM, new Identifier(MorePumpkins.MOD_ID, "soul_jack_o_lantern"), soul_item);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addAfter(Items.JACK_O_LANTERN, soul_item);
		});

		// Create all pumpkins from list
		for (int i = 0; i < pumpkins.size(); i++) {
			String prefix = (String)pumpkins.get(i);
			Block block1 = new WearableCarvedPumpkinBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).allowsSpawning(Blocks::always).pistonBehavior(PistonBehavior.DESTROY));
			Block block2 = new CarvedPumpkinBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance((state) -> {return 15;}).allowsSpawning(Blocks::always).pistonBehavior(PistonBehavior.DESTROY));
			Block block3 = new CarvedPumpkinBlock(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance((state) -> {return 10;}).allowsSpawning(Blocks::always).pistonBehavior(PistonBehavior.DESTROY));

			Item item1 = new BlockItem(block1, new FabricItemSettings());
			Item item2 = new BlockItem(block2, new FabricItemSettings());
			Item item3 = new BlockItem(block3, new FabricItemSettings());

			Registry.register(Registries.BLOCK, new Identifier(MorePumpkins.MOD_ID, prefix+"_carved_pumpkin"), block1);
			Registry.register(Registries.BLOCK, new Identifier(MorePumpkins.MOD_ID, prefix+"_jack_o_lantern"), block2);
			Registry.register(Registries.BLOCK, new Identifier(MorePumpkins.MOD_ID, prefix+"_soul_jack_o_lantern"), block3);
			Registry.register(Registries.ITEM, new Identifier(MorePumpkins.MOD_ID, prefix+"_carved_pumpkin"), item1);
			Registry.register(Registries.ITEM, new Identifier(MorePumpkins.MOD_ID, prefix+"_jack_o_lantern"), item2);
			Registry.register(Registries.ITEM, new Identifier(MorePumpkins.MOD_ID, prefix+"_soul_jack_o_lantern"), item3);

			ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
				entries.addAfter(soul_item, item1);
				entries.addAfter(item1, item2);
				entries.addAfter(item2, item3);
			});
			Blocks.OAK_PLANKS
		}
	}
}