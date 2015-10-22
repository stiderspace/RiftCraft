package spaceCoder.riftcraft.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import spaceCoder.riftcraft.init.ModBlocks;
import spaceCoder.riftcraft.init.ModItems;
import spaceCoder.riftcraft.lib.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Smelting 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.AluminiumOre, 	new ItemStack(ModItems.AluminiumIngot), 0.1f);
		GameRegistry.addSmelting(ModBlocks.CopperOre, 		new ItemStack(ModItems.CopperIngot), 0.1f);
		GameRegistry.addSmelting(ModBlocks.LeadOre, 		new ItemStack(ModItems.LeadIngot), 0.1f);
		GameRegistry.addSmelting(ModBlocks.PlatinumOre, 	new ItemStack(ModItems.PlatinumIngot), 0.1f);
		GameRegistry.addSmelting(ModBlocks.TitaniumOre, 	new ItemStack(ModItems.TitaniumIngot), 0.1f);
		GameRegistry.addSmelting(ModBlocks.UraniumOre, 		new ItemStack(ModItems.UraniumIngot), 0.1f);
		GameRegistry.addSmelting(ModBlocks.TinOre, 			new ItemStack(ModItems.TinIngot), 0.1f);
		GameRegistry.addSmelting(ModBlocks.SilverOre, 		new ItemStack(ModItems.SilverIngot), 0.1f);
		GameRegistry.addSmelting(ModBlocks.TunstenOre, 		new ItemStack(ModItems.TungstenIngot), 0.1f);
	}
}
