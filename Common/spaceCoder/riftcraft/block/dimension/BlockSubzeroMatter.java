package spaceCoder.riftcraft.block.dimension;

import net.minecraft.block.material.Material;
import spaceCoder.riftcraft.block.BlockRC;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockSubzeroMatter extends BlockRC
{
	public BlockSubzeroMatter()
	{
		super(Material.rock);
		this.setBlockName(BlockNames.BLOCKNAME_SUBZEROMATTER);
		this.setHardness(3.0F);
		this.setStepSound(soundTypeGlass);
	}
}
