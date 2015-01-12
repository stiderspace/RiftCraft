package spaceCoder.riftcraft.init;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;
import spaceCoder.riftcraft.tile.TileEntityRiftMachine;
import spaceCoder.riftcraft.tile.TileEntityRiftMachineSupport;

public class ModTile
{
    public static void init()
    {
        RegisterHelper.registerTileEntity(TileEntityContainedBlackHole.class, BlockNames.BLOCKNAME_CONTAINEDBLACKHOLE);
        RegisterHelper.registerTileEntity(TileEntityRiftMachine.class,        BlockNames.BLOCKNAME_RIFTMACHINE);
        RegisterHelper.registerTileEntity(TileEntityRiftMachineSupport.class, BlockNames.BLOCKNAME_RIFTMACHINE_SUPPORT);
    }
}
