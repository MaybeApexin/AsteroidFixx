package com.maybeapexin.asteroid.registry.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class GemstoneOre {
    public static final Block GEMSTONE_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(7.5f).requiresTool());
    
}
