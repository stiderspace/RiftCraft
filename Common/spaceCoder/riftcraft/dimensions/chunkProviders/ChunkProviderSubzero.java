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
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import spaceCoder.riftcraft.init.ModBlocks;
import cpw.mods.fml.common.eventhandler.Event.Result;

public class ChunkProviderSubzero implements IChunkProvider
{
    private Random rand;
    private World worldObj;
    private final boolean mapFeaturesEnabled;

    private NoiseGeneratorOctaves noiseGen1;
    private NoiseGeneratorOctaves noiseGen2;
    private NoiseGeneratorOctaves noiseGen3;

    private NoiseGeneratorOctaves noiseGen4;
    public NoiseGeneratorOctaves noiseGen5;
    public NoiseGeneratorOctaves noiseGen6;

    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new MapGenCaves();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    private MapGenBase ravineGenerator = new MapGenRavine();

    private BiomeGenBase[] biomesforGeneration;

    public double[] noise1;
    public double[] noise2;
    public double[] noise3;
    public double[] noise4;
    public double[] noise5;
    public double[] noise6;

    public float[] parabolicField;
    public int[][] field = new int[32][32];

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
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        
        NoiseGenerator[] noiseGen = {noiseGen1, noiseGen2, noiseGen3, noiseGen4, noiseGen5, noiseGen6};
        noiseGen = TerrainGen.getModdedNoiseGenerators(worldObj, rand, noiseGen);
        
        this.noiseGen1 = (NoiseGeneratorOctaves) noiseGen[0];
        this.noiseGen2 = (NoiseGeneratorOctaves) noiseGen[1];
        this.noiseGen3 = (NoiseGeneratorOctaves) noiseGen[2];
        this.noiseGen4 = (NoiseGeneratorOctaves) noiseGen[3];
        this.noiseGen5 = (NoiseGeneratorOctaves) noiseGen[4];
        this.noiseGen6 = (NoiseGeneratorOctaves) noiseGen[5];
        
        
    }

    public boolean chunkExists(int posX, int posZ)
    {
        return true;
    }

    public Chunk provideChunk(int posX, int posZ)
    {
        this.rand.setSeed((long) posX * 341873128712L + (long) posZ * 132897987541L);
        Block[] blockArray = new Block[32768];
        byte[] byteArray = new byte[65536];
        this.generateTerrain(posX, posZ, blockArray);
        this.biomesforGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(biomesforGeneration, posZ * 16, posX * 16, 16, 16);
        this.replaceBlocksForBiome(posX, posZ, blockArray, byteArray, this.biomesforGeneration);

        this.caveGenerator.func_151539_a(this, worldObj, posX, posZ, blockArray);
        this.ravineGenerator.func_151539_a(this, worldObj, posX, posZ, blockArray);

        if (this.mapFeaturesEnabled)
        {
            this.scatteredFeatureGenerator.func_151539_a(this, worldObj, posX, posZ, blockArray);
        }
        
        Chunk chunk = new Chunk(this.worldObj, blockArray, posX , posZ);
        byte[] byteArray2 = chunk.getBiomeArray();
        for(int k = 0; k < byteArray.length; k++)
        {
            byteArray[k] = (byte)this.biomesforGeneration[k].biomeID;
        }
        chunk.generateSkylightMap();
        return chunk;
    }

    public void replaceBlocksForBiome(int posX, int posZ, Block[] blockArray, byte[] byteArray, BiomeGenBase[] biomesforGeneration2)
    {
        ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks(this, posX, posX, blockArray, byteArray, biomesforGeneration2, this.worldObj);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.getResult() == Result.DENY) return;
        
        double d = 0.03125D;
        this.stoneNoise = this.noiseGen4.generateNoiseOctaves(stoneNoise, posX * 16, posZ * 16, 16, 16, d * 2.0D, d * 2.0D, 1.0D);
        
        for (int x = 0; x < 16; ++x)
        {
            for (int z = 0; z < 16; ++z)
            {
                BiomeGenBase biomegenbase = biomesforGeneration2[z + x * 16];
                biomegenbase.genTerrainBlocks(this.worldObj, this.rand, blockArray, byteArray, posX * 16 + x, posZ * 16 + z, this.stoneNoise[z + x * 16]);
            }
        }
        
    }

    public void generateTerrain(int posX, int posZ, Block[] blockArray)
    {        
        
    }

    public Chunk loadChunk(int chunkX, int chunkZ)
    {
        return this.provideChunk(chunkX, chunkZ);
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

    public void recreateStructures(int posX, int posZ)
    {
        if (this.mapFeaturesEnabled)
        {
            this.scatteredFeatureGenerator.func_151539_a(this, worldObj, posX, posZ, (Block[]) null);
        }
    }

    public void saveExtraData()
    {
    }

}
