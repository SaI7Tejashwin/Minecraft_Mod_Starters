package com.example.examplemod.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public class ToolMaterialInit implements IItemTier
{

	
	private float attackDamage, efficiency;
	private int durability, harvestlevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialInit(float attackDamage, float efficiency,int durability, int harvestlevel, int enchantability, Item repairMaterial) {
		
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestlevel = harvestlevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMaxUses() {
		return this.durability;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestlevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}

}
