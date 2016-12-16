package spaceCoder.riftcraft.dimensions.worldGenLayer;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import spaceCoder.riftcraft.init.ModBiomes;

public class LightForestGenLayerBiomes extends GenLayer {

    // TODO: spawning with temperatures
    static Random rand = new Random();
    protected BiomeGenBase[] allowedBiomes = {
        ModBiomes.BiomeSubzero,
    };
    
    public LightForestGenLayerBiomes(long seed) {
        super(rand.nextLong());
    }
    
    public LightForestGenLayerBiomes(long seed, GenLayer genlayer) {
        super(rand.nextLong());
        this.parent = genlayer;
    }
    
    @Override
    public int[] getInts(int x, int z, int width, int depth) {
        int[] dest = IntCache.getIntCache(width * depth);
        for (int dz = 0; dz < depth; dz++) {
            for (int dx = 0; dx < width; dx++) {
                this.initChunkSeed(dx + x, dz + z);
                dest[(dx + dz * width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
            }
        }
        return dest;
    }
}