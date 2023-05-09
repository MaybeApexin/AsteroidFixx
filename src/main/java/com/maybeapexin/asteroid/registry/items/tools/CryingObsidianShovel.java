package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CryingObsidianShovel {
	 public static final ShovelItem CRYING_OBSIDIAN_SHOVEL = new ShovelItem(new ToolMaterial() {
		 @Override
	        public int getDurability() {
	            return 1050;
	        }

	        @Override
	        public float getMiningSpeedMultiplier() {
	            return 30;
	        }

	        @Override
	        public float getAttackDamage() {
	            return 16.7f;
	        }

	        @Override
	        public int getMiningLevel() {
	            return 7;
	        }

	        @Override
	        public int getEnchantability() {
	            return 50;
	        }

	        @Override
	        public Ingredient getRepairIngredient() {
	        	return Ingredient.ofItems(Items.CRYING_OBSIDIAN);
	        }
	    }, 20, 2.2f, new Item.Settings());
}
