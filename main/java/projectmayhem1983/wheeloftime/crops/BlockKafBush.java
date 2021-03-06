package projectmayhem1983.wheeloftime.crops;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import projectmayhem1983.wheeloftime.init.WheelOfTimeItems;

public class BlockKafBush extends RecipeBlockCrops{
	
	 /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata/2);
    }
    
    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
    {
     // DEBUG
     System.out.println("BlockKafBush getItemDropped()");
        return (WheelOfTimeItems.itemKafbean);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
          // to make generic should loop to maxGrowthStage
          iIcon[0] = parIIconRegister.registerIcon("wot:kafbush1_3");
          iIcon[1] = parIIconRegister.registerIcon("wot:kafbush1_3");
          iIcon[2] = parIIconRegister.registerIcon("wot:kafbush1_3");
          iIcon[3] = parIIconRegister.registerIcon("wot:kafbush4_6");
          iIcon[4] = parIIconRegister.registerIcon("wot:kafbush4_6");
          iIcon[5] = parIIconRegister.registerIcon("wot:kafbush4_6");
          iIcon[6] = parIIconRegister.registerIcon("wot:kafbush4_6");
          iIcon[7] = parIIconRegister.registerIcon("wot:kafbush7");
    }
}
