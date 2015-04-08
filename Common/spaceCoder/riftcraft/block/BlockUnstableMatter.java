package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockUnstableMatter extends BlockRC
{
    public BlockUnstableMatter()
    {
        super(Material.iron);
        this.setBlockName(BlockNames.BLOCKNAME_UNSTABLEMATTER);
        // setCreativeTab(Riftcraft.tabsRFC);
        this.setHardness(5F);
        this.setStepSound(soundTypeMetal);
    }

}