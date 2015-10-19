package spaceCoder.riftcraft.block.ores;

import net.minecraft.block.material.Material;
import spaceCoder.riftcraft.block.BlockRC;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockUraniumOre extends BlockRC
{
    public BlockUraniumOre()
    {
        super(Material.rock);
        this.setBlockName(BlockNames.BLOCKNAME_URANIUMORE);
        this.setHardness(4.0F);
        this.setResistance(2.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 2);
    }

}
