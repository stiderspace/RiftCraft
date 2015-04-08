package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDarkMatter extends BlockRC
{
    public BlockDarkMatter()
    {
        super(Material.iron);
        this.setBlockName(BlockNames.BLOCKNAME_DARKMATTER);
        // setCreativeTab(Riftcraft.tabsRFC);
        this.setHardness(5F);
        this.setStepSound(soundTypeMetal);
    }

}