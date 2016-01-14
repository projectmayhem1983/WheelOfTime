package projectmayhem1983.wheeloftime.entities.mobs.Ashaman;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.EntityMotaiMob;

public class RenderAshamanMob extends RenderLiving{
	private static final ResourceLocation mobTextures = new ResourceLocation("wot:textures/entities/entityashaman.png");
	public RenderAshamanMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// 
	}
	protected ResourceLocation getEntitytexture(EntityAshamanMob entity){
		return mobTextures;
	}
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntitytexture((EntityAshamanMob)entity);
	}
}
