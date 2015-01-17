package spaceCoder.riftcraft.block;

import net.minecraft.block.material.Material;
import spaceCoder.riftcraft.block.BlockRC;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockCrystalOre extends BlockRC
{
	public BlockCrystalOre()
	{
		super(Material.rock);
		this.setBlockName(BlockNames.BLOCKNAME_CRYSTALORE);
		this.setHardness(4.5F);
		this.setStepSound(soundTypeStone);
	}
}