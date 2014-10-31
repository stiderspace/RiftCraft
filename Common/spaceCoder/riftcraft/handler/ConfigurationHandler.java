package spaceCoder.riftcraft.handler;

import java.io.File;

import spaceCoder.riftcraft.lib.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean isModActive = true;
    
    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
      
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync configs
            loadConfiguration();
        }
    }
    
    private static void loadConfiguration()
    {
        isModActive = configuration.getBoolean("isModActive",Configuration.CATEGORY_GENERAL, true, "If This Is True, This Mod Is Active");
        
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
