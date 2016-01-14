package projectmayhem1983.wheeloftime.armor.whitecloak;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import projectmayhem1983.wheeloftime.init.WheelOfTimeArmor;

public class whitecloakArmor extends ItemArmor{
	private String[] armourTypes = new String [] {"whitecloakHelm", "whitecloakChest", "whitecloakLegs", "whitecloakBoots"};
		
	public whitecloakArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		super(armorMaterial, renderIndex, armourType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if     (stack.getItem() == (WheelOfTimeArmor.whitecloakHelm) || 
				stack.getItem() == (WheelOfTimeArmor.whitecloakChest)||
				stack.getItem() == (WheelOfTimeArmor.whitecloakBoots)){
			return "wot:textures/models/armor/whitecloak1.png";
		}
		if     (stack.getItem().equals(WheelOfTimeArmor.whitecloakLegs)){
			return "wot:textures/models/armor/whitecloak2.png";
		}
		else return null;
		}
		
	}
	
