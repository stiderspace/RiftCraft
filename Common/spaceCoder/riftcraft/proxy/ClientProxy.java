package spaceCoder.riftcraft.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import spaceCoder.riftcraft.init.ModBlocks;
import spaceCoder.riftcraft.render.Inventory.RenderItemContainedBlackHole;
import spaceCoder.riftcraft.render.Inventory.RenderItemRiftMachine;
import spaceCoder.riftcraft.render.blocks.RenderContainedBlackHole;
import spaceCoder.riftcraft.render.blocks.RenderRiftMachine;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;
import spaceCoder.riftcraft.tile.TileEntityRiftMachine;
import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy
{

    @Override
    public void loadRenderers()
    {
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.ContainedBlackHole), new RenderItemContainedBlackHole());
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.RiftMachine), new RenderItemRiftMachine());
        
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntityContainedBlackHole.class, new RenderContainedBlackHole());
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRiftMachine.class, new RenderRiftMachine());
        super.loadRenderers();
    }
}
