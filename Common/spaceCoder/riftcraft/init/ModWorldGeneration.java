package spaceCoder.riftcraft.init;

import cpw.mods.fml.common.IWorldGenerator;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import spaceCoder.riftcraft.worldgeneration.WorldGeneratorHell;
import spaceCoder.riftcraft.worldgeneration.WorldGeneratorOverworld;

public class ModWorldGeneration 
{
	//Declare the generator
	public static IWorldGenerator Hellfire;
	public static IWorldGenerator Ores;
	
	public static void init()
	{
		//Add the generator
		Hellfire = new WorldGeneratorHell();
		Ores = new WorldGeneratorOverworld();
		
		
		
		//Register the generator
		RegisterHelper.registerIWorldGenerator(Hellfire);
		RegisterHelper.registerIWorldGenerator(Ores);
	}
	
}



