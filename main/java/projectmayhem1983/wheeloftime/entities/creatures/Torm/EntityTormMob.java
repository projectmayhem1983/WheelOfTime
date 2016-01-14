package projectmayhem1983.wheeloftime.entities.creatures.Torm;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityTormMob extends EntityHorse {
   
    private static final String[] horseTextures = new String[] {"textures/entities.entitytorm.png", "textures/entities.entitytorm.png", "textures/entities.entitytorm.png", "textures/entities.entitytorm.png", "textures/entities.entitytorm.png", "textures/entities.entitytorm.png", "textures/entities.entitytorm.png"};


	public EntityTormMob(World world) {
		super(world);
		
	}
	@Override
	/**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.0F;
    }

}
	

