package spaceCoder.riftcraft.init;

import net.minecraftforge.oredict.OreDictionary;
import spaceCoder.riftcraft.lib.reference.BlockNames;

public class ModOreRegistation
{
    public static void init()
    {
        OreDictionary.registerOre("oreAluminum", ModBlocks.AluminiumOre);
        OreDictionary.registerOre("oreCoper", ModBlocks.CoperOre);
        OreDictionary.registerOre("oreTin", ModBlocks.TinOre);
        OreDictionary.registerOre("oreSilver", ModBlocks.SilverOre);
        OreDictionary.registerOre("oreLead", ModBlocks.LeadOre);
        OreDictionary.registerOre("orePlatinum", ModBlocks.PlatinumOre);
        OreDictionary.registerOre("oreTitanium", ModBlocks.TitaniumOre);
        OreDictionary.registerOre("oreTunsten", ModBlocks.TunstenOre);
        OreDictionary.registerOre("oreUranium", ModBlocks.UraniumOre);
        
        OreDictionary.registerOre("ingot", ModItems);
    }

}
