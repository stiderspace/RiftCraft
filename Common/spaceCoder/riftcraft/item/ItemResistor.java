package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemResistor extends ItemRC 
{
    public ItemResistor() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_RESISTOR);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A basic resistor for lowering currents.", entityPlayer);
        }
        return ItemStack;

    }
}
