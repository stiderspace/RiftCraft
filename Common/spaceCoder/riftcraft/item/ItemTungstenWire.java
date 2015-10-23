package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemTungstenWire extends ItemRC 
{
    public ItemTungstenWire() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_TUNGSTENWIRE);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A piece of tungsten wire.", entityPlayer);
        }
        return ItemStack;

    }
}
