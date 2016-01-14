package projectmayhem1983.wheeloftime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.crops.ItemIcePepper;
import projectmayhem1983.wheeloftime.crops.ItemKafbean;
import projectmayhem1983.wheeloftime.item.ItemAngelta;
import projectmayhem1983.wheeloftime.item.ItemCuendillar;
import projectmayhem1983.wheeloftime.item.ItemFountainta;
import projectmayhem1983.wheeloftime.item.ItemGoathide;
import projectmayhem1983.wheeloftime.item.ItemGoatmeat;
import projectmayhem1983.wheeloftime.item.ItemGrain;
import projectmayhem1983.wheeloftime.item.ItemPowerdust;
import projectmayhem1983.wheeloftime.item.ItemPowerinfusedingot;
import projectmayhem1983.wheeloftime.item.ItemSunburst;
import projectmayhem1983.wheeloftime.item.ItemTabard;
import projectmayhem1983.wheeloftime.item.ItemUnbrewedKaf;
import projectmayhem1983.wheeloftime.item.ItemUncookedmeatpie;
import projectmayhem1983.wheeloftime.item.ItemWctabard;
import projectmayhem1983.wheeloftime.item.ItemWheeloftime;

public class WheelOfTimeItems {
	
	//Items
			public static Item itemCuendillar;
			public static Item itemKafbean;
			public static Item itemWheeloftime;
			public static Item itemPowerinfusedingot;
			public static Item itemPowerdust;
			public static Item itemAngelta;
			public static Item itemFountainta;
			public static Item itemSunburst;
			public static Item itemTabard;
			public static Item itemWctabard;
			public static Item itemGoathide;
			public static Item itemGoatmeat;
			public static Item itemUnbrewedKaf;
			public static Item itemUncookedmeatpie;
			public static Item itemGrain;
			
	//Food
			public static Item itemKaf;
			public static Item itemMotai;
			public static Item itemCookedgoat;
			public static Item itemGoatstew;
			public static Item itemIcePepper;
			public static Item itemPepperbeefstew;
			public static Item itemFishstew;
			public static Item itemMeatpie;
			public static Item itemPorridge;
			
			
			
		public static void init(){
			itemWheeloftime = new ItemWheeloftime().setUnlocalizedName("ItemWheeloftime").setTextureName("wot:itemwheeloftime");
			GameRegistry.registerItem(itemWheeloftime, itemWheeloftime.getUnlocalizedName().substring(5));
			
			itemCuendillar = new ItemCuendillar().setUnlocalizedName("ItemCuendillar").setTextureName("wot:itemcuendillar").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemCuendillar, itemCuendillar.getUnlocalizedName().substring(5));
		
		    itemPowerinfusedingot = new ItemPowerinfusedingot().setUnlocalizedName("ItemPowerinfusedingot").setTextureName("wot:itempowerinfusedingot").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemPowerinfusedingot, itemPowerinfusedingot.getUnlocalizedName().substring(5));
		    
		    itemPowerdust = new ItemPowerdust().setUnlocalizedName("ItemPowerdust").setTextureName("wot:itempowerdust").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemPowerdust, itemPowerdust.getUnlocalizedName().substring(5));
		    
		    itemAngelta = new ItemAngelta().setUnlocalizedName("ItemAngelta").setTextureName("wot:itemangelta").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemAngelta, itemAngelta.getUnlocalizedName().substring(5));
		    
		    itemFountainta = new ItemFountainta().setUnlocalizedName("ItemFountainta").setTextureName("wot:itemfountainta").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemFountainta, itemFountainta.getUnlocalizedName().substring(5));
		    
		    itemSunburst = new ItemSunburst().setUnlocalizedName("ItemSunburst").setTextureName("wot:itemsunburst").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemSunburst, itemSunburst.getUnlocalizedName().substring(5));
		    
		    itemTabard = new ItemTabard().setUnlocalizedName("ItemTabard").setTextureName("wot:itemtabard").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemTabard, itemTabard.getUnlocalizedName().substring(5));
		    
		    itemWctabard = new ItemWctabard().setUnlocalizedName("ItemWctabard").setTextureName("wot:itemwctabard").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemWctabard, itemWctabard.getUnlocalizedName().substring(5));
		    
		    itemGoathide = new ItemGoathide().setUnlocalizedName("ItemGoathide").setTextureName("wot:itemgoathide").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemGoathide, itemGoathide.getUnlocalizedName().substring(5));
		    
		    itemUnbrewedKaf = new ItemUnbrewedKaf().setUnlocalizedName("ItemUnbrewedKaf").setTextureName("wot:itemunbrewedkaf").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemUnbrewedKaf, itemUnbrewedKaf.getUnlocalizedName().substring(5));
		    
		    itemUncookedmeatpie = new ItemUncookedmeatpie().setUnlocalizedName("ItemUncookedmeatpie").setTextureName("wot:itemuncookedmeatpie").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemUncookedmeatpie, itemUncookedmeatpie.getUnlocalizedName().substring(5));
		    
		    itemGrain = new ItemGrain().setUnlocalizedName("ItemGrain").setTextureName("wot:itemgrain").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemGrain, itemGrain.getUnlocalizedName().substring(5));
		    
		
		    
	//Food - Heal (half value of X), saturation , Feed to tamed wolves
		    itemKaf = new ItemFood(6, 0.6F , false).setUnlocalizedName("ItemKaf").setTextureName("wot:itemkaf").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemKaf, itemKaf.getUnlocalizedName().substring(5));
		    
		    itemMotai = new ItemFood(4, 0.3F, false).setUnlocalizedName("ItemMotai").setTextureName("wot:itemmotai").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemMotai, itemMotai.getUnlocalizedName().substring(5));
		    
		    itemCookedgoat = new ItemFood(6, 0.5F, true).setUnlocalizedName("ItemCookedgoat").setTextureName("wot:itemcookedgoat").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemCookedgoat, itemCookedgoat.getUnlocalizedName().substring(5));
		    
		    itemGoatstew = new ItemFood(10, 1.0F, false).setUnlocalizedName("ItemGoatstew").setTextureName("wot:itemgoatstew").setCreativeTab(WheelOfTime.tabWheelOfTime).setMaxStackSize(64).setFull3D();
		    GameRegistry.registerItem(itemGoatstew, itemGoatstew.getUnlocalizedName().substring(5));
		    
		    itemIcePepper = new ItemIcePepper().setUnlocalizedName("ItemIcePepper").setTextureName("wot:itemicepepper").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemIcePepper, itemIcePepper.getUnlocalizedName().substring(5));
		    
		    itemKafbean = new ItemKafbean().setUnlocalizedName("ItemKafbean").setTextureName("wot:itemkafbean").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemKafbean, itemKafbean.getUnlocalizedName().substring(5));
		    
		    itemPepperbeefstew = new ItemFood(12, 1.2F, false).setUnlocalizedName("ItemPepperbeefstew").setTextureName("wot:itempepperedbeefstew").setCreativeTab(WheelOfTime.tabWheelOfTime).setMaxStackSize(64).setFull3D();
		    GameRegistry.registerItem(itemPepperbeefstew, itemPepperbeefstew.getUnlocalizedName().substring(5));
		    
		    itemFishstew = new ItemFood(12, 1.0F, false).setUnlocalizedName("ItemFishstew").setTextureName("wot:itemfishstew").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemFishstew, itemFishstew.getUnlocalizedName().substring(5));
		    
		    itemMeatpie = new ItemFood(18, 2.0F, false).setUnlocalizedName("ItemMeatpie").setTextureName("wot:itemmeatpie").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemMeatpie, itemMeatpie.getUnlocalizedName().substring(5));
		    
		    itemPorridge = new ItemFood(8, 0.5F, false).setUnlocalizedName("ItemPorridge").setTextureName("wot:itemporridge").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemPorridge, itemPorridge.getUnlocalizedName().substring(5));
		    
		    itemGoatmeat = new ItemFood(2, 0.1F, true).setUnlocalizedName("ItemGoatmeat").setTextureName("wot:itemgoatmeat").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(itemGoatmeat, itemGoatmeat.getUnlocalizedName().substring(5));
		    
		}

		
}
