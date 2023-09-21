package com.legopitstop.lightningglass.server.fulgurite;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.legopitstop.lightningglass.util.FulguriteReader;
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

public class ReplaceSingleBlockFulgurite implements Fulgurite {
    public BlockPredicate condition;
    public BlockState block;

    public ReplaceSingleBlockFulgurite(BlockPredicate condition, BlockState block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public FulguriteType getType() {
        return FulguriteTypes.REPLACE_SINGLE_BLOCK;
    }

    @Override
    public BlockState getBlock() {
        return this.block;
    }

    @Override
    public BlockPredicate getCondition() {
        return this.condition;
    }

    @Override
    public void generate(ServerWorld world, BlockPos blockPos) {
        world.setBlockState(blockPos, this.block);
    }

    public static class Serializer implements JsonSerializer<ReplaceSingleBlockFulgurite> {

        @Override
        public void toJson(JsonObject json, ReplaceSingleBlockFulgurite object, JsonSerializationContext context) {

        }

        @Override
        public ReplaceSingleBlockFulgurite fromJson(JsonObject json, JsonDeserializationContext context) {
            return new ReplaceSingleBlockFulgurite(FulguriteReader.getCondition(json), FulguriteReader.getBlock(json));
        }
    }
}
