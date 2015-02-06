package spaceCoder.riftcraft.render.blocks;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import spaceCoder.riftcraft.lib.reference.Models;
import spaceCoder.riftcraft.lib.reference.Textures;
import spaceCoder.riftcraft.tile.TileEntityContainedBlackHole;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderContainedBlackHole extends TileEntitySpecialRenderer
{
    
    private IModelCustom container;
    private IModelCustom disc;
    
    public RenderContainedBlackHole()
    {
        container = AdvancedModelLoader.loadModel(Models.CONTAINEDBLACKHOLECONTAINER);
        disc = AdvancedModelLoader.loadModel(Models.CONTAINEDBLACKHOLEDISC);
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double posX, double posY, double posZ, float par1)
    {
           if(!(tileEntity instanceof TileEntityContainedBlackHole)) return;
           TileEntityContainedBlackHole tileEntityContainedBlackHole = (TileEntityContainedBlackHole) tileEntity;
        float scale = .5F;   
        GL11.glPushMatrix();
            GL11.glAlphaFunc(GL11.GL_GREATER, 0F);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDepthMask(true);
            GL11.glPushMatrix();
                GL11.glTranslated(posX + 0.5, posY, posZ + 0.5); 
                GL11.glScalef(scale, scale, scale);
                FMLClientHandler.instance().getClient().getTextureManager().bindTexture(Textures.MODEL_CONTAINEDBLACKHOLE);
                container.renderAll();
            GL11.glPopMatrix();
            GL11.glEnable(GL11.GL_BLEND);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glBlendFunc(770, 771);
            GL11.glPushMatrix();
                //GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                //GL11.glDepthMask(false);
                GL11.glTranslated(posX + 0.5, posY, posZ + 0.5);     
                GL11.glScalef(scale, scale, scale);
                FMLClientHandler.instance().getClient().getTextureManager().bindTexture(Textures.MODEL_CONTAINEDBLACKHOLE_disc);
                GL11.glRotated(tileEntityContainedBlackHole.rotation, 0, 1, 0);
                disc.renderAll();
            GL11.glPopMatrix();   
            //GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDepthMask(true);
        GL11.glPopMatrix();
    }
}
