package com.maybeapexin.asteroid;

import com.maybeapexin.asteroid.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;

import static com.maybeapexin.asteroid.registry.world.gen.WorldGeneration.generateWorldGen;

public class Asteroid implements ModInitializer {
    @Override
    public void onInitialize() {
        generateWorldGen();
        ModRegistry.registerItems();
    }



    public static final String MOD_ID = "asteroid";


}