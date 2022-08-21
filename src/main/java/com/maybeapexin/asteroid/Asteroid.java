package com.maybeapexin.asteroid;

import java.util.Arrays;

import com.maybeapexin.asteroid.registry.ModRegistry;
import com.maybeapexin.asteroid.registry.blocks.EmeraldNetherOre;
import com.maybeapexin.asteroid.registry.blocks.GemstoneOre;
import com.maybeapexin.asteroid.registry.entities.ColossalSquid;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
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

// Gemstone(Ruby) Ore Generation 
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public static ConfiguredFeature<?, ?> GEMSTONE_ORE_CONFIG_GEN = new ConfiguredFeature
		      (Feature.ORE, new OreFeatureConfig(
		          OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
		         GemstoneOre.GEMSTONE_ORE_BLOCK.getDefaultState(),
		         9)); // vein size
	
	public static PlacedFeature GEMSTONE_ORE_PLACED_GEN = new PlacedFeature(
			RegistryEntry.of(GEMSTONE_ORE_CONFIG_GEN),
			Arrays.asList(
					CountPlacementModifier.of(10), // Veins per chunk
					SquarePlacementModifier.of(), // Horizontal Spread
					HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(45)) // Spawn Height
					));
	
 // Emerald Nether Ore Generation
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ConfiguredFeature<?, ?> EMERALD_NETHER_ORE_CONFIG_GEN = new ConfiguredFeature
			(Feature.ORE, new OreFeatureConfig(
					OreConfiguredFeatures.NETHERRACK,
					EmeraldNetherOre.EMERALD_NETHER_ORE.getDefaultState(),
					9));
	
	public static PlacedFeature EMERALD_NETHER_ORE_PLACED_GEN = new PlacedFeature(
			RegistryEntry.of(EMERALD_NETHER_ORE_CONFIG_GEN),
			Arrays.asList(
					CountPlacementModifier.of(10),
					SquarePlacementModifier.of(),
					HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
					));
	
    @Override
    public void onInitialize() {


        ModRegistry.registerItems();
    }
    

    public static final String MOD_ID = "asteroid";


}