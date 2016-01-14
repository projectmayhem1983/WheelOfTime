package projectmayhem1983.wheeloftime.item;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemFountainta extends Item {
	public ItemFountainta() {
		this.setMaxStackSize(1);
		this.setFull3D();
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {

		if (!world.isRemote) {
			player.posY++;
			MovingObjectPosition coord = player.rayTrace(500, 1);
			if (coord != null) {
				int height = 0;
				int length = 0;
				int depth = 0;
				coord.blockX -= length;
				coord.blockZ -= depth;

				world.setBlock((int) coord.blockX, (int) coord.blockY, (int) coord.blockZ, Blocks.flowing_water);
							}
		}
		return item;
	}
}
