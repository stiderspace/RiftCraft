package spaceCoder.riftcraft.init;

import net.minecraft.block.Block;
import spaceCoder.riftcraft.block.BlockRift;
import spaceCoder.riftcraft.block.BlockWarpedBlock;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Declare the blocks
	public static Block WarpedBlock;
	public static Block Rift;
    
    public static void init()
    {
        //Add the blocks
        WarpedBlock = new BlockWarpedBlock();
        Rift = new BlockRift();
        
        //Register the blocks
        RegisterHelper.registerBlock(WarpedBlock);
        RegisterHelper.registerBlock(Rift);
        //GameRegistry.registerBlock(Rift, BlockNames.RIFT_NAME);
    }
}

