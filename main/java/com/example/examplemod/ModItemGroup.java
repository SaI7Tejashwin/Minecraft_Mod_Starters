package com.example.examplemod;

import com.example.examplemod.lists.ItemList;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup extends ItemGroup {
	
	public ModItemGroup()
	{
		super("mods");
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemList.example_item);
	}

}
