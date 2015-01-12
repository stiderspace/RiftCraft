package spaceCoder.riftcraft.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.RenderIds;
import spaceCoder.riftcraft.tile.TileEntityRiftMachineSupport;

public class BlockRiftMachineSupport extends BlockRC
{
    public BlockRiftMachineSupport()
    {
        super();
        this.setBlockName(BlockNames.BLOCKNAME_RIFTMACHINE_SUPPORT);
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return RenderIds.RENDER_RIFT_MACHINE_SUPPORT;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    public TileEntity createNewTileEntity(World world, int var1)
    {
        return new TileEntityRiftMachineSupport();
    }
}
