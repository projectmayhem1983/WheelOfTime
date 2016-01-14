package projectmayhem1983.wheeloftime.entities.mobs.Aiel;

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
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.EntityDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrollocMob;
import projectmayhem1983.wheeloftime.init.WheelOfTimeTools;

public class EntityAielMob extends EntityMob{

	public EntityAielMob(World world) {
		super(world);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityTrollocMob.class, 1.2D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityMyrddraalMob.class, 1.2D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityDarkhoundMob.class, 1.2D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityZombie.class, 1.2D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntitySpider.class, 1.2D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityWitch.class, 1.2D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.2D, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTrollocMob.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMyrddraalMob.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityDarkhoundMob.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWitch.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, false));
        this.setSize(0.6F, 1.8F);
        
	}
	
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
    }
	public int getTotalArmorValue()
    {
        int i = super.getTotalArmorValue() + 3;

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
	 
	protected int getExperiencePoints(EntityPlayer p_70693_1_)
    {
        if (this.isChild())
        {
            this.experienceValue = (int)((float)this.experienceValue * 4.5F);
        }

        return super.getExperiencePoints(p_70693_1_);
    }
	
	@Override
	protected void addRandomArmor()
    {
        super.addRandomArmor();

        this.setCurrentItemOrArmor(0, new ItemStack(WheelOfTimeTools.spear));
                    
    }
	@Override
	 public void onLivingUpdate()
	    {
	        if (this.worldObj.isDaytime() && !this.worldObj.isRemote && !this.isChild())
	        {
	            float var1 = this.getBrightness(100.0F);

	            if (var1 > 0.5F && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)))
	            {
	                boolean var2 = true;
	                if (var2)
	                {
	                    this.setFire(-99);
	                }
	            }
	        }

	        super.onLivingUpdate();
	    }
}
