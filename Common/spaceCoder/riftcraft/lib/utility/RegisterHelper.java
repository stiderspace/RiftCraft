package spaceCoder.riftcraft.lib.utility;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import spaceCoder.riftcraft.lib.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper
{
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, Reference.MOD_ID + "_" + block.getUnlocalizedName().substring(5));
    }

    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, Reference.MOD_ID + "_" + item.getUnlocalizedName().substring(5));
    }
}


