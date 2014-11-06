package spaceCoder.riftcraft.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import spaceCoder.riftcraft.lib.reference.Reference;

public class CreativeTabRFC
{
    public static final CreativeTabs RFC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.apple;
        }
        
    };

}
