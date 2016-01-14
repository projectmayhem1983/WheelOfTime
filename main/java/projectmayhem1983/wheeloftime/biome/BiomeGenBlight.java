package projectmayhem1983.wheeloftime.biome;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.EntityDarkhound;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraal;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrolloc;
import projectmayhem1983.wheeloftime.init.WheelOfTimeBlocks;

public class BiomeGenBlight extends BiomeGenBase{
	
	public BiomeGenBlight(int id){
		super(id);
		
		this.theBiomeDecorator.deadBushPerChunk = 10;
		this.spawnableMonsterList.add(new SpawnListEntry(EntityTrolloc.class, 5,2,10));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityDarkhound.class,5,2,10));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityMyrddraal.class,5,2,10));
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = WheelOfTimeBlocks.blockBlight;
		this.fillerBlock = WheelOfTimeBlocks.blockBlightdirt;
		this.waterColorMultiplier = 0x963D24;
		
	}
	 
}
