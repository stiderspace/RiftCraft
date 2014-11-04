package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.Riftcraft;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRift extends BlockRC {
	
	public BlockRift() {
		super(Material.portal);
		//this.setCreativeTab(Riftcraft.tabsRFC);
		setBlockName(BlockNames.RIFT_NAME);
		setLightLevel(15.0F);
	}
	
}
