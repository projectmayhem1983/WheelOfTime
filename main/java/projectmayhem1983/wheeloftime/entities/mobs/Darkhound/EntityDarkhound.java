package projectmayhem1983.wheeloftime.entities.mobs.Darkhound;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityDarkhound {
	public static void WheelOfTime(){
		registerEntity();
	}
	public static void registerEntity(){
		
		createEntity(EntityDarkhoundMob.class,"Darkhound Mob",0xFFFFFF, 0x000000);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId,"wot", 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 100, 3, 5, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.beach, BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,
				BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.extremeHills,BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.forestHills,BiomeGenBase.jungle,BiomeGenBase.mesa,BiomeGenBase.taiga,BiomeGenBase.swampland,
				BiomeGenBase.roofedForest,BiomeGenBase.plains});
		
		createEgg(randomId, solidColor, spotColor);
		
	}

	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}

}
