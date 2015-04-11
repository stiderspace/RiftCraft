package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemProcessor extends ItemRC 
{
    public ItemProcessor() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_PROCESSOR);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A machine part that calculates all sorts of things to let everything work propperly.", entityPlayer);
        }
        return ItemStack;

    }
}
