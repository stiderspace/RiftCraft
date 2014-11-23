package spaceCoder.riftcraft.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityContainedBlackHole extends TileEntity
{

    public int rotation;
    public int Energy;
    
    public TileEntityContainedBlackHole()
    {
        rotation = 0;
        Energy = 0;
    }
    // update tile
    public void updateEntity()
    {
        if(rotation > -355)
        {
            rotation = rotation - 5 ;
        }
        else
        {
            rotation = 0;
        }
        
        //Energy++;
        //LogHelper.info(rotation);
    }
    
    
    // Reading from the tag
    
    public void readFromNBT(NBTTagCompound tag) 
    { 
       
      
        Energy = tag.getInteger("Energy");
        rotation = tag.getInteger("rotation");
        
        super.readFromNBT(tag);     
    } 
      
      
    // Writing to the tag
       
    public void writeToNBT(NBTTagCompound tag) 
    { 
        tag.setInteger("Energy", Energy);
        tag.setInteger("rotation", rotation);
        
        super.writeToNBT(tag); 
    } 
    
    // Tells the game that the tile can update
    
    @Override
    public boolean canUpdate()
    {
         return true;
    }
    
    // Used for reading packets
    
    @Override
    public Packet getDescriptionPacket() 
    {
         NBTTagCompound tag = new NBTTagCompound();

         writeToNBT(tag);

         return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, tag);
     }
    
    @Override
    public void onDataPacket(NetworkManager networkManager, S35PacketUpdateTileEntity packet)
    {   
        this.readFromNBT(packet.func_148857_g());
    }

}
