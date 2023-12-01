package com.legopitstop.lightningglass.server.fulgurite;

import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.mojang.serialization.Codec;
import net.minecraft.util.Identifier;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

public class FulguriteTypes {
    public static final ConcurrentHashMap<Identifier, FulguriteType> INSTANCE = new ConcurrentHashMap<>();

    public static final FulguriteType ROOT_SYSTEM;
    public static final FulguriteType REPLACE_SINGLE_BLOCK;

    private static FulguriteType register(String id, Function<JsonElement, Fulgurite> fromJson) {
        return register(new Identifier(id), fromJson);
    }

    public static FulguriteType register(Identifier id, Function<JsonElement, Fulgurite> fromJson) {
        return FulguriteTypes.INSTANCE.put(id, new FulguriteType(fromJson));
    }

    public static FulguriteType get(String string) {
        FulguriteType type = FulguriteTypes.INSTANCE.getOrDefault(new Identifier(string), null);
        if (type == null) {
            throw new JsonSyntaxException("Unknown fulgurite type '" + string + "'");
        }
        return type;
    }

    static {
        ROOT_SYSTEM = FulguriteTypes.register("root_system", RootSystemFulgurite::fromJson);
        REPLACE_SINGLE_BLOCK = FulguriteTypes.register("replace_single_block", ReplaceSingleBlockFulgurite::fromJson);
    }
}
