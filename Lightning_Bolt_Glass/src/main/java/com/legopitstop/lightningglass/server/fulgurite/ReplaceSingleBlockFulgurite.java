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

import java.util.Optional;
import java.util.Set;

public record ReplaceSingleBlockFulgurite(BlockPredicate predicate, BlockState block) implements Fulgurite {
    public ReplaceSingleBlockFulgurite(BlockPredicate predicate, BlockState block) {
        this.predicate = predicate;
        this.block = block;
    }

    @Override
    public FulguriteType getType() {
        return FulguriteTypes.REPLACE_SINGLE_BLOCK;
    }

    @Override
    public boolean test(CachedBlockPosition block) {
        return this.predicate.test((ServerWorld)block.getWorld(), block.getBlockPos());
    }

    @Override
    public void generate(ServerWorld world, BlockPos blockPos) {
        world.setBlockState(blockPos, this.block);
    }

    public static ReplaceSingleBlockFulgurite fromJson(JsonElement json) {
        JsonObject jsonObject = json.getAsJsonObject();
        JsonObject predicateObject = JsonHelper.getObject(jsonObject, "predicate");
        BlockPredicate predicate = BlockPredicate.fromJson(predicateObject);
        JsonObject blockObject = JsonHelper.getObject(jsonObject, "block");
        Optional<BlockState> block = Optional.of((BlockState) Util.getResult(BlockState.CODEC.parse(JsonOps.INSTANCE, blockObject), JsonParseException::new));
        return new ReplaceSingleBlockFulgurite(predicate, block.get());
    }
}
