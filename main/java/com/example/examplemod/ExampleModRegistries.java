package com.example.examplemod;

import org.apache.logging.log4j.Logger;

import com.example.examplemod.items.itemPokeball;
import com.example.examplemod.lists.BlockList;
import com.example.examplemod.lists.ItemList;
import com.example.examplemod.lists.TutorialEntities;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)

public class ExampleModRegistries {
	
	public static final ItemGroup EXAMPLE = ExampleMod.EXAMPLE;
	
	public static final Logger LOGGER = ExampleMod.LOGGER;
	
	public static final String MODID = ExampleMod.MODID;
     
        @SubscribeEvent
         public static void registerItems(final RegistryEvent.Register<Item> event) {
        	event.getRegistry().registerAll(
        	ItemList.example_item = new itemPokeball(new Item.Properties().group(EXAMPLE)).setRegistryName(location("example_item")),
        	
        		//add more of your items over here.	
        	ItemList.example_block = new BlockItem(BlockList.example_block, new Item.Properties().group(EXAMPLE)).setRegistryName(BlockList.example_block.getRegistryName()),
        	ItemList.example_ore = new BlockItem(BlockList.example_ore, new Item.Properties().group(EXAMPLE)).setRegistryName(BlockList.example_ore.getRegistryName()),

        	ItemList.example_ore_nether = new BlockItem(BlockList.example_ore_nether, new Item.Properties().group(EXAMPLE)).setRegistryName(BlockList.example_ore_nether.getRegistryName())

        	);
        	
        	TutorialEntities.registerEntitySpawnEggs(event);
        	
        	LOGGER.info("Items Registered");
        }
        
        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
       	event.getRegistry().registerAll(
       			BlockList.example_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f,3.0f).lightValue(9).sound(SoundType.GLASS)).setRegistryName(location("example_block")),
       
       			BlockList.example_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f,3.0f).lightValue(11).sound(SoundType.METAL)).setRegistryName(location("example_ore")),

       			BlockList.example_ore_nether = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f,3.0f).lightValue(4).sound(SoundType.SNOW)).setRegistryName(location("example_ore_nether"))


       			//add more of your items over here.	
       	);
       	
       	LOGGER.info("Blocks Registered");
       }
        
        
        @SubscribeEvent
        public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
        {
        	event.getRegistry().registerAll
        	(
        		TutorialEntities.TUTORIAL_ENTITY	
        	);
        	
        	TutorialEntities.registerEntityWorldSpawns();
      
        	
        }
        public static ResourceLocation location(String name)
        {
        	return new ResourceLocation(MODID, name);
        }
    

}
