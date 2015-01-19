package spaceCoder.riftcraft.init;

import net.minecraft.block.Block;
import spaceCoder.riftcraft.block.BlockBlackHoleExtractor;
import spaceCoder.riftcraft.block.BlockContainedBlackHole;
import spaceCoder.riftcraft.block.BlockContainedRift;
import spaceCoder.riftcraft.block.BlockCrystalOre;
import spaceCoder.riftcraft.block.BlockDwarfStarAlloy;
import spaceCoder.riftcraft.block.BlockEnergyConverter;
import spaceCoder.riftcraft.block.BlockEnergyHub;
import spaceCoder.riftcraft.block.BlockHellfireOre;
import spaceCoder.riftcraft.block.BlockRift;
import spaceCoder.riftcraft.block.BlockRiftMachine;
import spaceCoder.riftcraft.block.BlockRiftMachineSupport;
import spaceCoder.riftcraft.block.BlockSubzeroFire;
import spaceCoder.riftcraft.block.BlockTemporalChest;
import spaceCoder.riftcraft.block.BlockWarpedMatter;
import spaceCoder.riftcraft.block.dimension.BlockSubzeroCrystalOre;
import spaceCoder.riftcraft.block.dimension.BlockSubzeroIce;
import spaceCoder.riftcraft.block.dimension.BlockSubzeroMatter;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Declare the blocks
	public static Block WarpedMatter;
	public static Block Rift;
    public static Block Energyhub;
    public static Block EnergyConverter;
    public static Block RiftMachine;
    public static Block ContainedRift;
    public static Block ContainedBlackHole;
    public static Block TemperalChest;
    public static Block BlackHoleExtractor;
    public static Block RiftMachineSupport;
    public static Block DwarfStarAlloy;
    
    public static Block CrystalOre;
    
    public static Block HellfireOre;
    
    public static Block SubzeroMatter;
    public static Block SubzeroIce;
    public static Block SubzeroCrystalOre;
    public static Block SubzeroFire;
    
    public static void init()
    {
        //Add the blocks
        WarpedMatter            = new BlockWarpedMatter();
        Rift                    = new BlockRift();
        Energyhub               = new BlockEnergyHub();
        EnergyConverter         = new BlockEnergyConverter();
        ContainedRift           = new BlockContainedRift();
        ContainedBlackHole      = new BlockContainedBlackHole();
        TemperalChest           = new BlockTemporalChest();
        BlackHoleExtractor      = new BlockBlackHoleExtractor();
        DwarfStarAlloy          = new BlockDwarfStarAlloy();
        
        CrystalOre				= new BlockCrystalOre();
        HellfireOre				= new BlockHellfireOre();
        
        SubzeroMatter			= new BlockSubzeroMatter();
        SubzeroIce				= new BlockSubzeroIce();
        SubzeroCrystalOre		= new BlockSubzeroCrystalOre();
        SubzeroFire				= new BlockSubzeroFire();
        
        //Rift Machine
        RiftMachine             = new BlockRiftMachine();
        RiftMachineSupport      = new BlockRiftMachineSupport();
        
        
        //Register the blocks
        RegisterHelper.registerBlock(WarpedMatter);
        RegisterHelper.registerBlock(Rift);
        RegisterHelper.registerBlock(Energyhub);
        RegisterHelper.registerBlock(EnergyConverter);
        RegisterHelper.registerBlock(RiftMachine);
        RegisterHelper.registerBlock(RiftMachineSupport);
        RegisterHelper.registerBlock(ContainedRift);
        RegisterHelper.registerBlock(ContainedBlackHole);
        RegisterHelper.registerBlock(TemperalChest);
        RegisterHelper.registerBlock(BlackHoleExtractor);
        RegisterHelper.registerBlock(DwarfStarAlloy);
        
        RegisterHelper.registerBlock(CrystalOre);
        RegisterHelper.registerBlock(HellfireOre);
        
        RegisterHelper.registerBlock(SubzeroMatter);
        RegisterHelper.registerBlock(SubzeroIce);
        RegisterHelper.registerBlock(SubzeroCrystalOre);
        RegisterHelper.registerBlock(SubzeroFire);
    }
}

