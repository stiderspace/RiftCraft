package spaceCoder.riftcraft.craftingHandlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import spaceCoder.riftcraft.init.ModItems;
import spaceCoder.riftcraft.lib.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemsCraftingHandler 
{
	public static void init()
	{
		/*
		GameRegistry.addRecipe(new ItemStack(Blocks.bedrock), 		" x ", "y y", " x ",
		'x', Blocks.dirt, 'y', Blocks.cobblestone);
		*/
		
		ItemStack LimeDye 	  = new ItemStack(Items.dye, 1, 10);
		ItemStack BlueGlass	  = new ItemStack(Blocks.stained_glass_pane, 1, 11);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.BasicCircuit), 		"czc", "axa", "byb",
		'x', ModItems.CircuitBoard, 'y', ModItems.Resistor1, 'z', ModItems.MicroController, 'a', ModItems.Capacitor1, 'b', ModItems.Transistor, 'c', ModItems.LEDGreen);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.Capacitor1), 			"yxy", "yxy", "y y",
		'x', Items.paper, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.Capacitor2), 			"yxy", "yxy", "y y",
		'x', Blocks.glass_pane, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.CircuitBoard), 		"x x", " y ", "x x",
		'x', LimeDye, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.CopperCoil), 			"xxx", "xxx", "x x",
		'x', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.LEDBlue), 			" x ", "x x", "y y",
		'x', BlueGlass, 'y', Items.iron_ingot);
		
		
		
		
		GameRegistry.addRecipe(new ItemStack(ModItems.HellfireHelmet), 		"xxx", "x x", "   ",
		'x', ModItems.HellfireIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.HellfireChestplate), 	"x x", "xxx", "xxx",
		'x', ModItems.HellfireIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.HellfireLeggings), 	"xxx", "x x", "x x",
		'x', ModItems.HellfireIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.HellfireBoots), 		"   ", "x x", "x x",
		'x', ModItems.HellfireIngot);
	}
}
