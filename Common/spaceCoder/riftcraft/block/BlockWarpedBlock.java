package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.Riftcraft;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWarpedBlock extends BlockRC {
	
	public BlockWarpedBlock(){
		
		super(Material.glass);
		this.setBlockName(BlockNames.WARPEDBLOCK_NAME);
		//setCreativeTab(Riftcraft.tabsRFC);
		this.setHardness(5F);
		this.setStepSound(soundTypeAnvil);
	}
}
