package spaceCoder.riftcraft.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import spaceCoder.riftcraft.init.ModItems;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class BlockHellfireOre extends BlockRC 
{
	public BlockHellfireOre()
	{
		super(Material.rock);
		this.setBlockName(BlockNames.BLOCKNAME_HELLFIREORE);
		this.setHardness(3.0F);
		this.setStepSound(soundTypeStone);
	}
	
    public Item getItemDropped(int var1, Random var2, int var3)
    {
        return ModItems.HellfireDust;
    }
    
    public int quantityDropped(Random amount)
    {
        return 1 + amount.nextInt(2);
    }

    //Smoke Generation 
}

