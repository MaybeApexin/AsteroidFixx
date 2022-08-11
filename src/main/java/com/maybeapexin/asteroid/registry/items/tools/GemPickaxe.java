package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import com.maybeapexin.asteroid.registry.toolReg.PickaxeTool;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GemPickaxe {
    public static final PickaxeTool GEMSTONE_PICKAXE = new PickaxeTool(new ToolMaterial() {
        @Override
        public int getDurability() {

            return 1000;
        }

        @Override
        public float getMiningSpeedMultiplier() {

            return 45;
        }

        @Override
        public float getAttackDamage() {

            return 1.2f;
        }

        @Override
        public int getMiningLevel() {

            return 3;
        }

        @Override
        public int getEnchantability() {

            return 22;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(RubyGem.RUBY);
        }
    }, 2, -2.1f, new Item.Settings().group(AsteroidItemGroups.ITEM_GROUP).maxCount(1));
}
