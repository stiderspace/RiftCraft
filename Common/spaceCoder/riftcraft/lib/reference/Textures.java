package spaceCoder.riftcraft.lib.reference;


import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import spaceCoder.riftcraft.lib.utility.ResourceLocationHelper;

public class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
    
    // Base file paths
    public static final String LOCATION_SHEET_MODEL = "textures/models/";
    public static final String LOCATION_SHEET_ARMOR = "textures/armor/";
    public static final String LOCATION_SHEET_GUI   = "textures/gui/";
    public static final String LOCATION_EFFECTS     = "textures/effects/";
    public static final String LOCATION_ENTITY	    = "textures/entity/";

    // Item/Block sprite sheets
    public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
    public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;
    
    
    // Texture Blocks
    public static final String TEXTURE_WARPEDMATTER       = RESOURCE_PREFIX + BlockNames.BLOCKNAME_WARPEDMATTER;
    public static final String TEXTURE_RIFT               = RESOURCE_PREFIX + BlockNames.BLOCKNAME_RIFT;
    public static final String TEXTURE_BLACKHOLEEXTRACTOR = RESOURCE_PREFIX + BlockNames.BLOCKNAME_BLACKHOLEEXTRACTOR;
    public static final String TEXTURE_ENERGYHUB          = RESOURCE_PREFIX + BlockNames.BLOCKNAME_ENERGYHUB;
    public static final String TEXTURE_ENERGYCONVERTER    = RESOURCE_PREFIX + BlockNames.BLOCKNAME_ENERGYCONVERTER;
    public static final String TEXTURE_RIFTMACHINE        = RESOURCE_PREFIX + BlockNames.BLOCKNAME_RIFTMACHINE;
    public static final String TEXTURE_CONTAINEDRIFT      = RESOURCE_PREFIX + BlockNames.BLOCKNAME_CONTAINEDRIFT;
    public static final String TEXTURE_CONTAINEDBLACKHOLE = RESOURCE_PREFIX + BlockNames.BLOCKNAME_CONTAINEDBLACKHOLE;
    public static final String TEXTURE_TEMPORALCHEST      = RESOURCE_PREFIX + BlockNames.BLOCKNAME_TEMPORALCHEST;
    public static final String TEXTURE_DWARFSTARALOY      = RESOURCE_PREFIX + BlockNames.BLOCKNAME_DWARFSTARALLOY;
    
    public static final String TEXTURE_CRYSTALOREBLUE	  = RESOURCE_PREFIX + BlockNames.BLOCKNAME_CRYSTALORE;
    
    public static final String TEXTURE_SUBZEROMATTER	  = RESOURCE_PREFIX + BlockNames.BLOCKNAME_SUBZEROMATTER;
    public static final String TEXTURE_SUBZEROICE		  = RESOURCE_PREFIX + BlockNames.BLOCKNAME_SUBZEROICE;
    public static final String TEXTURE_SUBZEROCRYSTALORE  = RESOURCE_PREFIX + BlockNames.BLOCKNAME_SUBZEROCRYSTALORE;
    public static final String TEXTURE_SUBZEROFIRE		  = RESOURCE_PREFIX + BlockNames.BLOCKNAME_SUBZEROFIRE;
    
    // Texture Models
    public static final ResourceLocation MODEL_CONTAINEDBLACKHOLE       = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "contained_black_hole.png");
    public static final ResourceLocation MODEL_CONTAINEDBLACKHOLE_disc  = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "disc.png");
    public static final ResourceLocation MODEL_RIFTMACHINE              = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "support.png");
    public static final ResourceLocation MODEL_RIFTMACHINE_RING         = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "ring1.png");
    public static final ResourceLocation MODEL_RIFTMACHINE_RIFT         = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "wormhole6.png");

    public static final ResourceLocation MODEL_RIFTMACHINE_SUPPORT      = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "support.png");
    
    // Texture Items
    public static final String TEXTURE_WARPEDMATTERINGOT  = RESOURCE_PREFIX + ItemNames.ITEMNAME_WARPEDMATTERINGOT;
    
    public static final String TEXTURE_HELLFIREDUST	  	  = RESOURCE_PREFIX + ItemNames.ITEMNAME_HELLFIREDUST;
    public static final String TEXTURE_HELLFIREINGOT	  = RESOURCE_PREFIX + ItemNames.ITEMNAME_HELLFIREINGOT;
    public static final String TEXTURE_HELLFIREHELMET	  = RESOURCE_PREFIX + ItemNames.ITEMNAME_HELLFIREHELMET;
    public static final String TEXTURE_HELLFIRECHESTPLATE = RESOURCE_PREFIX + ItemNames.ITEMNAME_HELLFIRECHESTPLATE;
    public static final String TEXTURE_HELLFIRELEGGINGS	  = RESOURCE_PREFIX + ItemNames.ITEMNAME_HELLFIRELEGGINGS;
    public static final String TEXTURE_HELLFIREBOOTS	  = RESOURCE_PREFIX + ItemNames.ITEMNAME_HELLFIREBOOTS;
    
    // Other Textures
    public static final String ENTITY_HELLFIRE_LAYER1	  = RESOURCE_PREFIX + LOCATION_SHEET_ARMOR + "hellfire_layer_1"			+ ".png";
    public static final String ENTITY_HELLFIRE_LAYER2	  = RESOURCE_PREFIX + LOCATION_SHEET_ARMOR + "hellfire_layer_2" 		+ ".png";

    
}