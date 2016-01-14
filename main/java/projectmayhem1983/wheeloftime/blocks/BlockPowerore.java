package projectmayhem1983.wheeloftime.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.init.WheelOfTimeItems;

public class BlockPowerore extends Block {

	public BlockPowerore(Material material) {
		super(material);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(4.0F);
	}

		@Override
		public Item getItemDropped(int metadata, Random ran, int fortune){
			return WheelOfTimeItems.itemPowerdust;
		}
		
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(3);
	}
}
