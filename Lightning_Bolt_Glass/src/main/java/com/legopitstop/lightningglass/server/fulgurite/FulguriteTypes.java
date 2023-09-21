package com.legopitstop.lightningglass.server.fulgurite;

import com.google.gson.JsonSyntaxException;
import com.legopitstop.lightningglass.LightningGlass;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonSerializer;

import java.util.concurrent.ConcurrentHashMap;

public class FulguriteTypes {
    public static final ConcurrentHashMap<Identifier, FulguriteType> INSTANCE = new ConcurrentHashMap<>();

    public static final FulguriteType ROOT_SYSTEM = FulguriteTypes.register("root_system", new RootSystemFulgurite.Serializer());
    public static final FulguriteType REPLACE_SINGLE_BLOCK = FulguriteTypes.register("replace_single_block", new ReplaceSingleBlockFulgurite.Serializer());
    public static final FulguriteType BLOCK_COLUMNS = FulguriteTypes.register("block_columns", new BlockColumnsFulgurite.Serializer());

    private static FulguriteType register(String id, JsonSerializer<? extends Fulgurite> serializer) {
        return FulguriteTypes.register(new Identifier(LightningGlass.MOD_ID, id), serializer);
    }

    private static FulguriteType register(Identifier id, JsonSerializer<? extends Fulgurite> serializer) {
        return FulguriteTypes.INSTANCE.put(id, new FulguriteType(serializer));
    }

    public static FulguriteType get(String string) {
        FulguriteType type = FulguriteTypes.INSTANCE.getOrDefault(new Identifier(string), null);
        if (type == null) {
            throw new JsonSyntaxException("Unknown fulgurite type '" + string + "'");
        }
        return type;
    }

}
