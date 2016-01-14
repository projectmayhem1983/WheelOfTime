package projectmayhem1983.wheeloftime.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAngelta extends Item {

	public ItemAngelta() {
		this.setMaxStackSize(1);
		this.setFull3D();
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		player.capabilities.allowFlying = !player.capabilities.allowFlying;
		player.capabilities.isFlying = !player.capabilities.isFlying;
		return item;
	}
}
