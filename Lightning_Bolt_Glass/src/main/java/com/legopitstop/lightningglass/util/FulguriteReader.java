package com.legopitstop.lightningglass.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.predicate.BlockPredicate;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;

public class FulguriteReader {

    public static BlockState getBlock(JsonObject json) {
        JsonObject blockObj = JsonHelper.getObject(json, "block");
        String string = JsonHelper.getString(blockObj, "Name");
        Block block = Registries.BLOCK.getOrEmpty(new Identifier(string)).orElseThrow(() -> {
            return new JsonSyntaxException("Unknown block '" + string + "'");
        });
        return block.getDefaultState();
    }

    public static BlockPredicate getCondition(JsonObject json) {
        return BlockPredicate.fromJson(JsonHelper.getObject(json, "condition"));
    }
}
