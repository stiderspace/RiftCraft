package spaceCoder.riftcraft.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import spaceCoder.riftcraft.lib.reference.BlockNames;
import spaceCoder.riftcraft.lib.reference.DimensionIds;

public class BlockRift extends BlockRC
{

    public BlockRift()
    {
        super(Material.portal);
        // this.setCreativeTab(Riftcraft.tabsRFC);
        this.setBlockName(BlockNames.BLOCKNAME_RIFT);
        this.setLightLevel(15.0F);

    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        //MinecraftServer Server = MinecraftServer.getServer();
        //EntityPlayerMP player = (EntityPlayerMP) entity;
        if (entity.ridingEntity == null && entity.riddenByEntity == null && !world.isRemote) {
            
            entity.travelToDimension(1);
            //player.mcServer.getConfigurationManager().transferPlayerToDimension(player, DimensionIds.SUBZERO, new TeleporterRift(Server.worldServerForDimension(DimensionIds.SUBZERO)));
            
        }else if(entity.dimension == 1){
            entity.travelToDimension(0);
            //player.mcServer.getConfigurationManager().transferPlayerToDimension(player, DimensionIds.SUBZERO, new TeleporterRift(Server.worldServerForDimension(DimensionIds.SUBZERO)));
        }
            
    }
    public void setBlockBoundsBasedOnState(IBlockAccess Access, int par2, int par3, int par4)
    {
        float f = 0.0625f;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0f, 1.0F);
    }

    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB aabb, List list, Entity entity)
    {

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0f, 1.0F);
    }

}
