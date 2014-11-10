package spaceCoder.riftcraft.block;

import net.minecraft.block.material.Material;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.Textures;

public class BlockRiftMachine extends BlockRC
{
    public BlockRiftMachine() {
        super();
        this.setBlockName(BlockNames.RIFTMACHINE_NAME);
        this.setBlockTextureName(Textures.RIFTMACHINE_TEXTURE);
    }

}
