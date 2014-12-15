package spaceCoder.riftcraft.block;

import net.minecraft.block.material.Material;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockRift extends BlockRC {
	
	public BlockRift() {
		super(Material.portal);
		//this.setCreativeTab(Riftcraft.tabsRFC);
		this.setBlockName(BlockNames.BLOCKNAME_RIFT);
		this.setLightLevel(15.0F);

	}
	
}
