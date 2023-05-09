package com.maybeapexin.asteroid.registry.items.food;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Surstromming {
	public static final Item SURSTROMMING = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(3).snack().statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 35*5), 0.7f).build()).rarity(Rarity.RARE));
}
