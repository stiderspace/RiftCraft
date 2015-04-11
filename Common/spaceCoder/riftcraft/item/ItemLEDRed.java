package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemLEDRed extends ItemRC 
{
    public ItemLEDRed() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_LEDRED);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A red colored LED.", entityPlayer);
        }
        return ItemStack;

    }
}
