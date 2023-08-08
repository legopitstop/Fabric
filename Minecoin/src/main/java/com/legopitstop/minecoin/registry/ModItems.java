package com.legopitstop.minecoin.registry;

import com.legopitstop.minecoin.Minecoin;
import com.legopitstop.minecoin.item.DyeableCardItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item AUTOMATIC_TELLER_MACHINE = new BlockItem(ModBlocks.AUTOMATIC_TELLER_MACHINE, new FabricItemSettings());
    public static final Item MINECOIN_REGISTER = new BlockItem(ModBlocks.MINECOIN_REGISTER, new FabricItemSettings());
    public static final Item MINECOIN = new Item(new FabricItemSettings().rarity(Rarity.RARE));
    public static final Item DEBIT_CARD = new DyeableCardItem(new FabricItemSettings().rarity(Rarity.RARE).maxCount(1));

    public static final Item WHITE_PIGGY_BANK = new BlockItem(ModBlocks.WHITE_PIGGY_BANK, new FabricItemSettings());
    public static final Item LIGHT_GRAY_PIGGY_BANK = new BlockItem(ModBlocks.LIGHT_GRAY_PIGGY_BANK, new FabricItemSettings());
    public static final Item GRAY_PIGGY_BANK = new BlockItem(ModBlocks.GRAY_PIGGY_BANK, new FabricItemSettings());
    public static final Item BLACK_PIGGY_BANK = new BlockItem(ModBlocks.BLACK_PIGGY_BANK, new FabricItemSettings());
    public static final Item BROWN_PIGGY_BANK = new BlockItem(ModBlocks.BROWN_PIGGY_BANK, new FabricItemSettings());
    public static final Item RED_PIGGY_BANK = new BlockItem(ModBlocks.RED_PIGGY_BANK, new FabricItemSettings());
    public static final Item ORANGE_PIGGY_BANK = new BlockItem(ModBlocks.ORANGE_PIGGY_BANK, new FabricItemSettings());
    public static final Item YELLOW_PIGGY_BANK = new BlockItem(ModBlocks.YELLOW_PIGGY_BANK, new FabricItemSettings());
    public static final Item LIME_PIGGY_BANK = new BlockItem(ModBlocks.LIME_PIGGY_BANK, new FabricItemSettings());
    public static final Item GREEN_PIGGY_BANK = new BlockItem(ModBlocks.GREEN_PIGGY_BANK, new FabricItemSettings());
    public static final Item CYAN_PIGGY_BANK = new BlockItem(ModBlocks.CYAN_PIGGY_BANK, new FabricItemSettings());
    public static final Item LIGHT_BLUE_PIGGY_BANK = new BlockItem(ModBlocks.LIGHT_BLUE_PIGGY_BANK, new FabricItemSettings());
    public static final Item BLUE_PIGGY_BANK = new BlockItem(ModBlocks.BLUE_PIGGY_BANK, new FabricItemSettings());
    public static final Item PURPLE_PIGGY_BANK = new BlockItem(ModBlocks.PURPLE_PIGGY_BANK, new FabricItemSettings());
    public static final Item MAGENTA_PIGGY_BANK = new BlockItem(ModBlocks.MAGENTA_PIGGY_BANK, new FabricItemSettings());
    public static final Item PINK_PIGGY_BANK = new BlockItem(ModBlocks.PINK_PIGGY_BANK, new FabricItemSettings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "minecoin"), MINECOIN);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "automatic_teller_machine"), AUTOMATIC_TELLER_MACHINE);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "minecoin_register"), MINECOIN_REGISTER);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "debit_card"), DEBIT_CARD);

        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "white_piggy_bank"), WHITE_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "light_gray_piggy_bank"), LIGHT_GRAY_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "gray_piggy_bank"), GRAY_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "black_piggy_bank"), BLACK_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "brown_piggy_bank"), BROWN_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "red_piggy_bank"), RED_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "orange_piggy_bank"), ORANGE_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "yellow_piggy_bank"), YELLOW_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "lime_piggy_bank"), LIME_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "green_piggy_bank"), GREEN_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "cyan_piggy_bank"), CYAN_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "light_blue_piggy_bank"), LIGHT_BLUE_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "blue_piggy_bank"), BLUE_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "purple_piggy_bank"), PURPLE_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "magenta_piggy_bank"), MAGENTA_PIGGY_BANK);
        Registry.register(Registries.ITEM, new Identifier(Minecoin.MOD_ID, "pink_piggy_bank"), PINK_PIGGY_BANK);
    }
}
