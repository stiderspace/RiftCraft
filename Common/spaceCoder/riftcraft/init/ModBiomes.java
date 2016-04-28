package spaceCoder.riftcraft.init;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import spaceCoder.riftcraft.biomes.BiomeGenSubzero;
import spaceCoder.riftcraft.biomes.WorldTypeSubzero;

public class ModBiomes 
{
	//public static final BiomeGenBase.Height BiomeHeight = new BiomeGenBase.Height(0.3F, 0.6F);
	
	public static BiomeGenBase BiomeSubzero;
	
	public static void init()
	{
		BiomeSubzero = new BiomeGenSubzero(140).setBiomeName("Subzero");//.setTemperatureRainfall(1.2F, 0.9F).setHeight(BiomeHeight);
		
		BiomeDictionary.registerBiomeType(BiomeSubzero, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeSubzero);
		BiomeDictionary.registerAllBiomes();

	}
	
	public static void postinit()
	{
		WorldType SUBZERO = new WorldTypeSubzero(3, "Subzero");
	}
}