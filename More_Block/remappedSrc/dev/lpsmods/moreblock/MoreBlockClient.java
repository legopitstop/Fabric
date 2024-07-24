package dev.lpsmods.moreblock;

import dev.lpsmods.moreblock.registry.MoreBlockBlocks;
import dev.lpsmods.moreblock.registry.MoreBlockItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class MoreBlockClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return GrassColors.getColor(0.5, 1.0);
            }
            return BiomeColors.getGrassColor(world, pos);
        }, MoreBlockBlocks.GRASS_BLOCK_LAYER);

        ColorProviderRegistry.ITEM.register((stack, layer) -> {
            return GrassColors.getColor(0.5, 1.0);
        }, MoreBlockItems.GRASS_BLOCK_LAYER);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return FoliageColors.getSpruceColor();
        }, MoreBlockBlocks.SPRUCE_LEAVES_LAYER);

        ColorProviderRegistry.ITEM.register((stack, layer) -> {
            return FoliageColors.getDefaultColor();
        }, MoreBlockItems.SPRUCE_LEAVES_LAYER);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return FoliageColors.getBirchColor();
        }, MoreBlockBlocks.BIRCH_LEAVES_LAYER);

        ColorProviderRegistry.ITEM.register((stack, layer) -> {
            return FoliageColors.getDefaultColor();
        }, MoreBlockItems.BIRCH_LEAVES_LAYER);

        registerLeafColor(MoreBlockBlocks.OAK_LEAVES_LAYER);
        registerLeafColor(MoreBlockBlocks.JUNGLE_LEAVES_LAYER);
        registerLeafColor(MoreBlockBlocks.ACACIA_LEAVES_LAYER);
        registerLeafColor(MoreBlockBlocks.DARK_OAK_LEAVES_LAYER);
        registerLeafColor(MoreBlockBlocks.MANGROVE_LEAVES_LAYER);

        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.GRASS_BLOCK_LAYER, RenderLayer.getCutoutMipped());

        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.SLIME_BLOCK_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.HONEY_BLOCK_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.TINTED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.WHITE_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.LIGHT_GRAY_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.GRAY_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.BLACK_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.BROWN_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.RED_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.ORANGE_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.YELLOW_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.LIME_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.GREEN_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.CYAN_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.LIGHT_BLUE_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.BLUE_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.PURPLE_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.MAGENTA_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.PINK_STAINED_GLASS_LAYER, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.MANGROVE_ROOTS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.GLASS_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.OAK_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.SPRUCE_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.BIRCH_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.JUNGLE_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.ACACIA_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.DARK_OAK_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.MANGROVE_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.CHERRY_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.AZALEA_LEAVES_LAYER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MoreBlockBlocks.FLOWERING_AZALEA_LEAVES_LAYER, RenderLayer.getCutout());
    }

    public static void registerLeafColor(Block block) {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, block);

        ColorProviderRegistry.ITEM.register((stack, layer) -> {
            return FoliageColors.getDefaultColor();
        }, block.asItem());
    }
}
