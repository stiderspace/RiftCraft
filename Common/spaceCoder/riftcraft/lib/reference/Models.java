package spaceCoder.riftcraft.lib.reference;

import net.minecraft.util.ResourceLocation;
import spaceCoder.riftcraft.lib.utility.ResourceLocationHelper;

public class Models
{
    public static final String MODEL_LOCATION = "models/";
    
    public static final ResourceLocation CONTAINEDBLACKHOLE             = ResourceLocationHelper.getResourceLocation(MODEL_LOCATION + "contained_black_hole.obj");
    public static final ResourceLocation CONTAINEDBLACKHOLEDISC         = ResourceLocationHelper.getResourceLocation(MODEL_LOCATION + "contained_black_hole_accretion_disc_TEST.obj");
    public static final ResourceLocation CONTAINEDBLACKHOLECONTAINER    = ResourceLocationHelper.getResourceLocation(MODEL_LOCATION + "contained_black_hole_container.obj");
    
    public static final ResourceLocation RIFTMACHINE                    = ResourceLocationHelper.getResourceLocation(MODEL_LOCATION + "RiftMachine_Base.obj");
    public static final ResourceLocation RIFTMACHINERING                = ResourceLocationHelper.getResourceLocation(MODEL_LOCATION + "RiftMachine_Ring.obj");
    public static final ResourceLocation RIFTMACHINESUPORT              = ResourceLocationHelper.getResourceLocation(MODEL_LOCATION + "RiftMachine_support.obj");
}
