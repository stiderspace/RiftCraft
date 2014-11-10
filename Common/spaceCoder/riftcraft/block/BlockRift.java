package spaceCoder.riftcraft.block;

import net.minecraft.block.material.Material;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.Textures;
import spaceCoder.riftcraft.lib.utility.LogHelper;

public class BlockRift extends BlockRC {
	
	public BlockRift() {
		super(Material.portal);
		this.setBlockName(BlockNames.RIFT_NAME);
		this.setLightLevel(15.0F);
		this.setBlockTextureName(Textures.RIFT_TEXTURE);

	}
	
}
