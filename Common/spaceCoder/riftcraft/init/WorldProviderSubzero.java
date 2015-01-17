package spaceCoder.riftcraft.init;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import spaceCoder.riftcraft.lib.reference.DimensionIds;

public class WorldProviderSubzero extends WorldProvider
{
    
    public void registerWorldChunkManager()
    {
           this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.desertHills, 0.8F);
           this.dimensionId = DimensionIds.SUBZERO;
    }
   
    public IChunkProvider createChunkGenerator()
    {
           return new ChunkProviderSubzero(worldObj, worldObj.getSeed(), true);
    }
    @Override
    public String getDimensionName()
    {
        return null;
    }

}
