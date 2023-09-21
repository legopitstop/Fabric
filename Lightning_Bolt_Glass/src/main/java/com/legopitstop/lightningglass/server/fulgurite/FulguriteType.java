package com.legopitstop.lightningglass.server.fulgurite;

import net.minecraft.util.JsonSerializableType;
import net.minecraft.util.JsonSerializer;

public class FulguriteType extends JsonSerializableType<Fulgurite> {
    public FulguriteType(JsonSerializer<? extends Fulgurite> jsonSerializer) {
        super(jsonSerializer);
    }
}
