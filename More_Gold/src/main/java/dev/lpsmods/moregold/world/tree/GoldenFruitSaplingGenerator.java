package dev.lpsmods.moregold.world.tree;

import dev.lpsmods.moregold.world.MoreGoldConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class GoldenFruitSaplingGenerator extends SaplingGenerator {
    public GoldenFruitSaplingGenerator(String id, Optional<RegistryKey<ConfiguredFeature<?, ?>>> megaVariant, Optional<RegistryKey<ConfiguredFeature<?, ?>>> regularVariant, Optional<RegistryKey<ConfiguredFeature<?, ?>>> beesVariant) {
        super(id, megaVariant, regularVariant, beesVariant);
    }

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return bees ? MoreGoldConfiguredFeatures.GOLDEN_FRUIT_BEES_005 : MoreGoldConfiguredFeatures.GOLDEN_FRUIT;
    }
}
