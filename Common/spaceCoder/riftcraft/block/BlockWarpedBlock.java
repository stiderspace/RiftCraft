package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.Riftcraft;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWarpedBlock extends BlockRC {
	
	public BlockWarpedBlock(){
		
		super(Material.glass);
		this.setBlockName(BlockNames.WARPEDBLOCK_NAME);
		this.setBlockTextureName(Textures.WARPEDBLOCK_TEXTURE);
	}
}
