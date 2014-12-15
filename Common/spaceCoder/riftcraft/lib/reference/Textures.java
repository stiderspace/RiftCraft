package spaceCoder.riftcraft.lib.reference;


import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import spaceCoder.riftcraft.lib.utility.ResourceLocationHelper;

public class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
    
    // Base file paths
    public static final String LOCATION_MODEL_SHEET = "textures/models/";
    public static final String LOCATION_ARMOR_SHEET = "textures/armor/";
    public static final String LOCATION_GUI_SHEET   = "textures/gui/";
    public static final String LOCATION_EFFECTS     = "textures/effects/";

    // Item/Block sprite sheets
    public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
    public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;
    
    
    // Texture Blocks
    public static final String TEXTURE_WARPEDBLOCK        = RESOURCE_PREFIX + BlockNames.BLOCKNAME_WARPEDBLOCK;
    public static final String TEXTURE_RIFT               = RESOURCE_PREFIX + BlockNames.BLOCKNAME_RIFT;
    public static final String TEXTURE_BLACKHOLEEXTRACTOR = RESOURCE_PREFIX + BlockNames.BLOCKNAME_BLACKHOLEEXTRACTOR;
    public static final String TEXTURE_ENERGUHUB          = RESOURCE_PREFIX + BlockNames.BLOCKNAME_ENERGYHUB;
    public static final String TEXTURE_ENERGYCONVERTER    = RESOURCE_PREFIX + BlockNames.BLOCKNAME_ENERGYCONVERTER;
    public static final String TEXTURE_RIFTMACHINE        = RESOURCE_PREFIX + BlockNames.BLOCKNAME_RIFTMACHINE;
    public static final String TEXTURE_CONTAINEDRIFT      = RESOURCE_PREFIX + BlockNames.BLOCKNAME_CONTAINEDRIFT;
    public static final String TEXTURE_CONTAINEDBLCKHOLE  = RESOURCE_PREFIX + BlockNames.BLOCKNAME_CONTAINEDBLACKHOLE;
    public static final String TEXTURE_TEMPERALCHEST      = RESOURCE_PREFIX + BlockNames.BLOCKNAME_TEMPERALCHEST;
    public static final String TEXTURE_DWARFSTARALOY      = RESOURCE_PREFIX + BlockNames.BLOCKNAME_DWARFSTARALLOY;
    
    // Texture Models
    public static final ResourceLocation MODEL_CONTAINEDBLACKHOLE       = ResourceLocationHelper.getResourceLocation(LOCATION_MODEL_SHEET + "contained_black_hole.png");
    public static final ResourceLocation MODEL_CONTAINEDBLACKHOLE_disc  = ResourceLocationHelper.getResourceLocation(LOCATION_ARMOR_SHEET + "disc.png");
    public static final ResourceLocation MODEL_RIFTMACHINE              = ResourceLocationHelper.getResourceLocation(LOCATION_GUI_SHEET   + "support.png");
    public static final ResourceLocation MODEL_RIFTMACHINE_RING         = ResourceLocationHelper.getResourceLocation(LOCATION_EFFECTS     + "ring1.png");
    
    // Texture Items
    public static final String TEXTURE_WARPEDMATTERINGOT  = RESOURCE_PREFIX + ItemNames.ITEMNAME_WARPEDMATTERINGOT;
    
}

//Kunnen de texture bestanden beginnen met block_ of item_ ? want dit was eerst zo maar dat is veranderd omdat
//denk ik het anders niet werkt? Hopelijk kan dat wel binnenkort maakt het wel overzichtelijker.