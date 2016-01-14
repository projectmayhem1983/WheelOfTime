package projectmayhem1983.wheeloftime.entities.mobs.Darkhound;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAielMob;

public class EntityDarkhoundMob extends EntityMob{
	public EntityDarkhoundMob(World world) {
	super(world);
	this.getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, new EntityAISwimming(this));
    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false));
    this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityAielMob.class, 1.2D, true));
    this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.2D, true));
    this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityWolf.class, 1.2D, true));
    this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
    this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
    this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
    this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(8, new EntityAILookIdle(this));
    this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityAielMob.class, 0, false));
    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWolf.class, 0, false));
    this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
   
    this.setSize(0.6F, 1.8F);
}
protected void applyEntityAttributes()
{
    super.applyEntityAttributes();
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
}
public int getTotalArmorValue()
{
    int i = super.getTotalArmorValue() + 2;

    if (i > 20)
    {
        i = 20;
    }

    return i;
}

 protected boolean isAIEnabled()
    {
        return true;
    }
 public boolean attackEntityAsMob(Entity p_70652_1_)
 {
     if (super.attackEntityAsMob(p_70652_1_))
     {
         if (p_70652_1_ instanceof EntityLivingBase)
         {
             byte b0 = 0;

             if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL)
             {
                 b0 = 7;
             }
             else if (this.worldObj.difficultySetting == EnumDifficulty.HARD)
             {
                 b0 = 15;
             }

             if (b0 > 0)
             {
                 ((EntityLivingBase)p_70652_1_).addPotionEffect(new PotionEffect(Potion.poison.id, b0 * 20, 0));
             }
         }

         return true;
     }
     else
     {
         return false;
     }
 }
 
protected int getExperiencePoints(EntityPlayer p_70693_1_)
{
    if (this.isChild())
    {
        this.experienceValue = (int)((float)this.experienceValue * 2.5F);
    }

    return super.getExperiencePoints(p_70693_1_);
}

}

