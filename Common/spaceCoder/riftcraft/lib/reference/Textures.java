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
    
    // Texture Models
    public static final ResourceLocation MODEL_CONTAINEDBLACKHOLE       = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "contained_black_hole.png");
    public static final ResourceLocation MODEL_CONTAINEDBLACKHOLE_disc  = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "disc.png");
    public static final ResourceLocation MODEL_RIFTMACHINE              = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "support.png");
    public static final ResourceLocation MODEL_RIFTMACHINE_RING         = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "ring1.png");
    public static final ResourceLocation MODEL_RIFTMACHINE_SUPPORT      = ResourceLocationHelper.getResourceLocation(LOCATION_SHEET_MODEL + "support.png");
    
    // Texture Items
    public static final String TEXTURE_WARPEDMATTERINGOT  = RESOURCE_PREFIX + ItemNames.ITEMNAME_WARPEDMATTERINGOT;
    
    // Other Textures
    
}