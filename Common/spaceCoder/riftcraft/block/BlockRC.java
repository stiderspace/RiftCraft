package spaceCoder.riftcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import spaceCoder.riftcraft.creativeTabs.CreativeTabRFC;
import spaceCoder.riftcraft.init.ModBlocks;
import spaceCoder.riftcraft.lib.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRC extends BlockContainer

{
    private boolean RenderSides;
    public BlockRC(Material material)
    {
        super(material);
        this.setHardness(5F);
        this.setCreativeTab(CreativeTabRFC.RFC_TAB);
    }
    public BlockRC()
    {
        this(Material.iron);
        
    }
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
    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return null;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess iblock, int PosX, int PosY, int PosZ, int Side, boolean render)
    {
        Block block = iblock.getBlock(PosX, PosY, PosZ);

        if (this == ModBlocks.SubzeroIce)
        {
            if (iblock.getBlockMetadata(PosX, PosZ, PosY) != iblock.getBlockMetadata(PosX - Facing.offsetsXForSide[Side], PosZ - Facing.offsetsYForSide[Side], PosY - Facing.offsetsZForSide[Side]))
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
        }

        return !render && block == this ? false : super.shouldSideBeRendered(iblock, PosX, PosZ, PosY, Side);
    }


}
