package com.legopitstop.lightningglass.server.fulgurite;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.predicate.BlockPredicate;
import net.minecraft.registry.Registries;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.math.BlockPos;

public interface Fulgurite {
    public FulguriteType getType();

    default boolean test(CachedBlockPosition block) {
        return this.getCondition().test((ServerWorld)block.getWorld(), block.getBlockPos());
    }

    public void generate(ServerWorld world, BlockPos blockPos);

    public BlockState getBlock();

    public BlockPredicate getCondition();

    @FunctionalInterface
    public static interface Builder {
        public FulguriteType build();
    }
}
