package spaceCoder.riftcraft.render.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.common.util.ForgeDirection;

import org.lwjgl.opengl.GL11;

import spaceCoder.riftcraft.lib.reference.Models;
import spaceCoder.riftcraft.lib.reference.Textures;
import spaceCoder.riftcraft.lib.utility.LogHelper;
import spaceCoder.riftcraft.tile.TileEntityRiftMachine;
import spaceCoder.riftcraft.tile.TileEntityRiftMachineSupport;
import cpw.mods.fml.client.FMLClientHandler;

public class RenderRiftMachineSupport extends TileEntitySpecialRenderer
{
    private IModelCustom support;

    public RenderRiftMachineSupport()
    {
        support = AdvancedModelLoader.loadModel(Models.RIFTMACHINESUPPORT);
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double posX, double posY, double posZ, float par1)
    {
        if (!(tileEntity instanceof TileEntityRiftMachineSupport))
            return;
        TileEntityRiftMachineSupport tileEntityRiftMachinesupport = (TileEntityRiftMachineSupport) tileEntity;

        ForgeDirection direction = ForgeDirection.SOUTH;
        if (tileEntityRiftMachinesupport.getWorldObj() != null)
        {
            direction = ForgeDirection.getOrientation(tileEntityRiftMachinesupport.getBlockMetadata());
        }

        float scale = .5F;
        GL11.glPushMatrix();      
        GL11.glTranslated(posX + 0.5, posY, posZ + .5);
        short angle = 0;
        

        if (direction != null)
        {           
            if (direction == ForgeDirection.SOUTH)
            {
                angle = 90;                
            }
            else if (direction == ForgeDirection.NORTH)
            {
                angle = -90;                
            }
            else if (direction == ForgeDirection.WEST)
            {
                angle = 0;        
            }
            else if (direction == ForgeDirection.EAST)
            {
                angle = 180;
            }
        }
        GL11.glRotatef(angle, 0F, 1F, 0F);
        GL11.glScalef(scale, scale, scale);
        FMLClientHandler.instance().getClient().getTextureManager().bindTexture(Textures.MODEL_RIFTMACHINE_SUPPORT);
            GL11.glPushMatrix();
                support.renderAll();
            GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
