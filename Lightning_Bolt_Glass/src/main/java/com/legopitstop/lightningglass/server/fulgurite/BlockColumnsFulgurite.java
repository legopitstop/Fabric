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

public class BlockColumnsFulgurite implements Fulgurite {
    public BlockPredicate condition;
    public BlockState block;

    public BlockColumnsFulgurite(BlockPredicate condition, BlockState block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public FulguriteType getType() {
        return FulguriteTypes.BLOCK_COLUMNS;
    }

    @Override
    public BlockState getBlock() {
        return this.block;
    }

    @Override
    public BlockPredicate getCondition() {
        return this.condition;
    }

    // TODO - generate fulgurite
    @Override
    public void generate(ServerWorld world, BlockPos blockPos) {
        System.out.println("BlockColumnsFulgurite.generate");
    }

    public static class Serializer implements JsonSerializer<BlockColumnsFulgurite> {

        @Override
        public void toJson(JsonObject json, BlockColumnsFulgurite object, JsonSerializationContext context) {

        }

        @Override
        public BlockColumnsFulgurite fromJson(JsonObject json, JsonDeserializationContext context) {
            return new BlockColumnsFulgurite(FulguriteReader.getCondition(json), FulguriteReader.getBlock(json));
        }
    }
}
