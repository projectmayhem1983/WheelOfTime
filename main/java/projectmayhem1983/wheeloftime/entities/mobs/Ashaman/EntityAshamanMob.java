package projectmayhem1983.wheeloftime.entities.mobs.Ashaman;


import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.EntityDamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.EntityDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.EntityWhitecloakMob;

public class EntityAshamanMob extends EntityMob{

	private int field_70846_g;
	public EntityAshamanMob(World world) {
		super(world);
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	    this.setSize(0.6F, 1.8F);
        
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