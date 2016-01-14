package projectmayhem1983.wheeloftime.init;
//Special thanks to https://github.com/Choonster/TestMod2/commit/bf2e2982b0f9c98c0225d5281641985b14efea5b for the coding here
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class WheelOfTimeStasisBox {
	
	
	 		public static final ChestGenHooks RIGHT_CLICK_LOOT_BLOCK = ChestGenHooks.getInfo("wot:Stasis Box");
	 		 
	 		 	public static void initLoot() {
	 		 		RIGHT_CLICK_LOOT_BLOCK.setMin(5);
	 		 		RIGHT_CLICK_LOOT_BLOCK.setMax(20);
	 		 
	 		 		// new WeightedRandomChestContent(item, minAmount, maxAmount, weight)
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.fishing_rod), 1, 1, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.map), 1, 1, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeItems.itemFountainta), 1, 1, 1));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond), 1, 3, 5));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.emerald), 1, 3, 5));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.apple), 1, 5, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.arrow), 1, 15, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.blaze_rod), 1, 1, 5));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.book), 1, 15, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.clock), 1, 1, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.compass), 1, 1, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond_axe), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond_sword), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond_hoe), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond_pickaxe), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond_boots), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond_chestplate), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond_helmet), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.diamond_leggings), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.experience_bottle), 1, 20, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Blocks.daylight_detector), 1, 1, 20));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeTools.powerAxe), 1, 1, 10));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeTools.heronsword), 1, 1, 2));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.fireworks), 1, 20, 20));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeTools.ashandarei), 1, 1, 1));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.golden_carrot), 1, 5, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Items.golden_apple), 1, 5, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(Blocks.diamond_block), 1, 1, 1));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeItems.itemAngelta), 1, 1, 1));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeItems.itemFountainta), 1, 1, 1));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeBlocks.blockCuendillar), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeArmor.whitecloakChest), 1, 1, 3));
	 		 		RIGHT_CLICK_LOOT_BLOCK.addItem(new WeightedRandomChestContent(new ItemStack(WheelOfTimeTools.powerSword), 1, 1, 3));
	 		 		

	 		 		
	 		 		
	 		 	}
	 		 }