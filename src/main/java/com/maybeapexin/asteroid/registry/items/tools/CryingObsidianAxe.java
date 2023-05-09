package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import com.maybeapexin.asteroid.registry.toolReg.AxeTool;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CryingObsidianAxe {
	 public static final AxeTool CRYING_OBSIDIAN_AXE = new AxeTool(new ToolMaterial() {
	        @Override
	        public int getDurability() {
	            return 1050;
	        }

	        @Override
	        public float getMiningSpeedMultiplier() {
	            return 35;
	        }

	        @Override
	        public float getAttackDamage() {
	            return 20.7f;
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
	    }, 20.5f, 2.2f, new Item.Settings());
}
