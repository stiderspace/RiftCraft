package spaceCoder.riftcraft.init;

import net.minecraft.item.Item;
import spaceCoder.riftcraft.item.ItemBasicCircuit;
import spaceCoder.riftcraft.item.ItemBlueCrystal;
import spaceCoder.riftcraft.item.ItemCapacitor1;
import spaceCoder.riftcraft.item.ItemCapacitor2;
import spaceCoder.riftcraft.item.ItemCircuitBoard;
import spaceCoder.riftcraft.item.ItemHellfireBoots;
import spaceCoder.riftcraft.item.ItemHellfireChestplate;
import spaceCoder.riftcraft.item.ItemHellfireDust;
import spaceCoder.riftcraft.item.ItemHellfireHelmet;
import spaceCoder.riftcraft.item.ItemHellfireIngot;
import spaceCoder.riftcraft.item.ItemHellfireLeggings;
import spaceCoder.riftcraft.item.ItemLEDBlue;
import spaceCoder.riftcraft.item.ItemLEDGreen;
import spaceCoder.riftcraft.item.ItemLEDRed;
import spaceCoder.riftcraft.item.ItemLEDYellow;
import spaceCoder.riftcraft.item.ItemMicrocontroller;
import spaceCoder.riftcraft.item.ItemProcessor;
import spaceCoder.riftcraft.item.ItemResistor1;
import spaceCoder.riftcraft.item.ItemResistor2;
import spaceCoder.riftcraft.item.ItemSpaceTimeFluxSensor;
import spaceCoder.riftcraft.item.ItemTransistor;
import spaceCoder.riftcraft.item.ItemWarpedMatterIngot;
import spaceCoder.riftcraft.item.Material;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.reference.Textures;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;

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
    
    public static Item Capacitor1;
    public static Item Capacitor2;
    public static Item LEDBlue;
    public static Item LEDGreen;
    public static Item LEDRed;
    public static Item LEDYellow;
    public static Item MicroController;
    public static Item Processor;
    public static Item Resistor1;
    public static Item Resistor2;
    public static Item SpaceTimeFluxSensor;
    public static Item Transistor;
    
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
        
        Capacitor1                 	  = new ItemCapacitor1();
        Capacitor2                 	  = new ItemCapacitor2();
        LEDBlue                		  = new ItemLEDBlue();
        LEDGreen               		  = new ItemLEDGreen();
        LEDRed                		  = new ItemLEDRed();
        LEDYellow               	  = new ItemLEDYellow();
        MicroController               = new ItemMicrocontroller();
        Processor                	  = new ItemProcessor();
        Resistor1                	  = new ItemResistor1();
        Resistor2                	  = new ItemResistor2();
        SpaceTimeFluxSensor           = new ItemSpaceTimeFluxSensor();
        Transistor             	      = new ItemTransistor();
        
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
        
        RegisterHelper.registerItem(Capacitor1);
        RegisterHelper.registerItem(Capacitor2);
        RegisterHelper.registerItem(LEDBlue);
        RegisterHelper.registerItem(LEDGreen);
        RegisterHelper.registerItem(LEDRed);
        RegisterHelper.registerItem(LEDYellow);
        RegisterHelper.registerItem(MicroController);
        RegisterHelper.registerItem(Processor);
        RegisterHelper.registerItem(Resistor1);
        RegisterHelper.registerItem(Resistor2);
        RegisterHelper.registerItem(SpaceTimeFluxSensor);
        RegisterHelper.registerItem(Transistor);
    }
}
