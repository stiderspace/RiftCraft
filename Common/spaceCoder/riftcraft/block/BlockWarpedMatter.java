package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.Riftcraft;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWarpedMatter extends BlockRC {
	
	public BlockWarpedMatter(){
		
		super(Material.glass);
		this.setBlockName(BlockNames.BLOCKNAME_WARPEDMATTER);
		//setCreativeTab(Riftcraft.tabsRFC);
		this.setHardness(5F);
		this.setStepSound(soundTypeAnvil);
	}
}
