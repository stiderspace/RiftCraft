package spaceCoder.riftcraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.RenderIDs;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;
import spaceCoder.riftcraft.tile.TileEntityRiftMachine;

public class BlockRiftMachine extends BlockRC
{
    public BlockRiftMachine()
    {
        super();
        this.setBlockName(BlockNames.BLOCKNAME_RIFTMACHINE);
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return RenderIDs.RENDER_RIFT_MACHINE;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    public TileEntity createNewTileEntity(World world, int var1)
    {
        return new TileEntityRiftMachine();
    }

}
