package projectmayhem1983.wheeloftime.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBlightdirt extends Block{

	public BlockBlightdirt(Material material) {
		super(material);
		this.setHarvestLevel("shovel", 1);
		this.setHardness(2.0F);
	}

}
