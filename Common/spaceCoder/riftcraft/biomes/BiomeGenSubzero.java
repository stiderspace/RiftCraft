package spaceCoder.riftcraft.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import spaceCoder.riftcraft.init.ModBlocks;

public class BiomeGenSubzero extends BiomeGenBase 
{
	public BiomeGenSubzero(int id)
	{
		super(id);
		
		this.topBlock = ModBlocks.SubzeroMatter;
		this.fillerBlock = ModBlocks.SubzeroMatter;
		this.theBiomeDecorator.treesPerChunk = 0;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.generateLakes = false;
		
		this.enableRain = false;
		
		
		this.spawnableCreatureList.add(new SpawnListEntry(null, 1, 1, 1)); //Creature, how many per group (average), minimum per group, maximum per group
	}
	/*
	public static void ReplaceStone(World world, int chunkX, int chunkZ, Random random)
	{
		BiomeGenBase generateMyStone = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);

		if (generateMyStone instanceof BiomeGenSubzero)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(128);
			int zCoord = chunkZ + random.nextInt(16);
		}
	}
	*/
}
