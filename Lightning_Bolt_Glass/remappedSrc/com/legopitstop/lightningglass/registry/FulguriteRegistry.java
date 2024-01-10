package com.legopitstop.lightningglass.registry;

import com.legopitstop.lightningglass.server.fulgurite.Fulgurite;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.concurrent.ConcurrentHashMap;

public class FulguriteRegistry {
    public static final ConcurrentHashMap<Identifier, Fulgurite> FULGRUITE = new ConcurrentHashMap<>();
    public static void registerFulgurite(String id, Fulgurite fulgurite) {
        FulguriteRegistry.FULGRUITE.put(new Identifier(id), fulgurite);
    }
    public static void registerFulgurite(Identifier id, Fulgurite fulgurite) {
        FulguriteRegistry.FULGRUITE.put(id, fulgurite);
    }

    public static void clearFulgurites() {
        FulguriteRegistry.FULGRUITE.clear();
    }

    public static void removeFulgurite(Identifier id) {
        FulguriteRegistry.FULGRUITE.remove(id);
    }

    public static int sizeFulgurite() {
        return FulguriteRegistry.FULGRUITE.size();
    }

    public static void generateFulgurite(ServerWorld world, CachedBlockPosition cachedBlock) {
        for (Fulgurite fulgurite : FulguriteRegistry.FULGRUITE.values()) {
            if (fulgurite.test(cachedBlock)) {
                fulgurite.generate(world, cachedBlock.getBlockPos());
                break;
            }
        }
    }
}
