package spaceCoder.riftcraft.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import spaceCoder.riftcraft.init.ModBlocks;
import spaceCoder.riftcraft.render.Inventory.RenderItemContainedBlackHole;
import spaceCoder.riftcraft.render.blocks.RenderContainedBlackHole;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;
import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy
{

    @Override
    public void loadRenderers()
    {
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.ContainedBlackHole), new RenderItemContainedBlackHole());
        
            ClientRegistry.bindTileEntitySpecialRenderer(TileEntityContainedBlackHole.class, new RenderContainedBlackHole());
        super.loadRenderers();
    }
}
