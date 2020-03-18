package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

public class itemPokeball extends Item
{

	public itemPokeball(Properties properties)
	{
		super(properties);
	}
	
	
	@Override
	public boolean itemInteractionForEntity(ItemStack stack, PlayerEntity playerIn, LivingEntity target, Hand hand)
	{
		
		/*
		 if (stack.interactWithEntity(playerIn, target, hand) == true)
		  {
			 target.entityDropItem(stack);
			 return true;
		 }
		 else													//really baffled bug.
		  {
			 return false;
		 }	*/	
		 
		return super.itemInteractionForEntity(stack, playerIn, target, hand);
	}
	
	
	

}
