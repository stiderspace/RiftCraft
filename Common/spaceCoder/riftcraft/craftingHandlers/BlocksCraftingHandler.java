package spaceCoder.riftcraft.craftingHandlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import spaceCoder.riftcraft.init.ModBlocks;
import spaceCoder.riftcraft.init.ModItems;
import spaceCoder.riftcraft.lib.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class BlocksCraftingHandler 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.HellfireBlock), 			"xxx", "xxx", "xxx",
				'x', ModItems.HellfireIngot);
	}

}
