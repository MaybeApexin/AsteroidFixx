package com.maybeapexin.asteroid.registry.world;

import com.maybeapexin.asteroid.Asteroid;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class AsteroidPlacedFeatures {
    public static final RegistryKey<PlacedFeature> GEMSTONE_PLACED_KEY = registerKey("gemstone_ore");
    public static final RegistryKey<PlacedFeature> EMERALD_NETHER_PLACED_KEY = registerKey("emerald_nether_ore");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, GEMSTONE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AsteroidConfiguredFeatures.GEMSTONE_KEY),
                OrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(0))));

        register(context, EMERALD_NETHER_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(AsteroidConfiguredFeatures.EMERALD_NETHER_KEY),
                OrePlacement.modifiersWithRarity(45, HeightRangePlacementModifier.uniform(YOffset.TOP, YOffset.TOP)));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Asteroid.MOD_ID, name));
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
