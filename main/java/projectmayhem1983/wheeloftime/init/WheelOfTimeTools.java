package projectmayhem1983.wheeloftime.init;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.item.ItemPowerAxe;
import projectmayhem1983.wheeloftime.item.ItemPowerHoe;
import projectmayhem1983.wheeloftime.item.ItemPowerPickaxe;
import projectmayhem1983.wheeloftime.item.ItemPowerShovel;
import projectmayhem1983.wheeloftime.item.ItemPowerSword;
import projectmayhem1983.wheeloftime.item.ItemRubyDagger;
import projectmayhem1983.wheeloftime.item.ItemSpear;
import projectmayhem1983.wheeloftime.item.ItemAshandarei;
import projectmayhem1983.wheeloftime.item.ItemHeronSword;
import projectmayhem1983.wheeloftime.item.ItemMahalleinir;

public class WheelOfTimeTools {

	// Tools
	public static Item powerPickaxe;
	public static Item powerAxe;
	public static Item powerShovel;
	public static Item powerHoe;

	// Weapons
	public static Item powerSword;
	public static Item spear;
	public static Item ashandarei;
	public static Item heronsword;
	public static Item mahalleinir;
	public static Item rubydagger;

	public static void init() {

		// Tools

		powerPickaxe = new ItemPowerPickaxe(WheelOfTime.powerToolMaterial).setUnlocalizedName("ItemPowerPickaxe")
				.setTextureName("wot:itemcuendillarpickaxe").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerPickaxe, powerPickaxe.getUnlocalizedName().substring(5));

		powerAxe = new ItemPowerAxe(WheelOfTime.powerToolMaterial).setUnlocalizedName("ItemPowerAxe")
				.setTextureName("wot:itemcuendillaraxe").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerAxe, powerAxe.getUnlocalizedName().substring(5));

		powerShovel = new ItemPowerShovel(WheelOfTime.powerToolMaterial).setUnlocalizedName("ItemPowerShovel")
				.setTextureName("wot:itemcuendillarshovel").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerShovel, powerShovel.getUnlocalizedName().substring(5));

		powerHoe = new ItemPowerHoe(WheelOfTime.powerToolMaterial).setUnlocalizedName("ItemPowerHoe")
				.setTextureName("wot:itemcuendillarhoe").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerHoe, powerHoe.getUnlocalizedName().substring(5));
		
		

		// Weapons

		powerSword = new ItemPowerSword(WheelOfTime.powerToolMaterial).setUnlocalizedName("ItemPowerSword")
				.setTextureName("wot:itemcuendillarsword").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerSword, powerSword.getUnlocalizedName().substring(5));
		
		ashandarei = new ItemAshandarei(WheelOfTime.relicToolMaterial).setUnlocalizedName("ItemAshandarei").setTextureName("wot:itemashandarei").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(ashandarei, ashandarei.getUnlocalizedName().substring(5));

		spear = new ItemSpear(ToolMaterial.IRON).setUnlocalizedName("ItemSpear").setTextureName("wot:itemspear")
				.setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(spear, spear.getUnlocalizedName().substring(5));
		
		heronsword = new ItemHeronSword(WheelOfTime.powerToolMaterial).setUnlocalizedName("ItemHeronSword").setTextureName("wot:itemheronsword").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(heronsword, heronsword.getUnlocalizedName().substring(5));
		
		mahalleinir = new ItemMahalleinir(WheelOfTime.relicToolMaterial).setUnlocalizedName("ItemMahalleinir").setTextureName("wot:itemmahalleinir").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(mahalleinir, mahalleinir.getUnlocalizedName().substring(5));
		
		rubydagger = new ItemRubyDagger(WheelOfTime.relicToolMaterial).setUnlocalizedName("ItemRubyDagger").setTextureName("wot:itemrubydagger").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(rubydagger, rubydagger.getUnlocalizedName().substring(5));
	}

}
