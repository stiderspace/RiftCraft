package spaceCoder.riftcraft.tile;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityRiftMachineSupport extends TileEntity
{
    protected ForgeDirection orientation;
    
    public TileEntityRiftMachineSupport()
    {
    }
    
    public ForgeDirection getOrientation()
    {
        return orientation;
    }
    
    public void setOrientation(int orientation)
    {

        this.orientation = ForgeDirection.getOrientation(orientation);
    }
    
    @Override
    public Block getBlockType()
    {
        return Blocks.beacon;
    }
    

}
