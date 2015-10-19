package spaceCoder.riftcraft;

import spaceCoder.riftcraft.crafting.CraftingItems;
import spaceCoder.riftcraft.crafting.ModCrafting;
import spaceCoder.riftcraft.handler.ConfigurationHandler;
import spaceCoder.riftcraft.init.ModBlocks;
import spaceCoder.riftcraft.init.ModDimensions;
import spaceCoder.riftcraft.init.ModItems;
import spaceCoder.riftcraft.init.ModTile;
import spaceCoder.riftcraft.init.ModWorldGeneration;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.utility.LogHelper;
import spaceCoder.riftcraft.proxy.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, guiFactory = Reference.GUI_FACTORY_CLASS)

public class Riftcraft {
	
	@Instance(Reference.MOD_ID)
	public static Riftcraft instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;


		@EventHandler
		public void preInit(FMLPreInitializationEvent event) 
		{
		    ConfigurationHandler.init(event.getSuggestedConfigurationFile()); 
		    FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		    ModBlocks.init();
            ModItems.init();
            ModTile.init();
            ModWorldGeneration.init();
            //ModDimensions.init();
            ModCrafting.init();
            CraftingItems.init();
            LogHelper.info("Pre Initialization Finished");
		    		
		}

		@EventHandler
		public void load(FMLInitializationEvent event) 
		{
		    proxy.loadRenderers();
		    LogHelper.info("Initialization Finished");	
		}

		@EventHandler
		public void postInit(FMLPostInitializationEvent event) 
		{
		    LogHelper.info("Post Initialization Finished");
		}
	}


