package dev.lpsmods.moregold;

import dev.lpsmods.moregold.registry.MoreGoldBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(value=EnvType.CLIENT)
public class MoreGoldClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MoreGoldBlocks.GOLDEN_FRUIT_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreGoldBlocks.GOLDEN_FRUIT_SAPLING, RenderLayer.getCutout());
    }
}
