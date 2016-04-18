package spaceCoder.riftcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import spaceCoder.riftcraft.biomes.BiomeGenSubzero;
import net.minecraftforge.common.BiomeManager;

public class ModBiomes 
{
	public static final BiomeGenBase.Height BiomeHeight = new BiomeGenBase.Height(0.3F, 0.6F);
	
	public static BiomeGenBase BiomeSubzero;
	
	public static void init()
	{
		BiomeSubzero = new BiomeGenSubzero(140).setBiomeName("Subzero").setHeight(BiomeHeight);
		
		BiomeDictionary.registerBiomeType(BiomeSubzero, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeSubzero);
		BiomeDictionary.registerAllBiomes();
	}
}