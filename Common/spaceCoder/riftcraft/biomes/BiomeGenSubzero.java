package spaceCoder.riftcraft.biomes;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenSubzero extends BiomeGenBase 
{
	public BiomeGenSubzero(int id)
	{
		super(id);
		
		this.topBlock = Blocks.diamond_block;
		this.fillerBlock = Blocks.glass;
	}
}
