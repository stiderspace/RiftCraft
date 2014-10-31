package spaceCoder.riftcraft.lib.utility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHelper {
    public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
           int id = EntityRegistry.findGlobalUniqueEntityId();

           EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
           EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColor, fgEggColor));
        }
}
