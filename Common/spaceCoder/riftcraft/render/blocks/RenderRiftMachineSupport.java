package spaceCoder.riftcraft.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import spaceCoder.riftcraft.lib.reference.Models;
import spaceCoder.riftcraft.lib.reference.Textures;
import spaceCoder.riftcraft.tile.TileEntityRiftMachine;
import spaceCoder.riftcraft.tile.TileEntityRiftMachineSupport;
import cpw.mods.fml.client.FMLClientHandler;

public class RenderRiftMachineSupport extends TileEntitySpecialRenderer
{
    private IModelCustom support;
    
    public  RenderRiftMachineSupport()
    {
        support = AdvancedModelLoader.loadModel(Models.RIFTMACHINESUPPORT);
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double posX, double posY, double posZ, float par1)
    {
        if(!(tileEntity instanceof TileEntityRiftMachineSupport)) return;
        TileEntityRiftMachineSupport tileEntityRiftMachinesupport = (TileEntityRiftMachineSupport) tileEntity;
        float scale = .5F;
        GL11.glPushMatrix();
            GL11.glPushMatrix();
            GL11.glTranslated(posX + 5, posY + .5, posZ); 
            GL11.glScalef(scale, scale, scale);
            FMLClientHandler.instance().getClient().getTextureManager().bindTexture(Textures.MODEL_RIFTMACHINE_SUPPORT);
            support.renderAll();
        GL11.glPopMatrix();
    }
}
