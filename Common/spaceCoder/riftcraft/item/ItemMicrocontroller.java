package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemMicrocontroller extends ItemRC 
{
    public ItemMicrocontroller() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_MICROCONTROLLER);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A controller for bigger processes in machines.", entityPlayer);
        }
        return ItemStack;

    }
}
