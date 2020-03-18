package com.example.examplemod.world;

import com.example.examplemod.config.OregenConfig;
import com.example.examplemod.lists.BlockList;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	
	

	
	public static void setupOreGeneration()
	{
		if(OregenConfig.generate_overworld.get())
		{
		for(Biome biome : ForgeRegistries.BIOMES)
		{
			biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlockList.example_ore.getDefaultState(), OregenConfig.example_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10,20, 0, 100)));		
			biome.addFeature(Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlockList.example_ore_nether.getDefaultState(), OregenConfig.example_chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10,20, 0, 100)));
		
			
			
			//biome.addFeature(Decoration.UNDERGROUND_ORES, new ConfiguredFeature<OreFeatureConfig>(Feature.ORE, new OreFeatureConfig(FillerBlockType.ENDSTONE, BlockList.example_ore.getDefaultState(), OregenConfig.tutorial_chance.get())));
		}
		}
				
	}

}
