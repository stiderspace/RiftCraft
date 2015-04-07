package spaceCoder.riftcraft.block.dimension;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import spaceCoder.riftcraft.block.BlockRC;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockSubzeroIce extends BlockRC
{
	public BlockSubzeroIce()
	{
		super(Material.ice);
		this.setBlockName(BlockNames.BLOCKNAME_SUBZEROICE);
		this.setHardness(2.0F);
		this.setStepSound(soundTypeGlass);
		this.slipperiness = 0.98F;		
	}
	
    @SideOnly(Side.CLIENT)
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5, boolean render)
    {
        return super.shouldSideBeRendered(var1, var2, var3, var4, 1 - var5);
    }
    
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }

}