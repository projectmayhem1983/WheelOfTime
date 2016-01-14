package projectmayhem1983.wheeloftime.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IIcon;

public class BlockBlight extends Block{
	private static final String name = "blockblight";
	 
	private IIcon[] icons = new IIcon[6];
	
	public BlockBlight(Material material) {
		super(material);
		this.setHarvestLevel("shovel", 1);
		this.setHardness(2.0F);
		
	}
	@Override
	public void registerBlockIcons(IIconRegister reg)
	{
	for (int i = 0; i < 6; i++)
	{
	icons[i] = reg.registerIcon("wot:" + name + "_" + (i));
	}
	}
	 
	@Override
	public IIcon getIcon(int side, int meta)
	{
	return icons[side];
	}

}
