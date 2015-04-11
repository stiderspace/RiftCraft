package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCrystal extends BlockRC
{
    public BlockCrystal()
    {
        super(Material.iron);
        this.setBlockName(BlockNames.BLOCKNAME_CRYSTALBLOCK);
        // setCreativeTab(Riftcraft.tabsRFC);
        this.setHardness(4.5F);
        this.setResistance(4.0F);
        this.setStepSound(soundTypeMetal);
        this.setHarvestLevel("pickaxe", 2);
    }

}