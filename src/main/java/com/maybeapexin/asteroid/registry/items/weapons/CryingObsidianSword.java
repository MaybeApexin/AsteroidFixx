package com.maybeapexin.asteroid.registry.items.weapons;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CryingObsidianSword {
	 public static final SwordItem CRYING_OBSIDIAN_SWORD = new SwordItem(new ToolMaterial() {
	        @Override
	        public int getDurability() {

	            return 1050;
	        }

	        @Override
	        public float getMiningSpeedMultiplier() {

	            return 0;
	        }

	        @Override
	        public float getAttackDamage() {

	            return 30.5f;
	        }

	        @Override
	        public int getMiningLevel() {

	            return 0;
	        }

	        @Override
	        public int getEnchantability() {

	            return 35;
	        }

	        @Override
	        public Ingredient getRepairIngredient() {

	        	 return Ingredient.ofItems(Items.CRYING_OBSIDIAN);
	        }
	    }, 30, 10, new Item.Settings());
}
