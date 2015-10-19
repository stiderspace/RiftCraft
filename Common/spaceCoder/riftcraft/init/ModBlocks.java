package spaceCoder.riftcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import spaceCoder.riftcraft.block.BlockBlackHoleExtractor;
import spaceCoder.riftcraft.block.BlockContainedBlackHole;
import spaceCoder.riftcraft.block.BlockContainedRift;
import spaceCoder.riftcraft.block.BlockCrystal;
import spaceCoder.riftcraft.block.BlockDarkMatter;
import spaceCoder.riftcraft.block.BlockDwarfStarAlloy;
import spaceCoder.riftcraft.block.BlockEnergyConverter;
import spaceCoder.riftcraft.block.BlockEnergyHub;
import spaceCoder.riftcraft.block.BlockHellfire;
import spaceCoder.riftcraft.block.BlockRift;
import spaceCoder.riftcraft.block.BlockRiftMachine;
import spaceCoder.riftcraft.block.BlockRiftMachineSupport;
import spaceCoder.riftcraft.block.BlockTemporalChest;
import spaceCoder.riftcraft.block.BlockUnstableMatter;
import spaceCoder.riftcraft.block.BlockWarpedMatter;
import spaceCoder.riftcraft.block.dimension.BlockSubzeroCrystalOre;
import spaceCoder.riftcraft.block.dimension.BlockSubzeroFire;
import spaceCoder.riftcraft.block.dimension.BlockSubzeroIce;
import spaceCoder.riftcraft.block.dimension.BlockSubzeroMatter;
import spaceCoder.riftcraft.block.ores.BlockAluminiumOre;
import spaceCoder.riftcraft.block.ores.BlockCopperOre;
import spaceCoder.riftcraft.block.ores.BlockCrystalOre;
import spaceCoder.riftcraft.block.ores.BlockHellfireOre;
import spaceCoder.riftcraft.block.ores.BlockLeadOre;
import spaceCoder.riftcraft.block.ores.BlockPlatinumOre;
import spaceCoder.riftcraft.block.ores.BlockSilverOre;
import spaceCoder.riftcraft.block.ores.BlockTinOre;
import spaceCoder.riftcraft.block.ores.BlockTitaniumOre;
import spaceCoder.riftcraft.block.ores.BlockTunstenOre;
import spaceCoder.riftcraft.block.ores.BlockUraniumOre;
import spaceCoder.riftcraft.lib.reference.Reference;
import spaceCoder.riftcraft.lib.utility.RegisterHelper;

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
    public static Block DarkMatter;
    public static Block UnstableMatter;
    
    public static Block CrystalOre;
    public static Block CrystalBlock;
    
    public static Block HellfireOre;
    public static Block HellfireBlock;
    
    public static Block SubzeroMatter;
    public static Block SubzeroIce;
    public static Block SubzeroCrystalOre;
    public static Block SubzeroFire;
    
    //Ores
    public static Block CopperOre;
    public static Block AluminiumOre;
    public static Block TinOre;
    public static Block PlatinumOre;
    public static Block LeadOre;
    public static Block SilverOre;
    public static Block TunstenOre;
    public static Block UraniumOre;
    public static Block TitaniumOre;
    
    
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
        DarkMatter				= new BlockDarkMatter();
        UnstableMatter			= new BlockUnstableMatter();
        
        CrystalOre				= new BlockCrystalOre();
        CrystalBlock			= new BlockCrystal();
        HellfireOre				= new BlockHellfireOre();
        HellfireBlock			= new BlockHellfire();
        
        SubzeroMatter			= new BlockSubzeroMatter();
        SubzeroIce				= new BlockSubzeroIce();
        SubzeroCrystalOre		= new BlockSubzeroCrystalOre();
        SubzeroFire				= new BlockSubzeroFire();
        
        //Rift Machine
        RiftMachine             = new BlockRiftMachine();
        RiftMachineSupport      = new BlockRiftMachineSupport();
        
        //Ores
        CopperOre               = new BlockCopperOre();
        AluminiumOre            = new BlockAluminiumOre();
        TinOre                  = new BlockTinOre();
        PlatinumOre             = new BlockPlatinumOre();
        LeadOre                 = new BlockLeadOre();
        SilverOre               = new BlockSilverOre();
        TunstenOre              = new BlockTunstenOre();
        UraniumOre              = new BlockUraniumOre();
        TitaniumOre             = new BlockTitaniumOre();
        
        
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
        RegisterHelper.registerBlock(DarkMatter);
        RegisterHelper.registerBlock(UnstableMatter);
        
        RegisterHelper.registerBlock(CrystalOre);
        RegisterHelper.registerBlock(CrystalBlock);
        RegisterHelper.registerBlock(HellfireOre);
        RegisterHelper.registerBlock(HellfireBlock);
        
        RegisterHelper.registerBlock(SubzeroMatter);
        RegisterHelper.registerBlock(SubzeroIce);
        RegisterHelper.registerBlock(SubzeroCrystalOre);
        RegisterHelper.registerBlock(SubzeroFire);
        
        
        //Ores
        RegisterHelper.registerBlock(CopperOre);
        RegisterHelper.registerBlock(AluminiumOre);
        RegisterHelper.registerBlock(TinOre);
        RegisterHelper.registerBlock(PlatinumOre);
        RegisterHelper.registerBlock(LeadOre);
        RegisterHelper.registerBlock(SilverOre);
        RegisterHelper.registerBlock(TunstenOre);
        RegisterHelper.registerBlock(UraniumOre);
        RegisterHelper.registerBlock(TitaniumOre); 
    }
}

