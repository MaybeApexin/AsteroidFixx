package com.maybeapexin.asteroid.registry.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class EmeraldNetherOre {
	public static final Block EMERALD_NETHER_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(10.5f).requiresTool());

}
