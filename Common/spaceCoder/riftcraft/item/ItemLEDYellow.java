package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemLEDYellow extends ItemRC 
{
    public ItemLEDYellow() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_LEDYELLOW);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A yellow colored LED.", entityPlayer);
        }
        return ItemStack;

    }
}
