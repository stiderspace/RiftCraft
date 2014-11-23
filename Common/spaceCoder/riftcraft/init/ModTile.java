package spaceCoder.riftcraft.init;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;

public class ModTile
{
    public static void init()
    {
        RegisterHelper.registerTileEntity(TileEntityContainedBlackHole.class, BlockNames.CONTAINEDBLCKHOLE_NAME);
    }
}
