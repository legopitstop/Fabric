package dev.lpsmods.lightningglass;

import dev.lpsmods.lightningglass.api.LightningHitCallback;
import dev.lpsmods.lightningglass.registry.FulguriteRegistry;
import dev.lpsmods.lightningglass.server.FulguriteLoader;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;
import net.minecraft.server.world.ServerWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightningGlass implements ModInitializer {
    public static final String MOD_ID = "lightning_glass";
	public static final Logger LOGGER = LoggerFactory.getLogger("Lightning Glass");

	@Override
	public void onInitialize() {
		ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(new FulguriteLoader());

		// Event
		LightningHitCallback.EVENT.register((lightningEntity, cachedBlockPosition) -> {
			System.out.println("Is was a HIT!!!");
			FulguriteRegistry.generateFulgurite((ServerWorld)lightningEntity.getWorld(), cachedBlockPosition);
		});
	}
}
