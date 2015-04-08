package spaceCoder.riftcraft.item;

import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlueCrystal extends ItemRC 
{
    public ItemBlueCrystal() 
    {
        super();
        this.setUnlocalizedName(ItemNames.ITEMNAME_BLUECRYSTAL);
    }
    
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("A pretty and rare crystal. I wonder where this is for?", entityPlayer);
        }
        return ItemStack;

    }
}
