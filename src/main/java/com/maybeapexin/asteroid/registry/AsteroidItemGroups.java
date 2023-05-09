package com.maybeapexin.asteroid.registry;

import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;



public class AsteroidItemGroups {
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(
                    new Identifier("asteroid", "library"))
            .icon(() -> new ItemStack(RubyGem.RUBY))
            .build();
}
