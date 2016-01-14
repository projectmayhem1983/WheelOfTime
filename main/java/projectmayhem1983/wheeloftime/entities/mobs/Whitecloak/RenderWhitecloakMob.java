package projectmayhem1983.wheeloftime.entities.mobs.Whitecloak;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.EntityMotaiMob;

public class RenderWhitecloakMob extends RenderLiving{
	private static final ResourceLocation mobTextures = new ResourceLocation("wot:textures/entities/entitywhitecloak.png");
	public RenderWhitecloakMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// 
	}
	protected ResourceLocation getEntitytexture(EntityWhitecloakMob entity){
		return mobTextures;
	}
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntitytexture((EntityWhitecloakMob)entity);
	}
}
