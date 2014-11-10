package spaceCoder.riftcraft.block;

import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.Textures;
import net.minecraft.block.Block;

public class BlockEnergyConverter extends BlockRC
{
    public BlockEnergyConverter()
    {
        super();
        this.setBlockName(BlockNames.ENERGYCONVERTER_NAME);
        this.setBlockTextureName(Textures.ENERGYCONVERTER_TEXTURE);
    }
}
