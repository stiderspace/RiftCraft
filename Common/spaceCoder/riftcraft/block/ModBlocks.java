package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import net.minecraft.block.Block;

public class ModBlocks
{
    //Declare the blocks
	public static Block WarpedBlock;
	public static Block Rift;
    
    public static void init()
    {
        //Add the blocks
        WarpedBlock = new BlockWarpedBlock();
        Rift		= new BlockRift();
        
        //Register the blocks
        RegisterHelper.registerBlock(WarpedBlock);
        RegisterHelper.registerBlock(Rift);
    }
}

