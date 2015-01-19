package spaceCoder.riftcraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import spaceCoder.riftcraft.creativeTabs.CreativeTabRFC;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockSubzeroFire extends BlockRC
{
	private IIcon[] field_149850_M;
	
	public BlockSubzeroFire()
	{
		super(Material.fire);
		this.setBlockName(BlockNames.BLOCKNAME_SUBZEROFIRE);
		this.setCreativeTab(CreativeTabRFC.RFC_TAB);
	}
}
