package projectmayhem1983.wheeloftime.entities.creatures.Motai;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.init.WheelOfTimeItems;

public class EntityMotaiMob extends EntityAnimal{

	
	public EntityMotaiMob(World world) {
		super(world);
		this.setSize(0.4F, 0.4F);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAIWander(this, 0.4D));
		this.tasks.addTask(1, new EntityAIPanic(this, 0.8D));
		this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(3, new EntityAITempt(this, 1.2D, Items.sugar, false));
		this.tasks.addTask(4, new EntityAISwimming(this));
	}
	public boolean isAIEnabled(){
		return true;
	}
	 protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    }
	 protected void updateAITasks()
	    {
	        super.updateAITasks();
	    }
	 protected Item getDropItem()
	    {
	        return  WheelOfTimeItems.itemMotai;
	    }
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_) {
		
		return new EntityMotaiMob(this.worldObj);
	}
	
	public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return p_70877_1_ != null && p_70877_1_.getItem() == Items.sugar;
    }

}
