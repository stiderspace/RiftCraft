package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDwarfStarAlloy extends BlockRC
{
    public BlockDwarfStarAlloy()
    {
        super(Material.iron);
        this.setBlockName(BlockNames.DWARFSTARALOY_NAME);
        // setCreativeTab(Riftcraft.tabsRFC);
        this.setHardness(5F);
        this.setStepSound(soundTypeAnvil);
    }

}
