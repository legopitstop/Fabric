package com.legopitstop.lightningglass.server.fulgurite;

import com.mojang.serialization.Codec;

public record FulguriteType(Codec<? extends Fulgurite> codec)  {
    public FulguriteType(Codec<? extends Fulgurite> codec) {
        this.codec = codec;
    }

    public Codec<? extends Fulgurite> codec() {
        return this.codec;
    }
}
