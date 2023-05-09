package com.maybeapexin.asteroid.registry.world;

import com.maybeapexin.asteroid.Asteroid;
import com.maybeapexin.asteroid.registry.blocks.EmeraldNetherOre;
import com.maybeapexin.asteroid.registry.blocks.GemstoneOre;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class AsteroidConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> GEMSTONE_KEY = registerKey("gemstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EMERALD_NETHER_KEY = registerKey("emerald_nether_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest StoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest NetherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);


        List<OreFeatureConfig.Target> overworldGemstoneOres =
                List.of(OreFeatureConfig.createTarget(StoneReplaceables, GemstoneOre.GEMSTONE_ORE_BLOCK.getDefaultState()));

        List<OreFeatureConfig.Target> netherEmeraldOre =
                List.of(OreFeatureConfig.createTarget(NetherReplaceables, EmeraldNetherOre.EMERALD_NETHER_ORE.getDefaultState()));

        register(context, GEMSTONE_KEY, Feature.ORE, new OreFeatureConfig(overworldGemstoneOres, 2));
        register(context, EMERALD_NETHER_KEY, Feature.ORE, new OreFeatureConfig(netherEmeraldOre, 3));
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Asteroid.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}


