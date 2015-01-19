package spaceCoder.riftcraft.init;

import cpw.mods.fml.common.IWorldGenerator;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import spaceCoder.riftcraft.worldgeneration.WorldGeneratorHellfire;

public class ModWorldGeneration 
{
	//Declare the generator
	public static IWorldGenerator Hellfire;
	
	public void init()
	{
		//Add the generator
		Hellfire = new WorldGeneratorHellfire();
		
		
		
		//Register the generator
		RegisterHelper.registerIWorldGenerator(Hellfire);
	}
	
}



