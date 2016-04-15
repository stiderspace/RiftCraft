package spaceCoder.riftcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import spaceCoder.riftcraft.item.ItemBasicCircuit;
import spaceCoder.riftcraft.item.ItemBlueCrystal;
import spaceCoder.riftcraft.item.ItemCapacitor;
import spaceCoder.riftcraft.item.ItemCircuitBoard;
import spaceCoder.riftcraft.item.ItemCopperCoil;
import spaceCoder.riftcraft.item.ItemCopperWire;
import spaceCoder.riftcraft.item.ItemHellfireBoots;
import spaceCoder.riftcraft.item.ItemHellfireChestplate;
import spaceCoder.riftcraft.item.ItemHellfireDust;
import spaceCoder.riftcraft.item.ItemHellfireHelmet;
import spaceCoder.riftcraft.item.ItemHellfireLeggings;
import spaceCoder.riftcraft.item.ItemIronWire;
import spaceCoder.riftcraft.item.ItemLEDBlue;
import spaceCoder.riftcraft.item.ItemLEDGreen;
import spaceCoder.riftcraft.item.ItemLEDRed;
import spaceCoder.riftcraft.item.ItemLEDYellow;
import spaceCoder.riftcraft.item.ItemProcessor;
import spaceCoder.riftcraft.item.ItemResistor;
import spaceCoder.riftcraft.item.ItemSpaceTimeFluxSensor;
import spaceCoder.riftcraft.item.ItemTransistor;
import spaceCoder.riftcraft.item.ItemTungstenWire;
import spaceCoder.riftcraft.item.ItemWarpedMatterIngot;
import spaceCoder.riftcraft.item.Material;
import spaceCoder.riftcraft.item.ingots.ItemAluminiumIngot;
import spaceCoder.riftcraft.item.ingots.ItemCopperIngot;
import spaceCoder.riftcraft.item.ingots.ItemHellfireIngot;
import spaceCoder.riftcraft.item.ingots.ItemLeadIngot;
import spaceCoder.riftcraft.item.ingots.ItemPlatinumIngot;
import spaceCoder.riftcraft.item.ingots.ItemSilverIngot;
import spaceCoder.riftcraft.item.ingots.ItemTinIngot;
import spaceCoder.riftcraft.item.ingots.ItemTitaniumIngot;
import spaceCoder.riftcraft.item.ingots.ItemTungstenIngot;
import spaceCoder.riftcraft.item.ingots.ItemUraniumIngot;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.reference.Textures;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    //Declare the items
    public static Item WarpedMatterIngot;
    public static Item BlueCrystal;
    public static Item CircuitBoard;
    public static Item BasicCircuit;
    
    public static Item HellfireDust;
    public static Item HellfireIngot;
    public static Item HellfireHelmet;
    public static Item HellfireChestplate;
    public static Item HellfireLeggings;
    public static Item HellfireBoots;
    
    public static Item Capacitor;
    public static Item LEDBlue;
    public static Item LEDGreen;
    public static Item LEDRed;
    public static Item LEDYellow;
    public static Item MicroController;
    public static Item Processor;
    public static Item Resistor;
    public static Item SpaceTimeFluxSensor;
    public static Item Transistor;
    public static Item CopperCoil;
    
    public static Item CopperWire;
    public static Item IronWire;
    public static Item TungstenWire;
    
    public static Item CopperIngot;
    public static Item TinIngot;
    public static Item SilverIngot;
    public static Item AluminiumIngot;
    public static Item LeadIngot;
    public static Item TungstenIngot;
    public static Item PlatinumIngot;
    public static Item TitaniumIngot;
    public static Item UraniumIngot;
    
    
    public static void init()
    {
        //Add the items
        WarpedMatterIngot             = new ItemWarpedMatterIngot();
        BlueCrystal            		  = new ItemBlueCrystal();
        CircuitBoard             	  = new ItemCircuitBoard();
        BasicCircuit				  = new ItemBasicCircuit();
        
        HellfireDust				  = new ItemHellfireDust();
        HellfireIngot                 = new ItemHellfireIngot();
        HellfireHelmet                = new ItemHellfireHelmet(ItemNames.ITEMNAME_HELLFIREHELMET, Material.HellfireArmor, Textures.ENTITY_HELLFIRE_LAYER1, 0);
        HellfireChestplate            = new ItemHellfireChestplate();
        HellfireLeggings              = new ItemHellfireLeggings();
        HellfireBoots                 = new ItemHellfireBoots();
        
        Capacitor                 	  = new ItemCapacitor();
        LEDBlue                		  = new ItemLEDBlue();
        LEDGreen               		  = new ItemLEDGreen();
        LEDRed                		  = new ItemLEDRed();
        LEDYellow               	  = new ItemLEDYellow();
        Processor                	  = new ItemProcessor();
        Resistor	               	  = new ItemResistor();
        SpaceTimeFluxSensor           = new ItemSpaceTimeFluxSensor();
        Transistor             	      = new ItemTransistor();
        CopperCoil				      = new ItemCopperCoil();
        
        CopperWire				      = new ItemCopperWire();
        IronWire				      = new ItemIronWire();
        TungstenWire				  = new ItemTungstenWire();
        
        CopperIngot                     = new ItemCopperIngot();
        TinIngot                        = new ItemTinIngot();
        SilverIngot                     = new ItemSilverIngot();
        AluminiumIngot                  = new ItemAluminiumIngot();
        LeadIngot                       = new ItemLeadIngot();
        TungstenIngot                   = new ItemTungstenIngot();
        PlatinumIngot                   = new ItemPlatinumIngot();
        TitaniumIngot                   = new ItemTitaniumIngot();
        UraniumIngot                    = new ItemUraniumIngot();
        
        //Register the items
        RegisterHelper.registerItem(WarpedMatterIngot);
        RegisterHelper.registerItem(BlueCrystal);
        RegisterHelper.registerItem(CircuitBoard);
        RegisterHelper.registerItem(BasicCircuit);
        
        RegisterHelper.registerItem(HellfireDust);
        RegisterHelper.registerItem(HellfireIngot);
        RegisterHelper.registerItem(HellfireHelmet);
        RegisterHelper.registerItem(HellfireChestplate);
        RegisterHelper.registerItem(HellfireLeggings);
        RegisterHelper.registerItem(HellfireBoots);
        
        RegisterHelper.registerItem(Capacitor);
        RegisterHelper.registerItem(LEDBlue);
        RegisterHelper.registerItem(LEDGreen);
        RegisterHelper.registerItem(LEDRed);
        RegisterHelper.registerItem(LEDYellow);
        RegisterHelper.registerItem(MicroController);
        RegisterHelper.registerItem(Processor);
        RegisterHelper.registerItem(Resistor);
        RegisterHelper.registerItem(SpaceTimeFluxSensor);
        RegisterHelper.registerItem(Transistor);
        RegisterHelper.registerItem(CopperCoil);
        
        RegisterHelper.registerItem(CopperWire);
        RegisterHelper.registerItem(IronWire);
        RegisterHelper.registerItem(TungstenWire);
        
        RegisterHelper.registerItem(CopperIngot);
        RegisterHelper.registerItem(TinIngot);
        RegisterHelper.registerItem(SilverIngot);
        RegisterHelper.registerItem(AluminiumIngot);
        RegisterHelper.registerItem(LeadIngot);
        RegisterHelper.registerItem(TungstenIngot);
        RegisterHelper.registerItem(PlatinumIngot);
        RegisterHelper.registerItem(TitaniumIngot);
        RegisterHelper.registerItem(UraniumIngot);
    }
}
