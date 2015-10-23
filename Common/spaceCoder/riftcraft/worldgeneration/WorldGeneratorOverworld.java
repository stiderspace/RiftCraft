package spaceCoder.riftcraft.worldgeneration;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import spaceCoder.riftcraft.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorOverworld implements IWorldGenerator 
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }
     
    private void generateEnd(World world, Random random, int x, int z)
    {
        
    }
     
    private void generateSurface(World world, Random random, int x, int z)
    {
        this.addOreSpawn(ModBlocks.CopperOre, 		world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        this.addOreSpawn(ModBlocks.AluminiumOre, 	world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        this.addOreSpawn(ModBlocks.LeadOre, 		world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        this.addOreSpawn(ModBlocks.TinOre, 			world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        this.addOreSpawn(ModBlocks.PlatinumOre, 	world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        this.addOreSpawn(ModBlocks.TunstenOre, 		world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        this.addOreSpawn(ModBlocks.SilverOre, 		world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        this.addOreSpawn(ModBlocks.TitaniumOre, 	world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        this.addOreSpawn(ModBlocks.UraniumOre, 		world, random, x, z, 16, 16, 1 + random.nextInt(50), 4+random.nextInt(20), 0, 256);
        
        //8th = variable of the size of the vein. 9th = number of veins to spawn per chunk. 10+11 = lowest height, highest height
    }
     
    private void generateNether(World world, Random random, int x, int z)
    {
       
    }
   
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        assert maxY > minY :            "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 :               "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
     
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
        }
    }
}



