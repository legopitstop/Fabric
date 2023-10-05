package com.legopitstop.lightningglass.server.fulgurite;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.stateprovider.PredicatedStateProvider;

public record RootSystemFulgurite(PredicatedStateProvider condition, BlockState block) implements Fulgurite {
    public static final Codec<RootSystemFulgurite> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(
                PredicatedStateProvider.CODEC.fieldOf("condition").forGetter(RootSystemFulgurite::condition),
                BlockState.CODEC.fieldOf("block").forGetter(RootSystemFulgurite::block)
        ).apply(instance, RootSystemFulgurite::new);
    });

    public RootSystemFulgurite(PredicatedStateProvider condition, BlockState block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public FulguriteType getType() {
        return FulguriteTypes.ROOT_SYSTEM;
    }

    @Override
    public boolean test(CachedBlockPosition block) {
        return false;
    }

    // TODO - generate fulgurite
    @Override
    public void generate(ServerWorld world, BlockPos blockPos) {
        System.out.println("RootSystemFulgurite.generate");
    }
}
