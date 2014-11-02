package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.Riftcraft;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRift extends Block {
	
	protected BlockRift() {
		super(Material.portal);
		//this.setCreativeTab(Riftcraft.tabsRFC);
		this.setBlockName(BlockNames.RIFT_NAME);
		this.setLightLevel(50.0F);
	}
	
}
