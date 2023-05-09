package com.maybeapexin.asteroid.registry.items.weapons;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianSword {
	 public static final SwordItem OBSIDIAN_SWORD = new SwordItem(new ToolMaterial() {
	        @Override
	        public int getDurability() {

	            return 850;
	        }

	        @Override
	        public float getMiningSpeedMultiplier() {

	            return 0;
	        }

	        @Override
	        public float getAttackDamage() {

	            return 21.5f;
	        }

	        @Override
	        public int getMiningLevel() {

	            return 0;
	        }

	        @Override
	        public int getEnchantability() {

	            return 22;
	        }

	        @Override
	        public Ingredient getRepairIngredient() {

	        	 return Ingredient.ofItems(Items.OBSIDIAN);
	        }
	    }, 21, 5, new Item.Settings());
}
