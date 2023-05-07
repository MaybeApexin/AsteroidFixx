package com.maybeapexin.asteroid.registry.items.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class EmeraldArmorMaterial  implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[] {2, 5, 6, 3};
    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[0]*19;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_AMOUNTS[0];
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }

    @Override
    public String getName() {
        return "emerald";
    }

    @Override
    public float getToughness() {
        return 6f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
