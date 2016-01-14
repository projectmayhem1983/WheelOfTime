package projectmayhem1983.wheeloftime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.blocks.BlockBlight;
import projectmayhem1983.wheeloftime.blocks.BlockCuendillar;
import projectmayhem1983.wheeloftime.blocks.BlockPowerore;
import projectmayhem1983.wheeloftime.blocks.BlockStasisbox;
import projectmayhem1983.wheeloftime.crops.BlockIcePeppers;
import projectmayhem1983.wheeloftime.crops.BlockKafBush;

public class WheelOfTimeBlocks {

	// Blocks
	public static Block blockCuendillar;
	public static Block blockPowerore;
	public static Block blockWheel;
	public static Block blockStasisbox;
	public static Block blockBlight;
	public static Block blockBlightdirt;

	// plants
	public static Block blockIcePeppers;
	public static Block blockKafBush;

	public static void init() {

		// Blocks
		blockCuendillar = new BlockCuendillar(Material.iron).setBlockName("BlockCuendillar")
				.setBlockTextureName("wot:blockcuendillar").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerBlock(blockCuendillar, blockCuendillar.getUnlocalizedName().substring(5));

		blockPowerore = new BlockPowerore(Material.iron).setBlockName("BlockPowerore")
				.setBlockTextureName("wot:blockpowerore").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerBlock(blockPowerore, blockPowerore.getUnlocalizedName().substring(5));
		
		blockStasisbox = new BlockStasisbox(Material.wood).setBlockName("BlockStasisbox").setBlockTextureName("wot:blockstasisbox").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerBlock(blockStasisbox, blockStasisbox.getUnlocalizedName().substring(5));
		
		blockBlight = new BlockBlight(Material.grass).setBlockName("BlockBlight").setBlockTextureName("wot:blockblight").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerBlock(blockBlight, blockBlight.getUnlocalizedName().substring(5));
		
		blockBlightdirt = new BlockBlight(Material.grass).setBlockName("BlockBlightdirt").setBlockTextureName("wot:blockblightdirt").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerBlock(blockBlightdirt, blockBlightdirt.getUnlocalizedName().substring(5));
		
				
				

		// Plants
		blockIcePeppers = new BlockIcePeppers().setBlockName("BlockIcePeppers").setBlockTextureName("wot:icepepperplant7");
		GameRegistry.registerBlock(blockIcePeppers, blockIcePeppers.getUnlocalizedName().substring(5));
		
		blockKafBush = new BlockKafBush().setBlockName("BlockKafBush").setBlockTextureName("wot:defaultplant0");
		GameRegistry.registerBlock(blockKafBush, blockKafBush.getUnlocalizedName().substring(5));

	}

}
