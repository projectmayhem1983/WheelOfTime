package projectmayhem1983.wheeloftime.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void WheelOfTime(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeBlight;
		public static void initializeBiome(){
			
			biomeBlight = new BiomeGenBlight(137).setBiomeName("Blight").setTemperatureRainfall(2.0F, 0.0F);
		}
		
		public static void registerBiome(){
			BiomeDictionary.registerBiomeType(biomeBlight, Type.SWAMP);
			BiomeManager.addSpawnBiome(biomeBlight);
			
			
		}
	}
