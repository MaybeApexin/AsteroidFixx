package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.toolReg.PickaxeTool;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldPickaxe {
    public static final PickaxeTool EMERALD_PICKAXE = new PickaxeTool(new ToolMaterial() {
        @Override
        public int getDurability() {

            return 560;
        }

        @Override
        public float getMiningSpeedMultiplier() {

            return 35;
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
            return Ingredient.ofItems(Items.EMERALD);
        }
    }, 1, -2.6f, new Item.Settings().maxCount(1));
}
