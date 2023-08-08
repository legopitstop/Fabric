package com.legopitstop.minecoin.registry;

import com.legopitstop.minecoin.Minecoin;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> PIGGY_BANK_ITEMS = TagKey.of(RegistryKeys.ITEM, new Identifier(Minecoin.MOD_ID, "piggy_bank_items"));
}
