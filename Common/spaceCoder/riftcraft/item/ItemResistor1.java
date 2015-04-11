package spaceCoder.riftcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;

public class ItemResistor1 extends ItemRC 
{
    public ItemResistor1() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_RESISTOR1);
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
