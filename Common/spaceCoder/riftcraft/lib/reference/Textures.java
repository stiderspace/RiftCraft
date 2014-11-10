package spaceCoder.riftcraft.lib.reference;


import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

public class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";
    
    // Base file paths
    public static final String MODEL_SHEET_LOCATION = "textures/models/";
    public static final String ARMOR_SHEET_LOCATION = "textures/armor/";
    public static final String GUI_SHEET_LOCATION = "textures/gui/";
    public static final String EFFECTS_LOCATION = "textures/effects/";

    // Item/Block sprite sheets
    public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
    public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;
    
    
    // Texture Blocks
    public static final String WARPEDBLOCK_TEXTURE        = RESOURCE_PREFIX + BlockNames.WARPEDBLOCK_NAME;
    public static final String RIFT_TEXTURE               = RESOURCE_PREFIX + BlockNames.RIFT_NAME;
    public static final String BLACKHOLEEXTRACTOR_TEXTURE = RESOURCE_PREFIX + BlockNames.BLACKHOLEEXTRACTOR_NAME;
    public static final String ENERGUHUB_TEXTURE          = RESOURCE_PREFIX + BlockNames.ENERGUHUB_NAME;
    public static final String ENERGYCONVERTER_TEXTURE    = RESOURCE_PREFIX + BlockNames.ENERGYCONVERTER_NAME;
    public static final String RIFTMACHINE_TEXTURE        = RESOURCE_PREFIX + BlockNames.RIFTMACHINE_NAME;
    public static final String CONTAINEDRIFT_TEXTURE      = RESOURCE_PREFIX + BlockNames.CONTAINEDRIFT_NAME;
    public static final String CONTAINEDBLCKHOLE_TEXTURE  = RESOURCE_PREFIX + BlockNames.CONTAINEDBLCKHOLE_NAME;
    public static final String TEMPERALCHEST_TEXTURE      = RESOURCE_PREFIX + BlockNames.TEMPERALCHEST_NAME;
    public static final String DWARFSTARALOY_TEXTURE      = RESOURCE_PREFIX + BlockNames.DWARFSTARALOY_NAME;
    
    // Texture Items

}
