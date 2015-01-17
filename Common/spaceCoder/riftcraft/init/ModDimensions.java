package spaceCoder.riftcraft.init;

import net.minecraftforge.common.DimensionManager;
import spaceCoder.riftcraft.lib.reference.DimensionIds;

public class ModDimensions
{
    public static void init(){
    
    DimensionManager.registerProviderType(DimensionIds.SUBZERO, WorldProviderSubZero.class, false);
    }
}
