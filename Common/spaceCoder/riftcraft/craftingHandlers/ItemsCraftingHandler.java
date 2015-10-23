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
		ItemStack GreenGlass  = new ItemStack(Blocks.stained_glass_pane, 1, 13);
		ItemStack RedGlass	  = new ItemStack(Blocks.stained_glass_pane, 1, 14);
		ItemStack YellowGlass = new ItemStack(Blocks.stained_glass_pane, 1, 4);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.BasicCircuit), 		"czc", "axa", "byb",
		'x', ModItems.CircuitBoard, 'y', ModItems.Resistor1, 'z', ModItems.MicroController, 'a', ModItems.Capacitor1, 'b', ModItems.Transistor, 'c', ModItems.LEDGreen);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.Capacitor1), 			"yxy", "yxy", "y y",
		'x', Items.paper, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.Capacitor2), 			"yxy", "yxy", "y y",
		'x', Blocks.glass_pane, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.CircuitBoard), 		"y y", " x ", "y y",
		'x', LimeDye, 'y', ModItems.CopperIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.CopperCoil), 			"xxx", "xxx", "x x",
		'x', ModItems.CopperIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.LEDBlue), 			" x ", "x x", "y y",
		'x', BlueGlass, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.LEDGreen), 			" x ", "x x", "y y",
		'x', GreenGlass, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.LEDRed), 				" x ", "x x", "y y",
		'x', RedGlass, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.LEDYellow), 			" x ", "x x", "y y",
		'x', YellowGlass, 'y', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.MicroController), 	"xyx", "xzx", "xyx",
		'x', ModItems.IronWire, 'y', ModItems.AluminiumIngot, 'z', ModItems.BasicCircuit);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.Processor), 			"xyx", "yzy", "xyx",
		'x', ModItems.Transistor, 'y', ModItems.IronWire, 'z', ModItems.AluminiumIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.Resistor1), 			"   ", "xyx", "   ",
		'x', ModItems.IronWire, 'y', Items.coal);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.Resistor1), 			"   ", "xyx", "   ",
		'x', ModItems.IronWire, 'y', Blocks.coal_block);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.Transistor), 			" y ", "xyx", " x ",
		'x', ModItems.IronWire, 'y', ModItems.AluminiumIngot);
		
		
		
		GameRegistry.addRecipe(new ItemStack(ModItems.CopperWire), 			"   ", "xxx", "   ",
		'x', ModItems.CopperIngot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.IronWire), 			"   ", "xxx", "   ",
		'x', Items.iron_ingot);
		
		GameRegistry.addRecipe(new ItemStack(ModItems.TungstenWire), 		"   ", "xxx", "   ",
		'x', ModItems.TungstenIngot);
		
		
		
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
