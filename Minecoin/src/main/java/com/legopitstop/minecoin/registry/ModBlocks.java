package com.legopitstop.minecoin.registry;

import com.legopitstop.minecoin.Minecoin;
import com.legopitstop.minecoin.block.AutomaticTellerMachineBlock;
import com.legopitstop.minecoin.block.MinecoinRegisterBlock;
import com.legopitstop.minecoin.block.PiggyBankBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block AUTOMATIC_TELLER_MACHINE = new AutomaticTellerMachineBlock(FabricBlockSettings.create().hardness(0.5F).resistance(0.5F).sounds(BlockSoundGroup.STONE).mapColor(MapColor.GRAY).nonOpaque().solidBlock(Blocks::never));
    public static final Block MINECOIN_REGISTER = new MinecoinRegisterBlock(FabricBlockSettings.create().hardness(0.5F).resistance(0.5F).sounds(BlockSoundGroup.STONE).mapColor(MapColor.GOLD).solidBlock(Blocks::never));

    public static final Block WHITE_PIGGY_BANK = createPiggyBank(MapColor.WHITE);
    public static final Block LIGHT_GRAY_PIGGY_BANK = createPiggyBank(MapColor.LIGHT_GRAY);
    public static final Block GRAY_PIGGY_BANK = createPiggyBank(MapColor.GRAY);
    public static final Block BLACK_PIGGY_BANK = createPiggyBank(MapColor.BLACK);
    public static final Block BROWN_PIGGY_BANK = createPiggyBank(MapColor.BROWN);
    public static final Block RED_PIGGY_BANK = createPiggyBank(MapColor.RED);
    public static final Block ORANGE_PIGGY_BANK = createPiggyBank(MapColor.ORANGE);
    public static final Block YELLOW_PIGGY_BANK = createPiggyBank(MapColor.YELLOW);
    public static final Block LIME_PIGGY_BANK = createPiggyBank(MapColor.LIME);
    public static final Block GREEN_PIGGY_BANK = createPiggyBank(MapColor.GREEN);
    public static final Block CYAN_PIGGY_BANK = createPiggyBank(MapColor.CYAN);
    public static final Block LIGHT_BLUE_PIGGY_BANK = createPiggyBank(MapColor.LIGHT_BLUE);
    public static final Block BLUE_PIGGY_BANK = createPiggyBank(MapColor.BLUE);
    public static final Block PURPLE_PIGGY_BANK = createPiggyBank(MapColor.PURPLE);
    public static final Block MAGENTA_PIGGY_BANK = createPiggyBank(MapColor.MAGENTA);
    public static final Block PINK_PIGGY_BANK = createPiggyBank(MapColor.PINK);

    public static Block createPiggyBank(MapColor mapcolor) {
        return new PiggyBankBlock(FabricBlockSettings.create().hardness(0.5F).resistance(0.5F).sounds(BlockSoundGroup.GLASS).mapColor(mapcolor).solidBlock(Blocks::never));
    }

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "automatic_teller_machine"), AUTOMATIC_TELLER_MACHINE);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "minecoin_register"), MINECOIN_REGISTER);

        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "white_piggy_bank"), WHITE_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "light_gray_piggy_bank"), LIGHT_GRAY_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "gray_piggy_bank"), GRAY_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "black_piggy_bank"), BLACK_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "brown_piggy_bank"), BROWN_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "red_piggy_bank"), RED_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "orange_piggy_bank"), ORANGE_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "yellow_piggy_bank"), YELLOW_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "lime_piggy_bank"), LIME_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "green_piggy_bank"), GREEN_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "cyan_piggy_bank"), CYAN_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "light_blue_piggy_bank"), LIGHT_BLUE_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "blue_piggy_bank"), BLUE_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "purple_piggy_bank"), PURPLE_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "magenta_piggy_bank"), MAGENTA_PIGGY_BANK);
        Registry.register(Registries.BLOCK, new Identifier(Minecoin.MOD_ID, "pink_piggy_bank"), PINK_PIGGY_BANK);

    }
}
