package com.legopitstop.lightningglass.server.fulgurite;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.stateprovider.PredicatedStateProvider;

public record BlockColumnsFulgurite(PredicatedStateProvider condition, BlockState block) implements Fulgurite {
    public static final Codec<BlockColumnsFulgurite> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                PredicatedStateProvider.CODEC.fieldOf("condition").forGetter(BlockColumnsFulgurite::condition),
                BlockState.CODEC.fieldOf("block").forGetter(BlockColumnsFulgurite::block)
        ).apply(instance, BlockColumnsFulgurite::new);
    });

    public BlockColumnsFulgurite(PredicatedStateProvider condition, BlockState block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public FulguriteType getType() {
        return FulguriteTypes.BLOCK_COLUMNS;
    }

    @Override
    public boolean test(CachedBlockPosition block) {
        return false;
    }

    // TODO - generate fulgurite
    @Override
    public void generate(ServerWorld world, BlockPos blockPos) {
        System.out.println("BlockColumnsFulgurite.generate");
    }
}
