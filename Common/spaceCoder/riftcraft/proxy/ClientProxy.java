package spaceCoder.riftcraft.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import spaceCoder.riftcraft.init.ModBlocks;
import spaceCoder.riftcraft.render.Inventory.RenderItemContainedBlackHole;
import spaceCoder.riftcraft.render.Inventory.RenderItemRiftMachine;
import spaceCoder.riftcraft.render.Inventory.RenderItemRiftMachineSupport;
import spaceCoder.riftcraft.render.blocks.RenderContainedBlackHole;
import spaceCoder.riftcraft.render.blocks.RenderRiftMachine;
import spaceCoder.riftcraft.render.blocks.RenderRiftMachineSupport;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;
import spaceCoder.riftcraft.tile.TileEntityRiftMachine;
import spaceCoder.riftcraft.tile.TileEntityRiftMachineSupport;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;


public class ClientProxy extends CommonProxy
{
    public static int renderPass;
    @Override
    public void loadRenderers()
    {
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.ContainedBlackHole), new RenderItemContainedBlackHole());
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.RiftMachine), new RenderItemRiftMachine());
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.RiftMachineSupport), new RenderItemRiftMachineSupport());
            
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntityContainedBlackHole.class, new RenderContainedBlackHole());
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRiftMachine.class, new RenderRiftMachine());
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRiftMachineSupport.class, new RenderRiftMachineSupport());
        super.loadRenderers();
    }
}
