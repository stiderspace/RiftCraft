package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemCopperWire extends ItemRC 
{
    public ItemCopperWire() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_COPPERWIRE);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A piece of copper wire.", entityPlayer);
        }
        return ItemStack;

    }
}
