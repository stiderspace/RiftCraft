package spaceCoder.riftcraft.lib.utility;

import java.lang.reflect.Field;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import spaceCoder.riftcraft.init.ModBlocks;
import spaceCoder.riftcraft.init.ModItems;
import spaceCoder.riftcraft.lib.reference.Reference;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper
{
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block,block.getUnlocalizedName().substring(15));
       
    }

    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item,item.getUnlocalizedName().substring(15));
    }
    
    public static void registerTileEntity(Class title, String name)
    {
        GameRegistry.registerTileEntity(title, name);
    }
    
    public static void registerIWorldGenerator(IWorldGenerator worldgenerator)
    {
    	GameRegistry.registerWorldGenerator(worldgenerator, 0);
    }
}