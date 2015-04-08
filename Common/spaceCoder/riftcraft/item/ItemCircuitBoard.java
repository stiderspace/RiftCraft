package spaceCoder.riftcraft.item;

import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCircuitBoard extends ItemRC 
{
    public ItemCircuitBoard() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_CIRCUITBOARD);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("An empty circuitboard to build electronic circuits for machines.", entityPlayer);
        }
        return ItemStack;

    }
}
