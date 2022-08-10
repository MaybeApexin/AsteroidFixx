package com.maybeapexin.asteroid.registry;

import com.maybeapexin.asteroid.Asteroid;
import com.maybeapexin.asteroid.registry.blocks.GemstoneOre;
import com.maybeapexin.asteroid.registry.items.armor.BaseArmor;
import com.maybeapexin.asteroid.registry.items.armor.EmeraldArmorMaterial;
import com.maybeapexin.asteroid.registry.items.armor.GemArmorMaterial;
import com.maybeapexin.asteroid.registry.items.food.BowlOfRice;
import com.maybeapexin.asteroid.registry.items.food.EmeraldApple;
import com.maybeapexin.asteroid.registry.items.resources.EmeraldShard;
import com.maybeapexin.asteroid.registry.items.resources.RubyGem;
import com.maybeapexin.asteroid.registry.items.tools.*;
import com.maybeapexin.asteroid.registry.items.weapons.EmeraldSword;
import com.maybeapexin.asteroid.registry.items.weapons.GemBow;
import com.maybeapexin.asteroid.registry.items.weapons.GemSword;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModRegistry {


    /* public static FlowableFluid STILL_ACID;
    public static FlowableFluid FLOWING_ACID;
    public static Item ACID_BUCKET;
    public static Block ACID; */

    public static final ArmorMaterial GEMSTONE_ARMOR = new GemArmorMaterial();

    public static final ArmorMaterial EMERALD_ARMOR = new EmeraldArmorMaterial();

    public static void registerItems() {
        // Block(s)
        Registry.register(Registry.BLOCK, new Identifier(Asteroid.MOD_ID, "gemstone_ore"), GemstoneOre.GEMSTONE_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_ore"), new BlockItem(GemstoneOre.GEMSTONE_ORE_BLOCK, new FabricItemSettings().group(AsteroidItemGroups.ITEM_GROUP)));
        // Misc Items
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "bowl_o_rice"), BowlOfRice.BOWL_O_RICE);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_apple"), EmeraldApple.EMERALD_APPLE);
        // Gemstone Tools
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "ruby"), RubyGem.RUBY);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_sword"), GemSword.GEMSTONE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_pickaxe"), GemPickaxe.GEMSTONE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_axe"), GemAxe.GEMSTONE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_shovel"), GemShovel.GEMSTONE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_bow"), GemBow.GEMSTONE_BOW);
        // Gemstone Armor
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_helmet"), new BaseArmor(GEMSTONE_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_chestplate"), new BaseArmor(GEMSTONE_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_leggings"), new BaseArmor(GEMSTONE_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "gemstone_boots"), new BaseArmor(GEMSTONE_ARMOR, EquipmentSlot.FEET));
        // Emerald Tools
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_shard"), EmeraldShard.EMERALD_SHARD);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_sword"), EmeraldSword.EMERALD_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_pickaxe"), EmeraldPickaxe.EMERALD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_axe"), EmeraldAxe.EMERALD_AXE);
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_shovel"), EmeraldShovel.EMERALD_SHOVEL);
        // Emerald Armor
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_helmet"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_chestplate"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_leggings"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "emerald_boots"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.FEET));
/* 
        // Acid Fluid
        ACID = Registry.register(Registry.BLOCK, new Identifier(Asteroid.MOD_ID, "acid"), new FluidBlock(STILL_ACID, FabricBlockSettings.copy(Blocks.WATER)){});
        STILL_ACID = Registry.register(Registry.FLUID, new Identifier(Asteroid.MOD_ID, "acid"), new Acid.Still());
        FLOWING_ACID = Registry.register(Registry.FLUID, new Identifier(Asteroid.MOD_ID, "flowing_acid"), new Acid.Flowing());
        ACID_BUCKET = Registry.register(Registry.ITEM, new Identifier(Asteroid.MOD_ID, "acid_bucket"),
                new BucketItem(STILL_ACID, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(AsteroidItemGroups.ITEM_GROUP)));
                */
    }
}