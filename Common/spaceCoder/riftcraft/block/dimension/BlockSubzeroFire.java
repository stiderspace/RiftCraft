package spaceCoder.riftcraft.block.dimension;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFire;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import spaceCoder.riftcraft.block.BlockRC;
import spaceCoder.riftcraft.creativeTabs.CreativeTabRFC;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.Textures;

public class BlockSubzeroFire extends BlockFire
{
	private IIcon[] fire;
    private String unlocalizedName;
    protected String textureName;
	
	public BlockSubzeroFire()
	{
		super();
		this.setBlockName(BlockNames.BLOCKNAME_SUBZEROFIRE);
		this.setCreativeTab(CreativeTabRFC.RFC_TAB);
		
	}
	
    @SideOnly(Side.CLIENT)
    protected String getTextureName()
    {
        return this.textureName == null ? "MISSING_ICON_BLOCK_" + getIdFromBlock(this) + "_" + this.unlocalizedName : this.textureName;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        this.fire = new IIcon[] {icon.registerIcon(Textures.TEXTURE_SUBZEROFIRE), icon.registerIcon(Textures.TEXTURE_SUBZEROFIRE)};
    }

    @SideOnly(Side.CLIENT)
    public IIcon getFireIcon(int par1)
    {
        return this.fire[par1];
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return this.fire[0];
    }
	
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 3;
    }
    
    public int tickRate(World p_149738_1_)
    {
        return 30;
    }
    
    public boolean canCatchFire(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        return world.getBlock(x, y, z).isFlammable(world, x, y, z, face);
    }
    
    
}
