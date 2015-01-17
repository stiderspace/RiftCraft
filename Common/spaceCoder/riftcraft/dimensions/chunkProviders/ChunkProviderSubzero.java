package spaceCoder.riftcraft.dimensions.chunkProviders;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.CAVE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.RAVINE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.SCATTERED_FEATURE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import spaceCoder.riftcraft.init.ModBlocks;

public class ChunkProviderSubzero implements IChunkProvider
{
    private Random rand;
    private World worldObj;
    private final boolean mapFeaturesEnabled;
    
    private double[]noiseArray;
    private double[]stoneNoise = new double [256];
    private MapGenBase caveGenerator = new MapGenCaves();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    private MapGenBase ravineGenerator = new MapGenRavine();
    
    private BiomeGenBase [] biomesforGeneration;
    
    {
        caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, CAVE);
        scatteredFeatureGenerator = (MapGenScatteredFeature) TerrainGen.getModdedMapGen(scatteredFeatureGenerator, SCATTERED_FEATURE);
        ravineGenerator = TerrainGen.getModdedMapGen(ravineGenerator, RAVINE);
    }
    
    public ChunkProviderSubzero(World worldObj, long seed, boolean features)
    {
        this.worldObj = worldObj;
        this.mapFeaturesEnabled = features;
        this.rand = new Random(seed);
    }

    @Override
    public boolean chunkExists(int p_73149_1_, int p_73149_2_)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Chunk provideChunk(int i, int j)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Chunk loadChunk(int i, int j)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void populate(IChunkProvider ichunkprovider, int chunkX, int chunkZ)
    {
       BlockSand.fallInstantly = true;
       int blockX = chunkX * 16;
       int blockZ = chunkZ * 16;
       BiomeGenBase biome = this.worldObj.getBiomeGenForCoords(blockX +  16, blockZ + 16);
       this.rand.setSeed(this.worldObj.getSeed());
       long i1 = this.rand.nextLong() / 2L * 2L + 1L;
       long j1 = this.rand.nextLong() / 2L * 2L + 1L;
       this.rand.setSeed((long)chunkX*i1 +(long) chunkZ*j1 ^ this.worldObj.getSeed());
       boolean flag = false;
       
       MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(ichunkprovider, worldObj, rand, chunkX, chunkZ, flag));
       
       if(mapFeaturesEnabled)
       {
           this.scatteredFeatureGenerator.generateStructuresInChunk(this.worldObj, rand, chunkX, chunkZ);
       }
       int x;
       int y;
       int z;
       
       if(biome != BiomeGenBase.desert && biome != BiomeGenBase.desertHills && !flag && this.rand.nextInt(4) == 0 && TerrainGen.populate(ichunkprovider, this.worldObj, rand, chunkX, chunkZ, flag, LAKE))
       {
           x = blockX + this.rand.nextInt(16) + 8;
           y = this.rand.nextInt(128);
           z = blockZ + this.rand.nextInt(16) + 8;
           (new WorldGenLakes(ModBlocks.SubzeroIce)).generate(this.worldObj, this.rand, x, y, z);
       }
    }

    @Override
    public boolean saveChunks(boolean flag, IProgressUpdate iprogressupdate)
    {
     
        return false;
    }

    @Override
    public boolean unloadQueuedChunks()
    {
    
        return false;
    }

    @Override
    public boolean canSave()
    {
  
        return false;
    }

    @Override
    public String makeString()
    {
  
        return null;
    }

    @Override
    public List getPossibleCreatures(EnumCreatureType enumcreaturetype, int p_73155_2_, int p_73155_3_, int p_73155_4_)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChunkPosition func_147416_a(World p_147416_1_, String p_147416_2_, int p_147416_3_, int p_147416_4_, int p_147416_5_)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getLoadedChunkCount()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void recreateStructures(int p_82695_1_, int p_82695_2_)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void saveExtraData()
    {
        // TODO Auto-generated method stub

    }

}
