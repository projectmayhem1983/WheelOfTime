package projectmayhem1983.wheeloftime.entities.creatures.Torm;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityTorm {
	public static void WheelOfTime(){
	registerEntity();
}
public static void registerEntity(){
	
	createEntity(EntityTormMob.class,"Torm Mob",0xFFFFFF, 0x000000);
	
}

public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
	int randomId = EntityRegistry.findGlobalUniqueEntityId();
	EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
	EntityRegistry.registerModEntity(entityClass, entityName, randomId,"wot", 64, 1, true);
	EntityRegistry.addSpawn(entityClass, 5, 1, 2, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.desert,BiomeGenBase.savanna, BiomeGenBase.plains,BiomeGenBase.taiga});
	
	
	createEgg(randomId, solidColor, spotColor);
	
}

private static void createEgg(int randomId, int solidColor, int spotColor){
	EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
}
}
