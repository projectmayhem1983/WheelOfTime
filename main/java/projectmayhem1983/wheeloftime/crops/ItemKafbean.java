package projectmayhem1983.wheeloftime.crops;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import projectmayhem1983.wheeloftime.init.WheelOfTimeBlocks;

public class ItemKafbean extends RecipeItemSeedFood {
	
	public ItemKafbean() {
		super(1, 0.3F, WheelOfTimeBlocks.blockKafBush, Blocks.farmland);
		this.setFull3D();
		this.setMaxStackSize(64);
	}
}
