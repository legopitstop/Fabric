package com.legopitstop.moregold.world;

import com.legopitstop.moregold.MoreGold;
import com.legopitstop.moregold.registry.MoreGoldBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class MoreGoldPlacedFeatures {
    public static final RegistryKey<PlacedFeature> TREES_GOLDEN_FRUIT = registerKey("trees_golden_fruit");
    public static final RegistryKey<PlacedFeature> GOLDEN_FRUIT_BEES_005_PLACED = registerKey("golden_fruit_bees_005");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        // NORMAL
        register(context, TREES_GOLDEN_FRUIT, configuredFeatureRegistryEntryLookup.getOrThrow(MoreGoldConfiguredFeatures.GOLDEN_FRUIT),
                RarityFilterPlacementModifier.of(64),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(MoreGoldBlocks.GOLDEN_FRUIT_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));

        // BEES
        register(context, GOLDEN_FRUIT_BEES_005_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(MoreGoldConfiguredFeatures.GOLDEN_FRUIT_BEES_005),
                RarityFilterPlacementModifier.of(128),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                BiomePlacementModifier.of(),
                BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(MoreGoldBlocks.GOLDEN_FRUIT_SAPLING.getDefaultState(), BlockPos.ORIGIN) ));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MoreGold.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}