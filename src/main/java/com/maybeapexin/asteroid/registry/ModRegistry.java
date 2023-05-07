package com.maybeapexin.asteroid.registry;

import com.maybeapexin.asteroid.Asteroid;

import com.maybeapexin.asteroid.registry.blocks.EmeraldNetherOre;
import com.maybeapexin.asteroid.registry.blocks.GemstoneBlock;
import com.maybeapexin.asteroid.registry.blocks.GemstoneOre;

import com.maybeapexin.asteroid.registry.items.armor.*;
import com.maybeapexin.asteroid.registry.items.food.BowlOfRice;
import com.maybeapexin.asteroid.registry.items.food.EmeraldApple;
import com.maybeapexin.asteroid.registry.items.food.Surstromming;
import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import com.maybeapexin.asteroid.registry.items.tools.*;
import com.maybeapexin.asteroid.registry.items.weapons.EmeraldSword;
import com.maybeapexin.asteroid.registry.items.weapons.GemBow;
import com.maybeapexin.asteroid.registry.items.weapons.GemSword;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModRegistry {
    public static final ArmorMaterial GEMSTONE_ARMOR = new GemArmorMaterial();

    public static final ArmorMaterial EMERALD_ARMOR = new EmeraldArmorMaterial();
    private static final ArmorMaterial OBSIDIAN_ARMOR = new ObsidianArmorMaterial();
    private static final ArmorMaterial CRYING_OBSIDIAN_ARMOR = new CryingObsidianArmorMaterial();

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
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_helmet"), new ArmorItem(GEMSTONE_ARMOR, ArmorItem.Type.HELMET, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_chestplate"), new ArmorItem(GEMSTONE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_leggings"), new ArmorItem(GEMSTONE_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_boots"), new ArmorItem(GEMSTONE_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings()));
        // Emerald Tools
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_sword"), EmeraldSword.EMERALD_SWORD);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_pickaxe"), EmeraldPickaxe.EMERALD_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_axe"), EmeraldAxe.EMERALD_AXE);
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_shovel"), EmeraldShovel.EMERALD_SHOVEL);
        // Emerald Armor
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_helmet"), new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.HELMET, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_chestplate"), new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_leggings"), new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_boots"), new ArmorItem(EMERALD_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings()));
        // Obsidian Armor
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_helmet"), new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_chestplate"), new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_leggings"), new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "obsidian_boots"), new ArmorItem(OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings()));
        // Crying Obsidian Armor
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_helmet"), new ArmorItem(CRYING_OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_chestplate"), new ArmorItem(CRYING_OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_leggings"), new ArmorItem(CRYING_OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier(Asteroid.MOD_ID, "crying_obsidian_boots"), new ArmorItem(CRYING_OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings()));


    }
}