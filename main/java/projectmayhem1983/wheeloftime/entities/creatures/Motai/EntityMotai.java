package projectmayhem1983.wheeloftime.entities.creatures.Motai;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityMotai {
	public static void WheelOfTime(){
		registerEntity();
	}
	public static void registerEntity(){
		
		createEntity(EntityMotaiMob.class,"Motai Mob",0xFFFFFF, 0x000000);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId,"wot", 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 10, 1, 3, EnumCreatureType.creature, BiomeGenBase.desert);
		
		createEgg(randomId, solidColor, spotColor);
		
	}

	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}
