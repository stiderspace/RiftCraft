package spaceCoder.riftcraft.dimensions.chunkProviders;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.CAVE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.RAVINE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.SCATTERED_FEATURE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ICE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAVA;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
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

    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new MapGenCaves();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    private MapGenBase ravineGenerator = new MapGenRavine();

    private BiomeGenBase[] biomesforGeneration;

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

    
    public boolean chunkExists(int p_73149_1_, int p_73149_2_)
    {
        // TODO Auto-generated method stub
        return false;
    }

    
    public Chunk provideChunk(int i, int j)
    {
        // TODO Auto-generated method stub
        return null;
    }

    
    public Chunk loadChunk(int i, int j)
    {
        // TODO Auto-generated method stub
        return null;
    }

    
    public void populate(IChunkProvider ichunkprovider, int chunkX, int chunkZ)
    {
        BlockSand.fallInstantly = true;
        int blockX = chunkX * 16;
        int blockZ = chunkZ * 16;
        BiomeGenBase biome = this.worldObj.getBiomeGenForCoords(blockX + 16, blockZ + 16);
        this.rand.setSeed(this.worldObj.getSeed());
        long i1 = this.rand.nextLong() / 2L * 2L + 1L;
        long j1 = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed((long) chunkX * i1 + (long) chunkZ * j1 ^ this.worldObj.getSeed());
        boolean flag = false;

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(ichunkprovider, worldObj, rand, chunkX, chunkZ, flag));

        if (mapFeaturesEnabled)
        {
            this.scatteredFeatureGenerator.generateStructuresInChunk(this.worldObj, rand, chunkX, chunkZ);
        }
        int k1;
        int l1;
        int i2;

        if (biome != BiomeGenBase.desert && biome != BiomeGenBase.desertHills && !flag && this.rand.nextInt(4) == 0 && TerrainGen.populate(ichunkprovider, this.worldObj, rand, chunkX, chunkZ, flag, LAKE))
        {
            k1 = blockX + this.rand.nextInt(16) + 8;
            l1 = this.rand.nextInt(128);
            i2 = blockZ + this.rand.nextInt(16) + 8;
            (new WorldGenLakes(ModBlocks.SubzeroIce)).generate(this.worldObj, this.rand, k1, l1, i2);
        }

        if (TerrainGen.populate(ichunkprovider, worldObj, rand, chunkX, chunkZ, flag, LAVA) && !flag && this.rand.nextInt(8) == 0)
        {
            k1 = blockX + this.rand.nextInt(16) + 8;
            l1 = this.rand.nextInt(this.rand.nextInt(120) + 8);
            i2 = blockZ + this.rand.nextInt(16) + 8;
            if (l1 < 63 || this.rand.nextInt(10) == 0)
            {
                (new WorldGenLakes(Blocks.obsidian)).generate(this.worldObj, this.rand, k1, l1, i2);
            }
        }
        biome.decorate(worldObj, rand, blockX, blockZ);

        blockX += 8;
        blockZ += 8;

        boolean doGen = TerrainGen.populate(ichunkprovider, worldObj, rand, chunkX, chunkZ, flag, ICE);
        for (k1 = 0; doGen && k1 < 16; k1++)
        {
            for (l1 = 0; l1 < 16; l1++)
            {
                i2 = this.worldObj.getPrecipitationHeight(blockX + k1, blockZ + l1);

                if (this.worldObj.isBlockFreezable(blockX + k1, i2 - 1, l1 + blockZ))
                {
                    this.worldObj.setBlock(blockX + k1, i2 - 1, l1 + blockZ, ModBlocks.SubzeroIce, 0, 2);
                }
                if (this.worldObj.canSnowAtBody(k1 + blockX, i2, l1 + blockZ, true))
                {
                    this.worldObj.setBlock(k1 + blockX, i2, l1 + blockZ, Blocks.snow_layer, 0, 2);
                }
            }
        }
        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(ichunkprovider, worldObj, rand, chunkX, chunkZ, flag));

        BlockSand.fallInstantly = false;
    }

    
    public boolean saveChunks(boolean flag, IProgressUpdate iprogressupdate)
    {
        return true;
    }

    
    public boolean unloadQueuedChunks()
    {

        return false;
    }

    
    public boolean canSave()
    {

        return true;
    }

    
    public String makeString()
    {

        return "RandomLevelSource";
    }

    
    public List getPossibleCreatures(EnumCreatureType enumcreaturetype, int par1, int par2, int par3)
    {
        return null;
    }

    
    public ChunkPosition func_147416_a(World world, String string, int par1, int par2, int par3)
    {
        return null;
    }

    
    public int getLoadedChunkCount()
    {
        return 0;
    }

  
    public void recreateStructures(int par1, int par2)
    {
        if(this.mapFeaturesEnabled){
            this.scatteredFeatureGenerator.func_151539_a(this, worldObj, par1, par2, (Block[])null);       }
    }

    
    public void saveExtraData(){}

}
