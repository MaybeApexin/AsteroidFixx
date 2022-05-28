package com.maybeapexin.asteroid;

import com.maybeapexin.asteroid.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;


public class Asteroid implements ModInitializer {


    @Override
    public void onInitialize() {


        ModRegistry.registerItems();
    }


    public static final String MOD_ID = "asteroid";


}