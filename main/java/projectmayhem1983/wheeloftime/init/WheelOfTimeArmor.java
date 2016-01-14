package projectmayhem1983.wheeloftime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.armor.aielgarb.aielgarbArmor;
import projectmayhem1983.wheeloftime.armor.whitecloak.whitecloakArmor;

public class WheelOfTimeArmor {
	//Armor
			public static Item whitecloakChest;
			public static Item whitecloakBoots;
			public static Item whitecloakHelm;
			public static Item whitecloakLegs;
			
			public static Item aielgarbChest;
			public static Item aielgarbBoots;
			public static Item aielgarbHelm;
			public static Item aielgarbLegs;
			
		public static void init(){
			
			
			//Armor
		    
		    whitecloakHelm = new whitecloakArmor(WheelOfTime.enumArmorMaterialWhitecloak,5,0).setUnlocalizedName("ItemwhitecloakHelm").setTextureName("wot:itemwhitecloakhelm").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(whitecloakHelm, whitecloakHelm.getUnlocalizedName().substring(5));
		    
		    whitecloakChest = new whitecloakArmor(WheelOfTime.enumArmorMaterialWhitecloak,5,1).setUnlocalizedName("ItemwhitecloakChest").setTextureName("wot:itemwhitecloakchest").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(whitecloakChest, whitecloakChest.getUnlocalizedName().substring(5));
		    
		    whitecloakLegs = new whitecloakArmor(WheelOfTime.enumArmorMaterialWhitecloak,5,2).setUnlocalizedName("ItemwhitecloakLegs").setTextureName("wot:itemwhitecloaklegs").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(whitecloakLegs, whitecloakLegs.getUnlocalizedName().substring(5));
		    
		    whitecloakBoots = new whitecloakArmor(WheelOfTime.enumArmorMaterialWhitecloak,5,3).setUnlocalizedName("ItemwhitecloakBoots").setTextureName("wot:itemwhitecloakboots").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(whitecloakBoots, whitecloakBoots.getUnlocalizedName().substring(5));
		    
		    aielgarbHelm = new aielgarbArmor(WheelOfTime.enumArmorMaterialAielgarb,6,0).setUnlocalizedName("ItemaielgarbHelm").setTextureName("wot:itemaielgarbhelm").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(aielgarbHelm, aielgarbHelm.getUnlocalizedName().substring(5));
		    
		    aielgarbChest = new aielgarbArmor(WheelOfTime.enumArmorMaterialAielgarb,6,1).setUnlocalizedName("ItemaielgarbChest").setTextureName("wot:itemaielgarbchest").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(aielgarbChest, aielgarbChest.getUnlocalizedName().substring(5));
		    
		    aielgarbLegs= new aielgarbArmor(WheelOfTime.enumArmorMaterialAielgarb,6,2).setUnlocalizedName("ItemaielgarbLegs").setTextureName("wot:itemaielgarblegs").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(aielgarbLegs, aielgarbLegs.getUnlocalizedName().substring(5));
		    
		    aielgarbBoots = new aielgarbArmor(WheelOfTime.enumArmorMaterialAielgarb,6,3).setUnlocalizedName("ItemaielgarbBoots").setTextureName("wot:itemaielgarbboots").setCreativeTab(WheelOfTime.tabWheelOfTime);
		    GameRegistry.registerItem(aielgarbBoots, aielgarbBoots.getUnlocalizedName().substring(5));
			
			
		}

}
