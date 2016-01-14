package projectmayhem1983.wheeloftime.crops;

import net.minecraft.init.Blocks;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.init.WheelOfTimeBlocks;

public class ItemIcePepper extends RecipeItemSeedFood {

	public ItemIcePepper() {
		super(1, 0.3F, WheelOfTimeBlocks.blockIcePeppers, Blocks.farmland);
		this.setFull3D();
		this.setMaxStackSize(64);

	}
}