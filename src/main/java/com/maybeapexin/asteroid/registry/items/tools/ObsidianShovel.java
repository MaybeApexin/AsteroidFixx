package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianShovel {
	 public static final ShovelItem OBSIDIAN_SHOVEL = new ShovelItem(new ToolMaterial() {
		 @Override
	        public int getDurability() {
	            return 850;
	        }

	        @Override
	        public float getMiningSpeedMultiplier() {
	            return 20;
	        }

	        @Override
	        public float getAttackDamage() {
	            return 13.7f;
	        }

	        @Override
	        public int getMiningLevel() {
	            return 5;
	        }

	        @Override
	        public int getEnchantability() {
	            return 35;
	        }

	        @Override
	        public Ingredient getRepairIngredient() {
	            return Ingredient.ofItems(Items.OBSIDIAN);
	        }
	    }, 13, 1f, new Item.Settings());
}
