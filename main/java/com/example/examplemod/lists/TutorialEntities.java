package com.example.examplemod.lists;

import com.example.examplemod.ExampleModRegistries;
import com.example.examplemod.entities.TutorialEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class TutorialEntities 
{
	
	public static EntityType<?> TUTORIAL_ENTITY = EntityType.Builder.create(TutorialEntity::new, EntityClassification.CREATURE).build(ExampleModRegistries.MODID + "tutorial_entity").setRegistryName(ExampleModRegistries.location("tutorial_entity"));
	//the above line of code might be an extremely long line of code of function but this initializes the entity
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			ItemList.tutorial_entity_egg = registerEntitySpawnEgg(TUTORIAL_ENTITY, 0x2f5882, 0x6f1499, "tutorial_entity_egg" )	
		);
	}
	
	public static void registerEntityWorldSpawns()
	{
		registerEntityWorldSpawn(TUTORIAL_ENTITY, Biomes.DESERT, Biomes.BEACH, Biomes.JUNGLE);
		
		// referenced from registerEntityWorldSpawn(....)
	}
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ExampleModRegistries.EXAMPLE));
		
		item.setRegistryName(ExampleModRegistries.location(name));
		
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<?> entity, Biome...biomes)
	{
		for(Biome biome : biomes)
		{
			if(biome != null)
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, 1, 10));
			}
		}
	}

}
