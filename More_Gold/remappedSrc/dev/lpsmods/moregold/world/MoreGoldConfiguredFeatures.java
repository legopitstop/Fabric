package dev.lpsmods.moregold.world;

import dev.lpsmods.moregold.MoreGold;
import dev.lpsmods.moregold.registry.MoreGoldBlocks;
import net.minecraft.block.*;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Collections;

public class MoreGoldConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOLDEN_FRUIT = registerKey("golden_fruit");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GOLDEN_FRUIT_BEES_005 = registerKey("golden_fruit_bees_005");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        // NORMAL

        register(context, GOLDEN_FRUIT, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MoreGoldBlocks.GOLDEN_LOG), // log
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES), // leaves
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(5,0,2)).build());

        // BEES_005

        register(context, GOLDEN_FRUIT_BEES_005, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(MoreGoldBlocks.GOLDEN_LOG),
                new StraightTrunkPlacer(5,1,1),
                BlockStateProvider.of(Blocks.OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(5,0,2)).decorators(Collections.singletonList(
                new BeehiveTreeDecorator(0.05F))).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MoreGold.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}