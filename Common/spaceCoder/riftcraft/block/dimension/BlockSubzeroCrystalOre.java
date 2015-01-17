package spaceCoder.riftcraft.block.dimension;

import net.minecraft.block.material.Material;
import spaceCoder.riftcraft.block.BlockRC;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockSubzeroCrystalOre extends BlockRC
{
	public BlockSubzeroCrystalOre()
	{
		super(Material.rock);
		this.setBlockName(BlockNames.BLOCKNAME_SUBZEROCRYSTALORE);
		this.setHardness(3.5F);
		this.setStepSound(soundTypeGlass);
	}
}