package spaceCoder.riftcraft.item;

import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHellfireHelmet extends ItemRC 
{
    public ItemHellfireHelmet() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_HELLFIREHELMET);
        this.setMaxStackSize(1);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("Why cant i put this on ??", entityPlayer);
        }
        return ItemStack;

    }
}
