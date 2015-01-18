package spaceCoder.riftcraft.block;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
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
    
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack)
    {

        int direction = 3;
        int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

        if (facing == 0)
        {
            direction = ForgeDirection.NORTH.ordinal();
        }
        else if (facing == 1)
        {
            direction = ForgeDirection.EAST.ordinal();
        }
        else if (facing == 2)
        {
            direction = ForgeDirection.SOUTH.ordinal();
        }
        else if (facing == 3)
        {
            direction = ForgeDirection.WEST.ordinal();
        }

        world.setBlockMetadataWithNotify(x, y, z, direction, 3);
        ((TileEntityRiftMachineSupport) world.getTileEntity(x, y, z)).setOrientation(direction);
    }


    public TileEntity createNewTileEntity(World world, int var1)
    {
        return new TileEntityRiftMachineSupport();
    }
}
