package spaceCoder.riftcraft.tile;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRiftMachineSupport extends TileEntity
{
    public TileEntityRiftMachineSupport()
    {
    }
    
    @Override
    public Block getBlockType()
    {
        return Blocks.beacon;
    }
    

}
