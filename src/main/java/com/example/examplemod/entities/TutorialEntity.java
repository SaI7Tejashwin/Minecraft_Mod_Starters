package com.example.examplemod.entities;

import com.example.examplemod.lists.TutorialEntities;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;

public class TutorialEntity  extends CreatureEntity
{
	@SuppressWarnings("unchecked")
	public TutorialEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super((EntityType<? extends CreatureEntity>) TutorialEntities.TUTORIAL_ENTITY, worldIn);
		// TODO Auto-generated constructor stub
	}

		@Override
		protected void registerGoals() 
		{
			
			this.goalSelector.addGoal(0, new SwimGoal(this));
			this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
			this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
		}
		
		@Override
		protected void registerAttributes() 
		{
			super.registerAttributes();
			super.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
			super.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.2d);
		}
		
		//There are plenty of other functions that we can use like canBePushed() or canBeRidden() functions
		//w.r.t the mod given this is the "package(entities)" where you might add your mobs or pokemons.
		//all the functions are given and can be imported from 
		//this is a very basic entity with only few of its goals and attributes
		
		
	
}
