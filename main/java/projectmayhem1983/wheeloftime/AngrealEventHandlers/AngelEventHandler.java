package projectmayhem1983.wheeloftime.AngrealEventHandlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.init.WheelOfTimeItems;

public class AngelEventHandler {
	@SubscribeEvent
	public void pTickEvent(PlayerTickEvent event) {
		if (event.player != null) {
			if (event.player instanceof EntityPlayer) {
				EntityPlayer player = ((EntityPlayer) event.player);
				if (player.capabilities.isCreativeMode)
					return; // this prevents from disabling fly to people in
							// creative
				player.capabilities.isFlying = player.capabilities.allowFlying = player.inventory
						.hasItem(WheelOfTimeItems.itemAngelta);
			}
		}
	}
}
