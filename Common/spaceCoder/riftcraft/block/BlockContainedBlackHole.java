package spaceCoder.riftcraft.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.RenderIds;
import spaceCoder.riftcraft.proxy.ClientProxy;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;


public class BlockContainedBlackHole extends BlockRC 
{
    public BlockContainedBlackHole()
    {
        super();
        this.setBlockName(BlockNames.BLOCKNAME_CONTAINEDBLACKHOLE);
    }
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @Override
    public int getRenderType() {

        return RenderIds.RENDER_CONTAINED_BLACK_HOLE;
    }
    
    @Override
    public int getRenderBlockPass()
    {
            return 1;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    public TileEntity createNewTileEntity(World world, int var1) {

        return new TileEntityContainedBlackHole();
    }
    
    @Override
    public boolean canRenderInPass(int pass)
    {
            //Set the static var in the client proxy
            ClientProxy.renderPass = pass;
            //the block can render in both passes, so return true always
            return true;
    }
    
}
