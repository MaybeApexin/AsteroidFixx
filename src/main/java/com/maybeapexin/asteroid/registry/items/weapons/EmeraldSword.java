package com.maybeapexin.asteroid.registry.items.weapons;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldSword {
    public static final SwordItem EMERALD_SWORD = new SwordItem(new ToolMaterial() {
        @Override
        public int getDurability() {

            return 750;
        }

        @Override
        public float getMiningSpeedMultiplier() {

            return 0;
        }

        @Override
        public float getAttackDamage() {

            return 10.5f;
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

            return Ingredient.ofItems(Items.EMERALD);
        }
    }, 9, 5, new Item.Settings().group(AsteroidItemGroups.ITEM_GROUP));
}
