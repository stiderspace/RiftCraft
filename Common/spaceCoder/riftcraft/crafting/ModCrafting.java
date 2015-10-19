package spaceCoder.riftcraft.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import spaceCoder.riftcraft.lib.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModCrafting 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(Blocks.bedrock),
			    " x ",
			    "y y",
			    " x ",
			    'x', Blocks.dirt, 'y', Blocks.cobblestone);
		
		/*
		GameRegistry.addRecipe(
    	new ItemStack(Block.stone),
    	"xyx",
    	"y y",
    	"xyx",
    	'x', dirtStack, 'y', gravelStack);
			
			     GameRegistry.addShapelessRecipe(diamondsStack, dirtStack, dirtStack,
                dirtStack, dirtStack, dirtStack, dirtStack, new ItemStack(
                        Block.sand), gravelStack, cobbleStack);
		 */
	}
}
