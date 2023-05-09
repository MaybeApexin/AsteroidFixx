package com.maybeapexin.asteroid.registry.items.armor;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CryingObsidianArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {43, 40, 33, 32};
	private static final int[] PROTECTION_AMOUNTS = new int[] {10, 12, 15, 14};


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
		return 45;
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
	}

	@Override
	public float getKnockbackResistance() {
		return 5;
	}

	@Override
	public String getName() {
		return "crying_obsidian";
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.CRYING_OBSIDIAN);
	}

	@Override
	public float getToughness() {
		return 21f;
	}

}
