package spaceCoder.riftcraft.render.blocks;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import spaceCoder.riftcraft.lib.reference.Models;
import spaceCoder.riftcraft.lib.reference.Textures;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;
import spaceCoder.riftcraft.tile.TileEntityRiftMachine;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderRiftMachine extends TileEntitySpecialRenderer
{
    private IModelCustom machine;
    private IModelCustom ring;
    private IModelCustom rift;
    
    public  RenderRiftMachine()
    {
        machine = AdvancedModelLoader.loadModel(Models.RIFTMACHINE);
        ring = AdvancedModelLoader.loadModel(Models.RIFTMACHINERING);
        rift = AdvancedModelLoader.loadModel(Models.RIFTMACHINERIFT);
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double posX, double posY, double posZ, float par1)
    {
        if(!(tileEntity instanceof TileEntityRiftMachine)) return;
        TileEntityRiftMachine tileEntityRiftMachine = (TileEntityRiftMachine) tileEntity;
        float scale = .5F;
        GL11.glPushMatrix();
            GL11.glPushMatrix();
            GL11.glTranslated(posX + 0.5, posY, posZ + 0.5); 
            GL11.glScalef(scale, scale, scale);
            FMLClientHandler.instance().getClient().getTextureManager().bindTexture(Textures.MODEL_RIFTMACHINE);
            machine.renderAll();
        GL11.glPopMatrix();
        GL11.glPushMatrix();
            GL11.glTranslated(posX + 0.5, posY + 3.5, posZ + 0.5); 
            GL11.glScalef(scale, scale, scale);
            FMLClientHandler.instance().getClient().getTextureManager().bindTexture(Textures.MODEL_RIFTMACHINE_RING);
            //GL11.glRotated(tileEntityRiftMachine.rotation, 0, 0, 1);            
            ring.renderAll();
        GL11.glPopMatrix(); 
        GL11.glPushMatrix();
            GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDepthMask(true);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glTranslated(posX + 0.5, posY + 3.5, posZ + 0.5); 
            GL11.glScalef(scale, scale, scale);
            FMLClientHandler.instance().getClient().getTextureManager().bindTexture(Textures.MODEL_RIFTMACHINE_RIFT);
            GL11.glRotated(tileEntityRiftMachine.rotation * 2, 0, 0, 1);            
            rift.renderAll();
        GL11.glPopMatrix();
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glDepthMask(true);
    GL11.glPopMatrix();
    }
    
    

}
