// Date: 1/6/2016 6:41:03 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package projectmayhem1983.wheeloftime.entities.creatures.Torm;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class TormMob extends ModelBase
{
  //fields
    ModelRenderer Jaw;
    ModelRenderer Crown;
    ModelRenderer TopJaw;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer Neck;
    ModelRenderer body;
    ModelRenderer BRTleg;
    ModelRenderer BRBleg;
    ModelRenderer belly;
    ModelRenderer FRTleg;
    ModelRenderer FRBleg;
    ModelRenderer FLTleg;
    ModelRenderer FLBleg;
    ModelRenderer BLTleg;
    ModelRenderer BLBleg;
  
  public TormMob()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Jaw = new ModelRenderer(this, 0, 0);
      Jaw.addBox(0F, -1F, 0F, 8, 2, 10);
      Jaw.setRotationPoint(-4F, 2F, -26.53333F);
      Jaw.setTextureSize(64, 64);
      Jaw.mirror = true;
      setRotation(Jaw, -0.1115358F, 0F, 0F);
      Crown = new ModelRenderer(this, 34, 0);
      Crown.addBox(0F, 0F, 0F, 8, 3, 7);
      Crown.setRotationPoint(-4F, -5.5F, -22.2F);
      Crown.setTextureSize(64, 64);
      Crown.mirror = true;
      setRotation(Crown, -0.1115358F, 0F, 0F);
      TopJaw = new ModelRenderer(this, 28, 13);
      TopJaw.addBox(0F, 0F, 0F, 8, 4, 10);
      TopJaw.setRotationPoint(-4F, -3F, -25.53333F);
      TopJaw.setTextureSize(64, 64);
      TopJaw.mirror = true;
      setRotation(TopJaw, -0.1115358F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 25, 46);
      Tail1.addBox(0F, 0F, 0F, 1, 1, 3);
      Tail1.setRotationPoint(-0.5F, 16F, 47F);
      Tail1.setTextureSize(64, 64);
      Tail1.mirror = true;
      setRotation(Tail1, -0.2974289F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 23, 42);
      Tail2.addBox(0F, 0F, 0F, 6, 6, 13);
      Tail2.setRotationPoint(-3F, 5F, 19F);
      Tail2.setTextureSize(64, 64);
      Tail2.mirror = true;
      setRotation(Tail2, -0.2974289F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 28, 43);
      Tail3.addBox(0F, 0F, 0F, 5, 5, 9);
      Tail3.setRotationPoint(-2.5F, 9F, 31F);
      Tail3.setTextureSize(64, 64);
      Tail3.mirror = true;
      setRotation(Tail3, -0.2974289F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 29, 45);
      Tail4.addBox(0F, 0F, 0F, 3, 3, 7);
      Tail4.setRotationPoint(-1.5F, 12F, 38F);
      Tail4.setTextureSize(64, 64);
      Tail4.mirror = true;
      setRotation(Tail4, -0.2974289F, 0F, 0F);
      Tail5 = new ModelRenderer(this, 28, 42);
      Tail5.addBox(0F, 0F, 0F, 2, 2, 4);
      Tail5.setRotationPoint(-1F, 14.5F, 44F);
      Tail5.setTextureSize(64, 64);
      Tail5.mirror = true;
      setRotation(Tail5, -0.2974289F, 0F, 0F);
      Neck = new ModelRenderer(this, 23, 42);
      Neck.addBox(-4F, -4F, -6F, 8, 5, 12);
      Neck.setRotationPoint(0F, 5F, -12F);
      Neck.setTextureSize(64, 64);
      Neck.mirror = true;
      setRotation(Neck, -0.4833219F, 0F, 0F);
      body = new ModelRenderer(this, 23, 27);
      body.addBox(-6F, -10F, -7F, 12, 29, 8);
      body.setRotationPoint(0F, 5F, 2F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      BRTleg = new ModelRenderer(this, 26, 38);
      BRTleg.addBox(-1F, 0F, -2F, 3, 10, 6);
      BRTleg.setRotationPoint(-8F, 9F, 14F);
      BRTleg.setTextureSize(64, 64);
      BRTleg.mirror = true;
      setRotation(BRTleg, -0.2974289F, 0F, 0F);
      BRBleg = new ModelRenderer(this, 26, 38);
      BRBleg.addBox(-1F, 0F, -3F, 3, 6, 4);
      BRBleg.setRotationPoint(-8F, 17.7F, 12.5F);
      BRBleg.setTextureSize(64, 64);
      BRBleg.mirror = true;
      setRotation(BRBleg, 0.1115358F, 0F, 0F);
      belly = new ModelRenderer(this, 8, 31);
      belly.addBox(-2F, -3F, 0F, 5, 17, 2);
      belly.setRotationPoint(-1F, 14F, 0F);
      belly.setTextureSize(64, 64);
      belly.mirror = true;
      setRotation(belly, 1.570796F, 0F, 0F);
      FRTleg = new ModelRenderer(this, 34, 32);
      FRTleg.addBox(-1F, 0F, -3F, 2, 10, 3);
      FRTleg.setRotationPoint(-7F, 8F, 0F);
      FRTleg.setTextureSize(64, 64);
      FRTleg.mirror = true;
      setRotation(FRTleg, -0.4833219F, 0F, 0F);
      FRBleg = new ModelRenderer(this, 38, 37);
      FRBleg.addBox(-1F, 0F, -3F, 2, 10, 3);
      FRBleg.setRotationPoint(-7F, 14F, -4.5F);
      FRBleg.setTextureSize(64, 64);
      FRBleg.mirror = true;
      setRotation(FRBleg, 0.3346075F, 0F, 0F);
      FLTleg = new ModelRenderer(this, 44, 41);
      FLTleg.addBox(-1F, 0F, -3F, 2, 10, 3);
      FLTleg.setRotationPoint(7F, 8F, 0F);
      FLTleg.setTextureSize(64, 64);
      FLTleg.mirror = true;
      setRotation(FLTleg, -0.4833219F, 0F, 0F);
      FLBleg = new ModelRenderer(this, 50, 41);
      FLBleg.addBox(-1F, 0F, -3F, 2, 10, 3);
      FLBleg.setRotationPoint(7F, 14F, -4.5F);
      FLBleg.setTextureSize(64, 64);
      FLBleg.mirror = true;
      setRotation(FLBleg, 0.3346075F, 0F, 0F);
      BLTleg = new ModelRenderer(this, 31, 43);
      BLTleg.addBox(-1F, 0F, -2F, 3, 10, 6);
      BLTleg.setRotationPoint(7F, 9F, 14F);
      BLTleg.setTextureSize(64, 64);
      BLTleg.mirror = true;
      setRotation(BLTleg, -0.2974289F, 0F, 0F);
      BLBleg = new ModelRenderer(this, 28, 33);
      BLBleg.addBox(-1F, 0F, -3F, 3, 6, 4);
      BLBleg.setRotationPoint(7F, 17.7F, 12.5F);
      BLBleg.setTextureSize(64, 64);
      BLBleg.mirror = true;
      setRotation(BLBleg, 0.1115358F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Jaw.render(f5);
    Crown.render(f5);
    TopJaw.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Tail4.render(f5);
    Tail5.render(f5);
    Neck.render(f5);
    body.render(f5);
    BRTleg.render(f5);
    BRBleg.render(f5);
    belly.render(f5);
    FRTleg.render(f5);
    FRBleg.render(f5);
    FLTleg.render(f5);
    FLBleg.render(f5);
    BLTleg.render(f5);
    BLBleg.render(f5);
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
    this.BRBleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F *f1;
    this.BLBleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.FRBleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F *f1;
    this.FLBleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
