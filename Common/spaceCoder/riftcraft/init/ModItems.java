package spaceCoder.riftcraft.init;

import net.minecraft.item.Item;
import spaceCoder.riftcraft.item.ItemWarpedMatterIngot;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Declare the items
    public static Item ItemWarpedMatterIngot;
    
    public static void init()
    {
        //Add the items
        ItemWarpedMatterIngot             = new ItemWarpedMatterIngot();
        
        //Register the items
        RegisterHelper.registerItem(ItemWarpedMatterIngot);
    }
}
