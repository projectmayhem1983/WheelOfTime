package projectmayhem1983.wheeloftime.entities.creatures.Goat;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class GoatMob extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer head1;
    ModelRenderer tail;
    ModelRenderer neck;
    ModelRenderer head2;
    ModelRenderer horn2;
    ModelRenderer horn1;
  
  public GoatMob()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      body = new ModelRenderer(this, 20, 0);
      body.addBox(-6F, -10F, -7F, 6, 13, 4);
      body.setRotationPoint(2F, 8F, 2F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-3F, 0F, -2F, 2, 9, 2);
      leg1.setRotationPoint(-1F, 15F, 5F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-1F, 0F, -1F, 2, 9, 2);
      leg2.setRotationPoint(1F, 15F, 4F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-3F, 0F, -3F, 2, 9, 2);
      leg3.setRotationPoint(-1F, 15F, -5F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-1F, 0F, -3F, 2, 9, 2);
      leg4.setRotationPoint(1F, 15F, -5F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      head1 = new ModelRenderer(this, 0, 7);
      head1.addBox(0F, -3F, -2F, 3, 2, 3);
      head1.setRotationPoint(-2.5F, 10F, -8.5F);
      head1.setTextureSize(64, 32);
      head1.mirror = true;
      setRotation(head1, 0.8551081F, 0F, 0F);
      tail = new ModelRenderer(this, 13, 0);
      tail.addBox(0F, 0F, 0F, 1, 1, 2);
      tail.setRotationPoint(-1.5F, 12F, 4.5F);
      tail.setTextureSize(64, 32);
      tail.mirror = true;
      setRotation(tail, 0.7063936F, 0F, 0F);
      neck = new ModelRenderer(this, 0, 0);
      neck.addBox(0F, 0F, -1F, 2, 2, 4);
      neck.setRotationPoint(-2F, 12F, -8.5F);
      neck.setTextureSize(64, 32);
      neck.mirror = true;
      setRotation(neck, 2.41661F, 0F, 0F);
      head2 = new ModelRenderer(this, 9, 18);
      head2.addBox(0F, -3F, -5F, 2, 2, 3);
      head2.setRotationPoint(-2F, 10F, -8.5F);
      head2.setTextureSize(64, 32);
      head2.mirror = true;
      setRotation(head2, 0.8551081F, 0F, 0F);
      horn2 = new ModelRenderer(this, 13, 5);
      horn2.addBox(0.5F, 0.5F, 0F, 1, 2, 1);
      horn2.setRotationPoint(-2.5F, 5F, -10F);
      horn2.setTextureSize(64, 32);
      horn2.mirror = true;
      setRotation(horn2, -0.4461433F, -1.524323F, 0.4089647F);
      horn1 = new ModelRenderer(this, 13, 5);
      horn1.addBox(0.5F, -1F, 1F, 1, 2, 1);
      horn1.setRotationPoint(-0.5F, 6F, -11F);
      horn1.setTextureSize(64, 32);
      horn1.mirror = true;
      setRotation(horn1, -0.5205006F, 0F, 0.2602503F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    head1.render(f5);
    tail.render(f5);
    neck.render(f5);
    head2.render(f5);
    horn2.render(f5);
    horn1.render(f5);
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
    this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F *f1;
    this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F *f1;
    this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
