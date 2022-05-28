package com.maybeapexin.asteroid.registry.items.weapons;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class GemBow {


    public static final BowItem GEMSTONE_BOW = new BowItem(new Item.Settings().group(AsteroidItemGroups.ITEM_GROUP).maxCount(1).maxDamage(99));


}
