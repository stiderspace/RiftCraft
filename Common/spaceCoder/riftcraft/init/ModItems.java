package spaceCoder.riftcraft.init;

import net.minecraft.item.Item;
import spaceCoder.riftcraft.item.ItemHellfireBoots;
import spaceCoder.riftcraft.item.ItemHellfireChestplate;
import spaceCoder.riftcraft.item.ItemHellfireDust;
import spaceCoder.riftcraft.item.ItemHellfireHelmet;
import spaceCoder.riftcraft.item.ItemHellfireIngot;
import spaceCoder.riftcraft.item.ItemHellfireLeggings;
import spaceCoder.riftcraft.item.ItemWarpedMatterIngot;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Declare the items
    public static Item WarpedMatterIngot;
    
    public static Item HellfireDust;
    public static Item HellfireIngot;
    public static Item HellfireHelmet;
    public static Item HellfireChestplate;
    public static Item HellfireLeggings;
    public static Item HellfireBoots;
    
    public static void init()
    {
        //Add the items
        WarpedMatterIngot             = new ItemWarpedMatterIngot();
        
        HellfireDust				  = new ItemHellfireDust();
        HellfireIngot                 = new ItemHellfireIngot();
        HellfireHelmet                = new ItemHellfireHelmet();
        HellfireChestplate            = new ItemHellfireChestplate();
        HellfireLeggings              = new ItemHellfireLeggings();
        HellfireBoots                 = new ItemHellfireBoots();
        
        //Register the items
        RegisterHelper.registerItem(WarpedMatterIngot);
        
        RegisterHelper.registerItem(HellfireDust);
        RegisterHelper.registerItem(HellfireIngot);
        RegisterHelper.registerItem(HellfireHelmet);
        RegisterHelper.registerItem(HellfireChestplate);
        RegisterHelper.registerItem(HellfireLeggings);
        RegisterHelper.registerItem(HellfireBoots);
    }
}
