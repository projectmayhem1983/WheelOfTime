package projectmayhem1983.wheeloftime.entities.creatures.Motai;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMotaiMob extends RenderLiving{
	private static final ResourceLocation mobTextures = new ResourceLocation("wot:textures/entities/entitymotai.png");
	public RenderMotaiMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// 
	}
	protected ResourceLocation getEntitytexture(EntityMotaiMob entity){
		return mobTextures;
	}
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntitytexture((EntityMotaiMob)entity);
	}
}
