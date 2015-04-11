package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemCapacitor2 extends ItemRC 
{
    public ItemCapacitor2() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_CAPACITOR2);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A basic capacitor to hold a current.", entityPlayer);
        }
        return ItemStack;

    }
}
