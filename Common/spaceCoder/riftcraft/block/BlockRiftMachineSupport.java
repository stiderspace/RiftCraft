package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.RenderIDs;
import spaceCoder.riftcraft.tile.TileEntityRiftMachine;
import spaceCoder.riftcraft.tile.TileEntityRiftMachineSupport;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

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
        return RenderIDs.RENDER_RIFT_MACHINE_SUPPORT;
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
