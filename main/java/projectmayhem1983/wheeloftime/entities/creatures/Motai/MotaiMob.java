package projectmayhem1983.wheeloftime.entities.creatures.Motai;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MotaiMob extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer head;
    ModelRenderer Shape4;
    ModelRenderer Shape3;
  
  public MotaiMob()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 20, 4);
      Shape1.addBox(0F, 0F, 0F, 2, 3, 3);
      Shape1.setRotationPoint(-1F, 21F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 1.570796F, 0F);
      Shape2 = new ModelRenderer(this, 11, 2);
      Shape2.addBox(-1F, 0F, 0F, 2, 2, 2);
      Shape2.setRotationPoint(0.5F, 22F, -4F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 8);
      head.addBox(0F, 0F, 0F, 1, 1, 1);
      head.setRotationPoint(0F, 22.5F, -5F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 11, 2);
      Shape4.addBox(-1F, 0F, 0F, 2, 2, 2);
      Shape4.setRotationPoint(0.5F, 22F, 0F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 4, 3);
      Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape3.setRotationPoint(0F, 22.5F, 2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    head.render(f5);
    Shape4.render(f5);
    Shape3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
