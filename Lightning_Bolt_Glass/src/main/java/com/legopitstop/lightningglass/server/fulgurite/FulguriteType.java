package com.legopitstop.lightningglass.server.fulgurite;

import com.google.gson.JsonElement;

import java.util.function.Function;

public record FulguriteType(Function<JsonElement, Fulgurite> fromJson)  {
    public FulguriteType(Function<JsonElement, Fulgurite> fromJson) {
        this.fromJson = fromJson;
    }

    public Function<JsonElement, Fulgurite> codec() {
        return this.fromJson;
    }
}
