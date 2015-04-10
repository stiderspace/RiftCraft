package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHellfire extends BlockRC
{
    public BlockHellfire()
    {
        super(Material.iron);
        this.setBlockName(BlockNames.BLOCKNAME_HELLFIREBLOCK);
        // setCreativeTab(Riftcraft.tabsRFC);
        this.setHardness(2.5F);
        this.setResistance(2.0F);
        this.setStepSound(soundTypeMetal);
    }

}