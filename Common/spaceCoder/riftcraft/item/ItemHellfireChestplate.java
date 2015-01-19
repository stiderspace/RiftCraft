package spaceCoder.riftcraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import spaceCoder.riftcraft.creativeTabs.CreativeTabRFC;
import spaceCoder.riftcraft.lib.reference.ItemNames;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.reference.Textures;
import spaceCoder.riftcraft.lib.utility.ChatMessageHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHellfireChestplate extends ItemArmor 
{
    public ItemHellfireChestplate() 
    {
    	/** Stores the armor type: 0 is helmet, 1 is plate, 2 is legs and 3 is boots */
        super(Material.HellfireArmor, 0, 1);
        this.setUnlocalizedName(ItemNames.ITEMNAME_HELLFIRECHESTPLATE);
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabRFC.RFC_TAB);
    }
    
    /*
    public ItemStack onItemRightClick(ItemStack ItemStack, World World, EntityPlayer entityPlayer)
    {
        if (World.isRemote)
        {
            ChatMessageHelper.sendMessage("Why cant i put this on ??", entityPlayer);
        }
        return ItemStack;
    }
    */
    
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        return Textures.ENTITY_HELLFIRE_LAYER1;
    }
       
    //ItemRC Copy, omdat ik niet extends ItemRC en ItemArmor tegelijk kan doen. Ik heb geprobeerd om ItemArmorRC aan te maken, zonder succes.
    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //item.modid:item.name
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
