package com.maybeapexin.asteroid.registry.items.armor;

import com.maybeapexin.asteroid.registry.AsteroidItemGroups;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;


public class BaseArmor extends ArmorItem {

    public BaseArmor(ArmorMaterial material, EquipmentSlot slot ) {
        super(material, slot, new Item.Settings().group(AsteroidItemGroups.ITEM_GROUP).rarity(Rarity.EPIC));

        }

}
