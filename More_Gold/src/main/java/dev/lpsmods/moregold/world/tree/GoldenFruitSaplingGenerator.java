package dev.lpsmods.moregold.world.tree;

import dev.lpsmods.moregold.world.MoreGoldConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class GoldenFruitSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return bees ? MoreGoldConfiguredFeatures.GOLDEN_FRUIT_BEES_005 : MoreGoldConfiguredFeatures.GOLDEN_FRUIT;
    }
}
