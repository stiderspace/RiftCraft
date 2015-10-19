package spaceCoder.riftcraft.block.ores;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import spaceCoder.riftcraft.block.BlockRC;
import spaceCoder.riftcraft.init.ModItems;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockCrystalOre extends BlockRC
{
	public BlockCrystalOre()
	{
		super(Material.rock);
		this.setBlockName(BlockNames.BLOCKNAME_CRYSTALORE);
		this.setHardness(4.5F);
		this.setResistance(3.5F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
	}
	
    public Item getItemDropped(int var1, Random var2, int var3)
    {
        return ModItems.BlueCrystal;
    }

    public int quantityDropped(Random amount)
    {
        return 1 + amount.nextInt(2);
    }
}