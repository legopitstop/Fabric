package com.legopitstop.lightningglass.server.fulgurite;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.stateprovider.PredicatedStateProvider;

public record ReplaceSingleBlockFulgurite(PredicatedStateProvider condition, BlockState block) implements Fulgurite {
    public static final Codec<ReplaceSingleBlockFulgurite> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                PredicatedStateProvider.CODEC.fieldOf("condition").forGetter(ReplaceSingleBlockFulgurite::condition),
                BlockState.CODEC.fieldOf("block").forGetter(ReplaceSingleBlockFulgurite::block)
        ).apply(instance, ReplaceSingleBlockFulgurite::new);
    });

    public ReplaceSingleBlockFulgurite(PredicatedStateProvider condition, BlockState block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public FulguriteType getType() {
        return FulguriteTypes.REPLACE_SINGLE_BLOCK;
    }

    @Override
    public boolean test(CachedBlockPosition block) {
        return false;
    }

    @Override
    public void generate(ServerWorld world, BlockPos blockPos) {
        world.setBlockState(blockPos, this.block);
    }
}
