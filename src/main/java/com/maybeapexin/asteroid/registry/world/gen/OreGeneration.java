package com.maybeapexin.asteroid.registry.world.gen;

import com.maybeapexin.asteroid.registry.world.AsteroidPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class OreGeneration {
    public static void generateGemstoneOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AsteroidPlacedFeatures.GEMSTONE_PLACED_KEY);
    }
    public static void generateEmeraldNetherOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.RAW_GENERATION, AsteroidPlacedFeatures.EMERALD_NETHER_PLACED_KEY);
    }
}
