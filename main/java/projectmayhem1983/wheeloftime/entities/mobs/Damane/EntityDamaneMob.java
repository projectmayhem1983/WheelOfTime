package projectmayhem1983.wheeloftime.entities.mobs.Damane;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
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
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.EntityDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrollocMob;

public class EntityDamaneMob extends EntityMob implements IMob{
	
	    
	
	 public EntityDamaneMob(World world) {
		super(world);
	}
	 private int field_70846_g;
	 private static final String __OBFID = "CL_00001682";
	 public void onLivingUpdate()
	    {     

	        if (this.rand.nextInt(24) == 0)
	        {
	            this.worldObj.playSoundEffect(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D, "fire.fire", 1.0F + this.rand.nextFloat(), this.rand.nextFloat() * 0.7F + 0.3F);
	        }

	        if (!this.onGround && this.motionY < 0.0D)
	        {
	            this.motionY *= 0.6D;
	        }

	        super.onLivingUpdate();
	    }

	    /**
	     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
	     */
	    protected void attackEntity(Entity p_70785_1_, float p_70785_2_)
	    {
	        if (this.attackTime <= 0 && p_70785_2_ < 2.0F && p_70785_1_.boundingBox.maxY > this.boundingBox.minY && p_70785_1_.boundingBox.minY < this.boundingBox.maxY)
	        {
	            this.attackTime = 20;
	            this.attackEntityAsMob(p_70785_1_);
	        }
	        else if (p_70785_2_ < 30.0F)
	        {
	            double d0 = p_70785_1_.posX - this.posX;
	            double d1 = p_70785_1_.boundingBox.minY + (double)(p_70785_1_.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
	            double d2 = p_70785_1_.posZ - this.posZ;

	            if (this.attackTime == 0)
	            {
	                ++this.field_70846_g;

	                if (this.field_70846_g == 1)
	                {
	                    this.attackTime = 60;
	                    this.func_70844_e(true);
	                }
	                else if (this.field_70846_g <= 4)
	                {
	                    this.attackTime = 6;
	                }
	                else
	                {
	                    this.attackTime = 100;
	                    this.field_70846_g = 0;
	                    this.func_70844_e(false);
	                }

	                if (this.field_70846_g > 1)
	                {
	                    float f1 = MathHelper.sqrt_float(p_70785_2_) * 0.5F;
	                    this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)this.posX, (int)this.posY, (int)this.posZ, 0);

	                    for (int i = 0; i < 1; ++i)
	                    {
	                        EntitySmallFireball entitysmallfireball = new EntitySmallFireball(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
	                        entitysmallfireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
	                        this.worldObj.spawnEntityInWorld(entitysmallfireball);
	                    }
	                }
	            }

	            this.rotationYaw = (float)(Math.atan2(d2, d0) * 180.0D / Math.PI) - 90.0F;
	            this.hasAttacked = true;
	        }
	    }
	   	private void func_70844_e(boolean b) {
			
		}
}