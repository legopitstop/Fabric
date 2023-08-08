package com.legopitstop.minecoin;

import com.legopitstop.minecoin.registry.ModBlocks;
import com.legopitstop.minecoin.registry.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.DyeableItem;

@Environment(EnvType.CLIENT)
public class MinecoinClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AUTOMATIC_TELLER_MACHINE, RenderLayer.getCutout());

        ColorProviderRegistry.ITEM.register(
                (stack, tintIndex) -> tintIndex == 0? ((DyeableItem) stack.getItem()).getColor(stack) : 0xFFFFFFF,
                ModItems.DEBIT_CARD
        );

    }
}
