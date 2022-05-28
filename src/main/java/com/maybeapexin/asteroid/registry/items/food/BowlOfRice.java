package com.maybeapexin.asteroid.registry.items.food;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class BowlOfRice {
    public static final Item BOWL_O_RICE = new Item(new Item.Settings().group(AsteroidItemGroups.MISC_GROUP).food(new FoodComponent.Builder().hunger(12).saturationModifier(12f).snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*5), 0.7f).build()).rarity(Rarity.EPIC));
}
