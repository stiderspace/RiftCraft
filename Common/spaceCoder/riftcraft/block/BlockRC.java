package spaceCoder.riftcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import spaceCoder.riftcraft.creativeTabs.CreativeTabRFC;
import spaceCoder.riftcraft.lib.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRC extends Block
{
    public BlockRC(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabRFC.RFC_TAB);
        this.setHardness(5F);
        this.setStepSound(soundTypeAnvil);
    }
    public BlockRC()
    {
        this(Material.iron);
    }
    
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //tile.modid:blockname.name
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
    

}
