package com.legopitstop.lightningglass.registry;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.util.Identifier;

import java.util.concurrent.ConcurrentHashMap;

public class FulguriteRegistry {
    public static final ConcurrentHashMap<Identifier, Fulgurite> INSTANCE = new ConcurrentHashMap<>();

    public static void add(Identifier id, Fulgurite fulgurite) {
        FulguriteRegistry.INSTANCE.put(id, fulgurite);
    }

    public static void clear() {
        FulguriteRegistry.INSTANCE.clear();
    }

    public static void remove(Identifier id) {
        FulguriteRegistry.INSTANCE.remove(id);
    }

    public static int size() {
        return FulguriteRegistry.INSTANCE.size();
    }

    public static BlockState getBlock(CachedBlockPosition cachedBlock) {
        for (Fulgurite fulgurite : FulguriteRegistry.INSTANCE.values()) {
            if (fulgurite.getSource().test(cachedBlock)) {
                return fulgurite.getResult();
            }
        }
        return Blocks.AIR.getDefaultState();
    }
}
