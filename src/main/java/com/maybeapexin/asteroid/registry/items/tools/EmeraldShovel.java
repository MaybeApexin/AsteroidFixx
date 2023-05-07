package com.maybeapexin.asteroid.registry.items.tools;


import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldShovel {

    public static final ShovelItem EMERALD_SHOVEL = new ShovelItem(new ToolMaterial() {
        @Override
        public int getDurability() {
            return 400;
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
    }, 1f, -1.7f, new Item.Settings());
}
