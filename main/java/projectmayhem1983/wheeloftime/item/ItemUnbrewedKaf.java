package projectmayhem1983.wheeloftime.item;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemUnbrewedKaf extends Item{
	public ItemUnbrewedKaf(){
		this.setFull3D();
		this.setMaxStackSize(64);
		this.setContainerItem(Items.bucket);
	}

}
