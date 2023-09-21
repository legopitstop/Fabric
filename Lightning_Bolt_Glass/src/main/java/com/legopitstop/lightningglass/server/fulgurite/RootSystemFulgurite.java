package com.legopitstop.lightningglass.server.fulgurite;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.legopitstop.lightningglass.util.FulguriteReader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.predicate.BlockPredicate;
import net.minecraft.registry.Registries;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.math.BlockPos;

public class RootSystemFulgurite implements Fulgurite {
    public BlockPredicate condition;
    public BlockState block;

    public RootSystemFulgurite(BlockPredicate condition, BlockState block) {
        this.condition = condition;
        this.block = block;
    }

    @Override
    public FulguriteType getType() {
        return FulguriteTypes.ROOT_SYSTEM;
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
        System.out.println("RootSystemFulgurite.generate");
    }

    public static class Serializer implements JsonSerializer<RootSystemFulgurite> {

        @Override
        public void toJson(JsonObject json, RootSystemFulgurite object, JsonSerializationContext context) {

        }

        @Override
        public RootSystemFulgurite fromJson(JsonObject json, JsonDeserializationContext context) {
            return new RootSystemFulgurite(FulguriteReader.getCondition(json), FulguriteReader.getBlock(json));
        }
    }
}
