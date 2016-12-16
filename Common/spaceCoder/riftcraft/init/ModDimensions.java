package spaceCoder.riftcraft.init;

import net.minecraftforge.common.DimensionManager;
import spaceCoder.riftcraft.dimensions.worldProviders.WorldProviderSubzero;
import spaceCoder.riftcraft.dimensions.worldProviders.WorldProviderTester;
import spaceCoder.riftcraft.lib.reference.DimensionIds;

public class ModDimensions
{
    public static void init()
    {    
        
        DimensionManager.registerProviderType(DimensionIds.TESTER, WorldProviderTester.class, false);
        DimensionManager.registerDimension(DimensionIds.TESTER, DimensionIds.TESTER);
//      DimensionManager.registerProviderType(DimensionIds.SUBZERO, WorldProviderSubzero.class, false);
//      DimensionManager.registerDimension(DimensionIds.SUBZERO, DimensionIds.SUBZERO);
    }
}
