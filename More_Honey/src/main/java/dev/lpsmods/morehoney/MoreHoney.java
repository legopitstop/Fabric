package dev.lpsmods.morehoney;

import dev.lpsmods.morehoney.registry.MoreHoneyItemGroups;
import dev.lpsmods.morehoney.registry.MoreHoneyItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

public class MoreHoney implements ModInitializer {
    public static final String MOD_ID = "morehoney";

    @Override
    public void onInitialize() {
        MoreHoneyItems.register();
        MoreHoneyItemGroups.register();

        CompostingChanceRegistry.INSTANCE.add(MoreHoneyItems.HONEY_COOKIE, 0.85F);
        CompostingChanceRegistry.INSTANCE.add(MoreHoneyItems.HONEY_PANCAKES, 0.85F);
        CompostingChanceRegistry.INSTANCE.add(MoreHoneyItems.HONEY_SANDWICH, 0.85F);
        CompostingChanceRegistry.INSTANCE.add(MoreHoneyItems.HONEY_TOASTIE, 0.85F);
        CompostingChanceRegistry.INSTANCE.add(MoreHoneyItems.HONEY_WAFFLE, 0.85F);

    }
}
