package projectmayhem1983.wheeloftime.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemHeronSword extends ItemSword {

	public ItemHeronSword(ToolMaterial material) {
		super(material);
		this.setFull3D();
	}
public void onUpdate(ItemStack stack, World world, EntityPlayer player, int itemSlot, boolean isSelected) {
		if (!stack.isItemEnchanted()) {
			stack.addEnchantment(Enchantment.sharpness, 3);
			stack.addEnchantment(Enchantment.unbreaking, 3);
			super.onUpdate(stack, world, player, itemSlot, isSelected);
		}
	}
}