package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemLEDGreen extends ItemRC 
{
    public ItemLEDGreen() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_LEDGREEN);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A green colored LED.", entityPlayer);
        }
        return ItemStack;

    }
}
