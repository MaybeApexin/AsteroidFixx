package com.maybeapexin.asteroid;

import java.util.Arrays;

import com.maybeapexin.asteroid.registry.ModRegistry;
import com.maybeapexin.asteroid.registry.blocks.GemstoneOre;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;


public class Asteroid implements ModInitializer {


	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public static ConfiguredFeature<?, ?> GEMSTONE_ORE_CONFIG_GEN = new ConfiguredFeature
		      (Feature.ORE, new OreFeatureConfig(
		          OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
		         GemstoneOre.GEMSTONE_ORE_BLOCK.getDefaultState(),
		         6)); // vein size
	
	public static PlacedFeature GEMSTONE_ORE_PLACED_GEN = new PlacedFeature(
			RegistryEntry.of(GEMSTONE_ORE_CONFIG_GEN),
			Arrays.asList(
					CountPlacementModifier.of(3), // Veins per chunk
					SquarePlacementModifier.of(), // Horizontal Spread
					HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)) // Spawn Height
					));
			

	
    @Override
    public void onInitialize() {


        ModRegistry.registerItems();
    }


    public static final String MOD_ID = "asteroid";


}