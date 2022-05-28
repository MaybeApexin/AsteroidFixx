package com.maybeapexin.asteroid.registry.objReg;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeTool extends AxeItem {
    public AxeTool(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
