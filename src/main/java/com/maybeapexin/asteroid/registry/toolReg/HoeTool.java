package com.maybeapexin.asteroid.registry.toolReg;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeTool extends HoeItem {
    protected HoeTool(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
