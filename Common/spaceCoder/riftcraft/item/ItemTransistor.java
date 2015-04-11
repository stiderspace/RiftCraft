package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemTransistor extends ItemRC 
{
    public ItemTransistor() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_TRANSISTOR);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A standard transistor.", entityPlayer);
        }
        return ItemStack;

    }
}
