package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.Riftcraft;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWarpedBlock extends Block {
	
	public BlockWarpedBlock(){
		
		super(Material.rock);
		setBlockName(BlockNames.WARPEDBLOCK_NAME);
		//setCreativeTab(Riftcraft.tabsRFC);
		setHardness(5F);
		// setStepSound(soundStoneFootstep);
		//this.setBlockTextureName(BlockNames.RESOURCE_PREFIX + BlockNames.WARPEDBLOCK_NAME);
	}
}
