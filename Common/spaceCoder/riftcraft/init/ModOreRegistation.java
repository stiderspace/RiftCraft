package spaceCoder.riftcraft.init;

import net.minecraftforge.oredict.OreDictionary;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class ModOreRegistation
{
    public static void init()
    {
        OreDictionary.registerOre("oreAluminum", ModBlocks.AluminiumOre);
        OreDictionary.registerOre("oreCopper", ModBlocks.CopperOre);
        OreDictionary.registerOre("oreTin", ModBlocks.TinOre);
        OreDictionary.registerOre("oreSilver", ModBlocks.SilverOre);
        OreDictionary.registerOre("oreLead", ModBlocks.LeadOre);
        OreDictionary.registerOre("orePlatinum", ModBlocks.PlatinumOre);
        OreDictionary.registerOre("oreTitanium", ModBlocks.TitaniumOre);
        OreDictionary.registerOre("oreTunsten", ModBlocks.TunstenOre);
        OreDictionary.registerOre("oreUranium", ModBlocks.UraniumOre);
        
        OreDictionary.registerOre("ingotAluminum", ModItems.AluminiumIngot);
        OreDictionary.registerOre("ingotCopper", ModItems.CopperIngot);
        OreDictionary.registerOre("ingotTin", ModItems.TinIngot);
        OreDictionary.registerOre("ingotSilver", ModItems.SilverIngot);
        OreDictionary.registerOre("ingotLead", ModItems.LeadIngot);
        OreDictionary.registerOre("ingotPlatinum", ModItems.PlatinumIngot);
        OreDictionary.registerOre("ingotTitanium", ModItems.TitaniumIngot);
        OreDictionary.registerOre("ingotTunsten", ModItems.TungstenIngot);
        OreDictionary.registerOre("ingotUranium", ModItems.UraniumIngot);    
    }
}
