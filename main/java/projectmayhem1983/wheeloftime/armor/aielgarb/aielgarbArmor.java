package projectmayhem1983.wheeloftime.armor.aielgarb;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.init.WheelOfTimeArmor;

public class aielgarbArmor extends ItemArmor{
	private String[] armourTypes = new String [] {"aielgarbHelm", "aielgarbkChest", "aielgarbLegs", "aielgarbBoots"};
		
	public aielgarbArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		super(armorMaterial, renderIndex, armourType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if     (stack.getItem() == (WheelOfTimeArmor.aielgarbHelm) || 
				stack.getItem() == (WheelOfTimeArmor.aielgarbChest)||
				stack.getItem() == (WheelOfTimeArmor.aielgarbBoots)){
			return "wot:textures/models/armor/aielgarb1.png";
		}
		if     (stack.getItem().equals(WheelOfTimeArmor.aielgarbLegs)){
			return "wot:textures/models/armor/aielgarb2.png";
		}
		else return null;
		}
			
	}
	

