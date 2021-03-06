// Date: 1/10/2016 12:44:21 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package projectmayhem1983.wheeloftime.item.Ashandarei;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAshandarei extends ModelBase
{
  //fields
    ModelRenderer Staff;
    ModelRenderer Crosspiece;
    ModelRenderer Blade2;
    ModelRenderer Blade4;
    ModelRenderer Blade3;
  
  public ModelAshandarei()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Staff = new ModelRenderer(this, 0, 26);
      Staff.addBox(0F, 0F, 0F, 21, 1, 1);
      Staff.setRotationPoint(-10F, 12F, -5F);
      Staff.setTextureSize(64, 32);
      Staff.mirror = true;
      setRotation(Staff, 0F, 0F, 0F);
      Crosspiece = new ModelRenderer(this, 0, 16);
      Crosspiece.addBox(0F, 0F, 0F, 1, 1, 5);
      Crosspiece.setRotationPoint(11F, 12F, -7F);
      Crosspiece.setTextureSize(64, 32);
      Crosspiece.mirror = true;
      setRotation(Crosspiece, 0F, 0F, 0F);
      Blade2 = new ModelRenderer(this, 0, 11);
      Blade2.addBox(0F, 0F, 0F, 2, 1, 3);
      Blade2.setRotationPoint(12F, 12F, -6F);
      Blade2.setTextureSize(64, 32);
      Blade2.mirror = true;
      setRotation(Blade2, 0F, 0F, 0F);
      Blade4 = new ModelRenderer(this, 9, 2);
      Blade4.addBox(0F, 0F, 0F, 2, 1, 1);
      Blade4.setRotationPoint(16F, 12F, -4F);
      Blade4.setTextureSize(64, 32);
      Blade4.mirror = true;
      setRotation(Blade4, 0F, 0F, 0F);
      Blade3 = new ModelRenderer(this, 8, 6);
      Blade3.addBox(0F, 0F, 0F, 2, 1, 2);
      Blade3.setRotationPoint(14F, 12F, -5F);
      Blade3.setTextureSize(64, 32);
      Blade3.mirror = true;
      setRotation(Blade3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Staff.render(f5);
    Crosspiece.render(f5);
    Blade2.render(f5);
    Blade4.render(f5);
    Blade3.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
