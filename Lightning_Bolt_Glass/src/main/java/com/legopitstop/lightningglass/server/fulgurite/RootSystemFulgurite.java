package com.legopitstop.lightningglass.server.fulgurite;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.JsonOps;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.predicate.BlockPredicate;
import net.minecraft.predicate.NbtPredicate;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;

import java.util.Optional;
import java.util.Set;

public record RootSystemFulgurite(BlockPredicate predicate, BlockState block, int maxColumnHeight, int radius, int placementAttempts) implements Fulgurite {
    public RootSystemFulgurite(BlockPredicate predicate, BlockState block, int maxColumnHeight, int radius, int placementAttempts) {
        this.predicate = predicate;
        this.block = block;
        this.maxColumnHeight = maxColumnHeight;
        this.radius = radius;
        this.placementAttempts = placementAttempts;
    }

    @Override
    public FulguriteType getType() {
        return FulguriteTypes.ROOT_SYSTEM;
    }

    @Override
    public boolean test(CachedBlockPosition block) {
        return this.predicate.test((ServerWorld)block.getWorld(), block.getBlockPos());
    }

    // All the below code is a modified version of net.minecraft.world.gen.feature.RootSystemFeature

    @Override
    public void generate(ServerWorld world, BlockPos blockPos) {
        Random random = world.getRandom();
        generateRootsColumn(blockPos, blockPos.getY() - this.maxColumnHeight, world, random);
    }

    private void generateRootsColumn(BlockPos pos, int maxY, StructureWorldAccess world, Random random) {
        int i = pos.getX();
        int j = pos.getZ();
        BlockPos.Mutable mutable = pos.mutableCopy();
        for (int k = pos.getY(); k > maxY; k--) {
            generateRoots(world, random, i, j, mutable.set(i, k, j));
        }
    }

    private void generateRoots(StructureWorldAccess world, Random random, int x, int z, BlockPos.Mutable mutablePos) {
        int i = this.radius;
        for(int j = 0; j < this.placementAttempts; ++j) {
            mutablePos.set(mutablePos, random.nextInt(i) - random.nextInt(i), 0, random.nextInt(i) - random.nextInt(i));
            if (this.predicate.test((ServerWorld)world, mutablePos)) {
                world.setBlockState(mutablePos, this.block, 2);
            }
            mutablePos.setX(x);
            mutablePos.setZ(z);
        }
    }

    public static RootSystemFulgurite fromJson(JsonElement json) {
        JsonObject jsonObject = json.getAsJsonObject();
        int maxColumnHeight = JsonHelper.getInt(jsonObject, "column_max_height");
        int radius = JsonHelper.getInt(jsonObject, "radius");
        int placementAttempts = JsonHelper.getInt(jsonObject, "placement_attempts");
        JsonObject predicateObject = JsonHelper.getObject(jsonObject, "predicate");
        BlockPredicate predicate = BlockPredicate.fromJson(predicateObject);
        JsonObject blockObject = JsonHelper.getObject(jsonObject, "block");
        Optional<BlockState> block = Optional.of((BlockState) Util.getResult(BlockState.CODEC.parse(JsonOps.INSTANCE, blockObject), JsonParseException::new));
        return new RootSystemFulgurite(predicate, block.get(), maxColumnHeight, radius, placementAttempts);
    }
}
