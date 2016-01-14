package projectmayhem1983.wheeloftime.item.Mahalleinir;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import projectmayhem1983.wheeloftime.item.Mahalleinir.ModelMahalleinir;

public class MahalleinirRenderer implements IItemRenderer{
	protected ModelMahalleinir model;
	public MahalleinirRenderer(){
	model = new ModelMahalleinir();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type){
		case EQUIPPED:
		case EQUIPPED_FIRST_PERSON:
			return true;
			default: return false;
		}
		
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		
		switch(type){
		case EQUIPPED:
		case EQUIPPED_FIRST_PERSON:
		
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("wot:textures/models/weapon/ModelMahalleinir.png"));
			
			GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
			
			
			GL11.glTranslatef(0.0F, -0.5F, -0.3F);
			
			
			model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			
			GL11.glPopMatrix();
		default:
			break;
		
		}
	}

}
