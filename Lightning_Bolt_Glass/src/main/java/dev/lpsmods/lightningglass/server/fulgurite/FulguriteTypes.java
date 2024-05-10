package dev.lpsmods.lightningglass.server.fulgurite;

import com.google.gson.JsonSyntaxException;
import com.mojang.serialization.Codec;
import net.minecraft.util.Identifier;

import java.util.concurrent.ConcurrentHashMap;

public class FulguriteTypes {
    public static final ConcurrentHashMap<Identifier, FulguriteType> INSTANCE = new ConcurrentHashMap<>();

    public static final FulguriteType ROOT_SYSTEM;
    public static final FulguriteType REPLACE_SINGLE_BLOCK;

    private static FulguriteType register(String id, Codec<? extends Fulgurite> codec) {
        return register(new Identifier(id), codec);
    }

    public static FulguriteType register(Identifier id, Codec<? extends Fulgurite> codec) {
        return FulguriteTypes.INSTANCE.put(id, new FulguriteType(codec));
    }

    public static FulguriteType get(String string) {
        FulguriteType type = FulguriteTypes.INSTANCE.getOrDefault(new Identifier(string), null);
        if (type == null) {
            throw new JsonSyntaxException("Unknown fulgurite type '" + string + "'");
        }
        return type;
    }

    static {
        ROOT_SYSTEM = FulguriteTypes.register("root_system", RootSystemFulgurite.CODEC);
        REPLACE_SINGLE_BLOCK = FulguriteTypes.register("replace_single_block", ReplaceSingleBlockFulgurite.CODEC);
    }

}
