package com.maybeapexin.asteroid.registry.items.tools;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Rarity;

public class GemShovel {

    public static final ShovelItem GEMSTONE_SHOVEL = new ShovelItem(new ToolMaterial() {
        @Override
        public int getDurability() {
            return 450;
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
    }, 1.5f, -2.7f, new Item.Settings().group(AsteroidItemGroups.ITEM_GROUP));
}
