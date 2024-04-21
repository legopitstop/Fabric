package dev.lpsmods.spawnercraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.SpawnEggItem;

public class SpawnerCraft implements ModInitializer {
    public static final String MOD_ID = "spawnercraft";

	@Override
	public void onInitialize() {
		// TODO
		// - API to create the recipes.
		// - Should attempt to create the recipe for the entity.
		System.out.println(SpawnEggItem.getAll());
	}
}