package com.legopitstop.moregold.world.tree;

import com.legopitstop.moregold.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class GoldenFruitSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return bees ? ModConfiguredFeatures.GOLDEN_FRUIT_BEES_005 : ModConfiguredFeatures.GOLDEN_FRUIT;
    }
}
