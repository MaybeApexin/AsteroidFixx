package com.maybeapexin.asteroid.registry.items.food;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class EmeraldApple {
    public static final Item EMERALD_APPLE = new Item(new Item.Settings().group(AsteroidItemGroups.MISC_GROUP).food(new FoodComponent.Builder().hunger(21).saturationModifier(21f).snack().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 45*5), 0.7f).build()).rarity(Rarity.EPIC));

}
