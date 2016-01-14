package projectmayhem1983.wheeloftime.blocks;
//Special thanks to https://github.com/Choonster/TestMod2/commit/bf2e2982b0f9c98c0225d5281641985b14efea5b for the coding here


import java.util.Random;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrollocMob;
import projectmayhem1983.wheeloftime.init.WheelOfTimeBlocks;
import projectmayhem1983.wheeloftime.init.WheelOfTimeItems;
import projectmayhem1983.wheeloftime.init.WheelOfTimeStasisBox;

public class BlockStasisbox extends Block {

	public BlockStasisbox(Material material) {
		super(material);
		this.setHardness(1.2F);

	}
	@Override
	 	public boolean onBlockActivated(World worldIn, int x, int y, int z, EntityPlayer player, int side, float subX, float subY, float subZ) {
	 		if (!worldIn.isRemote) {
	 			ItemStack itemStack = WheelOfTimeStasisBox.RIGHT_CLICK_LOOT_BLOCK.getOneItem(worldIn.rand); // Get a random item from the loot list
	 			dropBlockAsItem(worldIn, x, y, z, itemStack); // Drop it in the world
	 
	 			player.playSound("random.break", 0.8F, 0.8F + worldIn.rand.nextFloat() * 0.4F); // Play the tool break sound
	 			worldIn.setBlockToAir(x, y, z); // Set this block to air
	 		}
	 
	 	return true;
	 	}
	 }