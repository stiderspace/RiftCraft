package spaceCoder.riftcraft.render.Inventory;

import org.lwjgl.opengl.GL11;

import spaceCoder.riftcraft.lib.reference.Models;
import spaceCoder.riftcraft.lib.reference.Textures;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderItemRiftMachineSupport implements IItemRenderer
{
    private IModelCustom model;
    
    public RenderItemRiftMachineSupport()
    {
        model = AdvancedModelLoader.loadModel(Models.RIFTMACHINESUPPORT);
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType itemRenderType, ItemStack itemStack, Object... data)
    {
        switch (itemRenderType)
        {
            case ENTITY:
            {
                render(0.0F, 0F, 0F, 0.25F);
               
                return;
            }
            
            case EQUIPPED:
            {
                render(0.0F, 0F, 0F, 0.15F);
                
                return;
            }
           
            case EQUIPPED_FIRST_PERSON:
            {
                render(0.0F, 0.0F, 0F, 0.25F);
               
                return;
            }
           
            case INVENTORY:
            {
                render(0.0F, -4F, 0F, 0.15F);
                
                return;
            }
            
            default:
            {
                return;
            }
        }
        
    }
        private void render(float xPos, float yPos, float zPos, float scale)
        {
            GL11.glPushMatrix();
                GL11.glScalef(scale, scale, scale);
                GL11.glTranslatef(xPos, yPos, zPos);
                GL11.glRotatef(90, 0, 1, 0);
                FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.MODEL_RIFTMACHINE_SUPPORT);
                model.renderAll();
            GL11.glPopMatrix();
        }
}
