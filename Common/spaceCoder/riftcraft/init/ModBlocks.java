package spaceCoder.riftcraft.init;

import net.minecraft.block.Block;
import spaceCoder.riftcraft.block.BlockBlackHoleExtractor;
import spaceCoder.riftcraft.block.BlockContainedBlackHole;
import spaceCoder.riftcraft.block.BlockContainedRift;
import spaceCoder.riftcraft.block.BlockEnergyConverter;
import spaceCoder.riftcraft.block.BlockEnergyHub;
import spaceCoder.riftcraft.block.BlockRift;
import spaceCoder.riftcraft.block.BlockRiftMachine;
import spaceCoder.riftcraft.block.BlockRiftMachineSuport;
import spaceCoder.riftcraft.block.BlockTemperalChest;
import spaceCoder.riftcraft.block.BlockWarpedBlock;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Declare the blocks
	public static Block WarpedBlock;
	public static Block Rift;
    public static Block Energyhub;
    public static Block EnergyConverter;
    public static Block RiftMachine;
    public static Block ContainedRift;
    public static Block ContainedBlackHole;
    public static Block TemperalChest;
    public static Block BlackHoleExtractor;
    public static Block RiftMachineSuport;
    
    public static void init()
    {
        //Add the blocks
        WarpedBlock = new BlockWarpedBlock();
        Rift = new BlockRift();
        Energyhub = new BlockEnergyHub();
        EnergyConverter = new BlockEnergyConverter();
        ContainedRift = new BlockContainedRift();
        ContainedBlackHole = new BlockContainedBlackHole();
        TemperalChest = new BlockTemperalChest();
        BlackHoleExtractor = new BlockBlackHoleExtractor();
        
        //Rift Machine
        RiftMachine = new BlockRiftMachine();
        RiftMachineSuport = new BlockRiftMachineSuport();
        
        
        //Register the blocks
        RegisterHelper.registerBlock(WarpedBlock);
        RegisterHelper.registerBlock(Rift);
        RegisterHelper.registerBlock(Energyhub);
        RegisterHelper.registerBlock(EnergyConverter);
        RegisterHelper.registerBlock(RiftMachine);
        RegisterHelper.registerBlock(ContainedRift);
        RegisterHelper.registerBlock(ContainedBlackHole);
        RegisterHelper.registerBlock(TemperalChest);
        RegisterHelper.registerBlock(BlackHoleExtractor);
       
  
    }
}

