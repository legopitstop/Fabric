package com.legopitstop.canned;

import com.legopitstop.canned.registry.CannedBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class CannedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.APPLE_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.BAKED_POTATO_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.BEETROOT_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.BEETROOT_SOUP_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.BREAD_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.CAKE_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.CARROT_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.CHORUS_FRUIT_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.COOKED_BEEF_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.COOKED_CHICKEN_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.COOKED_COD_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.COOKED_MUTTON_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.COOKED_PORKCHOP_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.COOKED_RABBIT_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.COOKED_SALMON_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.COOKIE_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.DRIED_KELP_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.ENCHANTED_GOLDEN_APPLE_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.GLOW_BERRIES_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.GOLDEN_APPLE_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.GOLDEN_CARROT_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.HONEY_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.MELON_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.MUSHROOM_STEW_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.POISONOUS_POTATO_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.POTATO_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.PUFFERFISH_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.PUMPKIN_PIE_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.RABBIT_STEW_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.ROTTEN_FLESH_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.SPIDER_EYE_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.SUSPICIOUS_STEW_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.SWEET_BERRIES_CAN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CannedBlocks.TROPICAL_FISH_CAN, RenderLayer.getCutout());
    }
}
