package com.maybeapexin.asteroid.registry;

import com.maybeapexin.asteroid.Asteroid;
import com.maybeapexin.asteroid.registry.blocks.EmeraldNetherOre;
import com.maybeapexin.asteroid.registry.blocks.GemstoneBlock;
import com.maybeapexin.asteroid.registry.blocks.GemstoneOre;
import com.maybeapexin.asteroid.registry.items.armor.CryingObsidianArmorMaterial;
import com.maybeapexin.asteroid.registry.items.armor.EmeraldArmorMaterial;
import com.maybeapexin.asteroid.registry.items.armor.GemArmorMaterial;
import com.maybeapexin.asteroid.registry.items.armor.ObsidianArmorMaterial;
import com.maybeapexin.asteroid.registry.items.food.BowlOfRice;
import com.maybeapexin.asteroid.registry.items.food.EmeraldApple;
import com.maybeapexin.asteroid.registry.items.food.Surstromming;
import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import com.maybeapexin.asteroid.registry.items.tools.*;
import com.maybeapexin.asteroid.registry.items.weapons.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import static com.maybeapexin.asteroid.registry.AsteroidItemGroups.ITEM_GROUP;


public class ModRegistry {
    public static final ArmorMaterial GEMSTONE_ARMOR = new GemArmorMaterial();
    public static final ArmorMaterial EMERALD_ARMOR = new EmeraldArmorMaterial();
    public static final ArmorMaterial OBSIDIAN_ARMOR = new ObsidianArmorMaterial();
    public static final ArmorMaterial CRYING_OBSIDIAN_ARMOR = new CryingObsidianArmorMaterial();
    // Armor Items (OBSIDIAN)
    public static final ArmorItem OBSIDIAN_HELMET = new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final ArmorItem OBSIDIAN_CHESTPLATE = new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final ArmorItem OBSIDIAN_LEGGINGS = new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final ArmorItem OBSIDIAN_BOOTS = new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());
    // CRYING OBSIDIAN
    public static final ArmorItem CRYING_OBSIDIAN_HELMET = new ArmorItem(CRYING_OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final ArmorItem CRYING_OBSIDIAN_CHESTPLATE = new ArmorItem(CRYING_OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final ArmorItem CRYING_OBSIDIAN_LEGGINGS = new ArmorItem(CRYING_OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final ArmorItem CRYING_OBSIDIAN_BOOTS = new ArmorItem(CRYING_OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());
    // EMERALD
    public static final ArmorItem EMERALD_HELMET = new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final ArmorItem EMERALD_CHESTPLATE = new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final ArmorItem EMERALD_LEGGINGS = new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final ArmorItem EMERALD_BOOTS = new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());
    // GEMSTONE
    public static  final ArmorItem GEMSTONE_HELMET = new ArmorItem(GEMSTONE_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final ArmorItem GEMSTONE_CHESTPLATE = new ArmorItem(GEMSTONE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final ArmorItem GEMSTONE_LEGGINGS = new ArmorItem(GEMSTONE_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final ArmorItem GEMSTONE_BOOTS = new ArmorItem(GEMSTONE_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static void registerItems() {
        // Block(s)
        Registry.register(Registries.BLOCK, new Identifier(Asteroid.MOD_ID, "gemstone_ore"), GemstoneOre.GEMSTONE_ORE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_ore"), new BlockItem(GemstoneOre.GEMSTONE_ORE_BLOCK, new FabricItemSettings()));
        Registry.register(Registries.BLOCK, new Identifier(Asteroid.MOD_ID, "emerald_nether_ore"), EmeraldNetherOre.EMERALD_NETHER_ORE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_nether_ore"), new BlockItem(EmeraldNetherOre.EMERALD_NETHER_ORE, new FabricItemSettings()));
        Registry.register(Registries.BLOCK, new Identifier(Asteroid.MOD_ID, "gemstone_block"), GemstoneBlock.GEMSTONE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_block"), new BlockItem(GemstoneBlock.GEMSTONE_BLOCK, new FabricItemSettings()));
        // Misc ITEM
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "bowl_o_rice"), BowlOfRice.BOWL_O_RICE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_apple"), EmeraldApple.EMERALD_APPLE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "surstromming"), Surstromming.SURSTROMMING);
        // Gemstone Tools
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "ruby"), RubyGem.RUBY);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_sword"), GemSword.GEMSTONE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_pickaxe"), GemPickaxe.GEMSTONE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_axe"), GemAxe.GEMSTONE_AXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_shovel"), GemShovel.GEMSTONE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_bow"), GemBow.GEMSTONE_BOW);
        // Gemstone Armor
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_helmet"), GEMSTONE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_chestplate"), GEMSTONE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_leggings"), GEMSTONE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_boots"), GEMSTONE_BOOTS);
        // Emerald Tools
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_sword"), EmeraldSword.EMERALD_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_pickaxe"), EmeraldPickaxe.EMERALD_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_axe"), EmeraldAxe.EMERALD_AXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_shovel"), EmeraldShovel.EMERALD_SHOVEL);
        // Emerald Armor
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_boots"), EMERALD_BOOTS);
        // Obsidian Armor
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_boots"), OBSIDIAN_BOOTS);
        // Obsidian Tools
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_sword"), ObsidianSword.OBSIDIAN_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_pickaxe"), ObsidianPickaxe.OBSIDIAN_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_axe"), ObsidianAxe.OBSIDIAN_AXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_shovel"), ObsidianShovel.OBSIDIAN_SHOVEL);
        // Crying Obsidian Armor
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_helmet"), CRYING_OBSIDIAN_HELMET);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_chestplate"), CRYING_OBSIDIAN_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_leggings"), CRYING_OBSIDIAN_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_boots"), CRYING_OBSIDIAN_BOOTS);
        // Crying Obsidian Tools
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_sword"), CryingObsidianSword.CRYING_OBSIDIAN_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_pickaxe"), CryingObsidianPickaxe.CRYING_OBSIDIAN_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_axe"), CryingObsidianAxe.CRYING_OBSIDIAN_AXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_shovel"), CryingObsidianShovel.CRYING_OBSIDIAN_SHOVEL);

            ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
                content.add(GemSword.GEMSTONE_SWORD);
                content.add(GemPickaxe.GEMSTONE_PICKAXE);
                content.add(GemAxe.GEMSTONE_AXE);
                content.add(GemShovel.GEMSTONE_SHOVEL);
                content.add(EmeraldSword.EMERALD_SWORD);
                content.add(EmeraldPickaxe.EMERALD_PICKAXE);
                content.add(EmeraldAxe.EMERALD_AXE);
                content.add(EmeraldShovel.EMERALD_SHOVEL);
                content.add(OBSIDIAN_HELMET);
                content.add(OBSIDIAN_CHESTPLATE);
                content.add(OBSIDIAN_LEGGINGS);
                content.add(OBSIDIAN_BOOTS);
                content.add(CRYING_OBSIDIAN_HELMET);
                content.add(CRYING_OBSIDIAN_CHESTPLATE);
                content.add(CRYING_OBSIDIAN_LEGGINGS);
                content.add(CRYING_OBSIDIAN_BOOTS);
                content.add(EMERALD_HELMET);
                content.add(EMERALD_CHESTPLATE);
                content.add(EMERALD_LEGGINGS);
                content.add(EMERALD_BOOTS);
                content.add(GEMSTONE_HELMET);
                content.add(GEMSTONE_CHESTPLATE);
                content.add(GEMSTONE_LEGGINGS);
                content.add(GEMSTONE_BOOTS);
                content.add(GemstoneOre.GEMSTONE_ORE_BLOCK);
                content.add(EmeraldNetherOre.EMERALD_NETHER_ORE);
                content.add(GemstoneBlock.GEMSTONE_BLOCK);
                content.add(RubyGem.RUBY);
                content.add(BowlOfRice.BOWL_O_RICE);
                content.add(Surstromming.SURSTROMMING);
                content.add(EmeraldApple.EMERALD_APPLE);
            });

        }

}
