package projectmayhem1983.wheeloftime.entities.mobs.Darkhound;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderDarkhoundMob extends RenderLiving{
	private static final ResourceLocation mobTextures = new ResourceLocation("wot:textures/entities/entityshadowhound.png");
	public RenderDarkhoundMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// 
	}
	protected ResourceLocation getEntitytexture(EntityDarkhoundMob entity){
		return mobTextures;
	}
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntitytexture((EntityDarkhoundMob)entity);
	}

}
