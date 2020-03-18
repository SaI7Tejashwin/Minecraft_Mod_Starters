package com.example.examplemod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig {
	
		public static ForgeConfigSpec.IntValue example_chance;
		public static ForgeConfigSpec.BooleanValue generate_overworld;
		
		public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
		{
			server.comment("Oregen Config");
			
			example_chance = server
					.comment("Maximum number of ore veins of the tutorial ore that can spawn in one chunk.")
					.defineInRange("oregen.example_chance", 100, 1, 100000);
			

			generate_overworld = server
					.comment("Decide if you want Tutorial Mod ores to spawn in the overworld")
					.define("oregen.generate_overworld", true);
					
		}

}
