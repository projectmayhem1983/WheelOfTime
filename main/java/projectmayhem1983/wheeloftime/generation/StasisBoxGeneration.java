package projectmayhem1983.wheeloftime.generation;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import projectmayhem1983.wheeloftime.init.WheelOfTimeBlocks;

public class StasisBoxGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX, chunkZ);
			break;
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		case 1:
			generateEnd(world, random, chunkX, chunkZ);
			break;
		}
	}

	public void generateNether(World world, Random rand, int x, int z) {
		generateBox(WheelOfTimeBlocks.blockStasisbox, world, rand, x, z, 0, 1, 1, 0, 30, Blocks.netherrack);
	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		generateBox(WheelOfTimeBlocks.blockStasisbox, world, rand, x, z, 0, 1, 1, 0, 30, Blocks.stone);
	}

	public void generateEnd(World world, Random rand, int x, int z) {
		generateBox(WheelOfTimeBlocks.blockStasisbox, world, rand, x, z, 0, 1, 1, 0, 30, Blocks.end_stone);
	}

	public void generateBox(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize,
			int maxVienSize, int chance, int minY, int maxY, Block generateIn) {
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);

		}
	}
}
