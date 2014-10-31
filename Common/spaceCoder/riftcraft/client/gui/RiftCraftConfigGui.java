package spaceCoder.riftcraft.client.gui;

import spaceCoder.riftcraft.handler.ConfigurationHandler;
import spaceCoder.riftcraft.lib.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class RiftCraftConfigGui extends GuiConfig
{
    public RiftCraftConfigGui(GuiScreen guiScreen)
    {
        super(guiScreen, 
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID, 
                false, 
                false, 
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
       
    }
}
                
        