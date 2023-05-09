package com.maybeapexin.asteroid.registry.items.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ObsidianArmorMaterial implements ArmorMaterial {

	private static final int[] BASE_DURABILITY = new int[] {21, 24, 22, 21};
	private static final int[] PROTECTION_AMOUNTS = new int[] {7, 8, 9, 5};

	@Override
	public int getDurability(ArmorItem.Type type) {
		return BASE_DURABILITY[0]*45;
	}

	@Override
	public int getProtection(ArmorItem.Type type) {
		return PROTECTION_AMOUNTS[0]*7;
	}

	@Override
	public int getEnchantability() {
		return 35;
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
	}

	@Override
	public float getKnockbackResistance() {
		return 3;
	}

	@Override
	public String getName() {
		return "obsidian";
	}


	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.OBSIDIAN);
	}

	@Override
	public float getToughness() {
		return 13f;
	}

}
