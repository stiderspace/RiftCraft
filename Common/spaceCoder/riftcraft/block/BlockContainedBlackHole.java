package spaceCoder.riftcraft.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.RenderIds;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;


public class BlockContainedBlackHole extends BlockRC 
{
    public BlockContainedBlackHole()
    {
        super();
        this.setBlockName(BlockNames.CONTAINEDBLCKHOLE_NAME);
    }
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @Override
    public int getRenderType() {

        return RenderIds.CONTAINEDBLACKHOLERENDER;
    }
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    public TileEntity createNewTileEntity(World world, int var1) {

        return new TileEntityContainedBlackHole();
    }
    
}
