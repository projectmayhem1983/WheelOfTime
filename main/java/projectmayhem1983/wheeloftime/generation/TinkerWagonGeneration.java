package projectmayhem1983.wheeloftime.generation;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAielMob;
import projectmayhem1983.wheeloftime.structures.tinkerwagon;

public class TinkerWagonGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateOverworld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	public void generateNether(World world, Random rand, int x, int z) {

	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		generateStructure(world, rand, x, z, 1, 200);
	}

	public void generateEnd(World world, Random rand, int x, int z) {

	}

	public void generateStructure(World world, Random random, int chunkX, int chunkZ, int chance, int height) {
		tinkerwagon gen = new tinkerwagon();
		int spawnchance = random.nextInt(100);
		for(int x = 0; x < 1; x++);
			int i = chunkX + random.nextInt(16);
			int k = chunkZ + random.nextInt(16);
			int j = world.getHeightValue(i, k);
			if (spawnchance < 2){
				gen.generate(world, random, i, j, k);
			
		}
	}

}
