package com.legopitstop.morehoney;

import com.legopitstop.morehoney.registry.ModItemGroups;
import com.legopitstop.morehoney.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class MoreHoney implements ModInitializer {
    public static final String MOD_ID = "morehoney";

    @Override
    public void onInitialize() {
        ModItems.register();
        ModItemGroups.register();
    }
}
