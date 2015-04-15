package spaceCoder.riftcraft.item;

import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCopperCoil extends ItemRC 
{
    public ItemCopperCoil() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_COPPERCOIL);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A copper coil to create a magnetic field when electricity flows through it.", entityPlayer);
        }
        return ItemStack;

    }
}
