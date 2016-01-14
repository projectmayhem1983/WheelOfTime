package projectmayhem1983.wheeloftime.entities.creatures.Goat;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderGoatMob extends RenderLiving{
	private static final ResourceLocation mobTextures = new ResourceLocation("wot:textures/entities/entitygoat.png");
	public RenderGoatMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// 
	}
	protected ResourceLocation getEntitytexture(EntityGoatMob entity){
		return mobTextures;
	}
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntitytexture((EntityGoatMob)entity);
	}
}


