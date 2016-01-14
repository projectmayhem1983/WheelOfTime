package projectmayhem1983.wheeloftime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import projectmayhem1983.wheeloftime.WheelOfTime;

public class WheelOfTimeRecipes {

	public static void init(){
		
		
		//Recipes
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeBlocks.blockCuendillar), new Object[]{"CCC","COC","CCC",'C',WheelOfTimeItems.itemCuendillar,'O', Blocks.obsidian});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeItems.itemUnbrewedKaf), new Object[]{"KKK","KBK","KKK",'K',WheelOfTimeItems.itemKafbean, 'B', Items.water_bucket});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeTools.powerSword), new Object[]{" C "," C "," S ",'C',WheelOfTimeItems.itemPowerinfusedingot,'S',Items.stick});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeTools.powerPickaxe), new Object[]{"CCC"," S "," S ",'C',WheelOfTimeItems.itemPowerinfusedingot,'S',Items.stick});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeTools.powerAxe), new Object[]{"CC ","CS "," S ",'C',WheelOfTimeItems.itemPowerinfusedingot,'S',Items.stick});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeTools.powerShovel), new Object[]{" C "," S "," S ",'C',WheelOfTimeItems.itemPowerinfusedingot,'S',Items.stick});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeTools.powerHoe), new Object[]{"CC "," S "," S ",'C',WheelOfTimeItems.itemPowerinfusedingot,'S',Items.stick});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeItems.itemSunburst), new Object[]{" G ","GGG"," G ",'G',Items.gold_nugget});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeItems.itemTabard), new Object[]{"W W","WWW","WWW",'W',Blocks.wool});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeArmor.aielgarbChest), new Object[]{"G G","GGG","GGG",'G',WheelOfTimeItems.itemGoathide});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeArmor.aielgarbBoots), new Object[]{"   ","G G","G G",'G',WheelOfTimeItems.itemGoathide});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeArmor.aielgarbLegs), new Object[]{"GGG","G G","G G",'G',WheelOfTimeItems.itemGoathide});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeArmor.aielgarbHelm), new Object[]{"   ","GGG","GIG",'G',WheelOfTimeItems.itemGoathide,'I', new ItemStack(Items.dye,1,0)});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeTools.spear), new Object[]{"  I"," S ","S  ",'I',Items.iron_ingot,'S',Items.stick});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeItems.itemAngelta), new Object[]{"DGD","DCD","PCP",'D',Blocks.diamond_block,'G',Blocks.gold_block,'C',WheelOfTimeBlocks.blockCuendillar,'P',WheelOfTimeItems.itemPowerdust});
				GameRegistry.addRecipe(new ItemStack(WheelOfTimeItems.itemFountainta), new Object[]{"LLL","CBC","PCP",'L', new ItemStack(Items.dye,1,4),'C',WheelOfTimeBlocks.blockCuendillar,'B',Items.water_bucket,'P',WheelOfTimeItems.itemPowerdust});
				
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeItems.itemCuendillar), new Object[]{WheelOfTimeItems.itemPowerdust,WheelOfTimeItems.itemPowerdust,WheelOfTimeItems.itemPowerdust});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeItems.itemWctabard), new Object[]{WheelOfTimeItems.itemTabard,WheelOfTimeItems.itemSunburst});
			    GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeArmor.whitecloakChest), new Object[]{Items.iron_chestplate,WheelOfTimeItems.itemWctabard});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeArmor.whitecloakBoots), new Object[]{Items.iron_boots,WheelOfTimeItems.itemSunburst});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeArmor.whitecloakLegs), new Object[]{Items.iron_leggings,WheelOfTimeItems.itemSunburst});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeArmor.whitecloakHelm), new Object[]{Items.iron_helmet,WheelOfTimeItems.itemSunburst});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeItems.itemGoatstew), new Object[]{Items.bowl,Items.potato,Items.carrot,WheelOfTimeItems.itemCookedgoat});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeItems.itemPepperbeefstew), new Object[]{Items.cooked_beef,Items.bowl,WheelOfTimeItems.itemIcePepper,Items.potato});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeItems.itemFishstew), new Object[]{Items.cooked_fished,Items.carrot,WheelOfTimeItems.itemIcePepper,Items.bowl});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeItems.itemUncookedmeatpie), new Object[]{Items.chicken,Items.beef,Items.porkchop,Items.potato,Items.wheat});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeItems.itemGrain), new Object[]{Items.wheat});
				GameRegistry.addShapelessRecipe(new ItemStack(WheelOfTimeItems.itemPorridge), new Object[]{Items.bowl,Items.sugar,WheelOfTimeItems.itemGrain,Items.milk_bucket});
				
				
				//Furnace  
				GameRegistry.addSmelting(WheelOfTimeItems.itemPowerdust, new ItemStack(WheelOfTimeItems.itemPowerinfusedingot), 5.0F);
				GameRegistry.addSmelting(WheelOfTimeItems.itemGoatmeat, new ItemStack(WheelOfTimeItems.itemCookedgoat), 1.0F);
				GameRegistry.addSmelting(WheelOfTimeItems.itemUnbrewedKaf, new ItemStack(WheelOfTimeItems.itemKaf), 3.0F);
				GameRegistry.addSmelting(WheelOfTimeItems.itemUncookedmeatpie, new ItemStack(WheelOfTimeItems.itemMeatpie), 3.0F);
	}
}
