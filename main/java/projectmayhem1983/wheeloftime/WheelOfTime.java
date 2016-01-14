package projectmayhem1983.wheeloftime;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import projectmayhem1983.wheeloftime.AngrealEventHandlers.AngelEventHandler;
import projectmayhem1983.wheeloftime.biome.BiomeRegistry;
import projectmayhem1983.wheeloftime.biome.WorldTypeWheelOfTime;
import projectmayhem1983.wheeloftime.entities.creatures.Gara.EntityGara;
import projectmayhem1983.wheeloftime.entities.creatures.Gara.EntityGaraMob;
import projectmayhem1983.wheeloftime.entities.creatures.Gara.RenderGaraMob;
import projectmayhem1983.wheeloftime.entities.creatures.Gara.GaraMob;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.EntityGoat;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.EntityGoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.GoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.RenderGoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.EntityMotai;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.EntityMotaiMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.MotaiMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.RenderMotaiMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.AielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAiel;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.RenderAielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.AshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.EntityAshaman;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.EntityAshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.RenderAshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.DamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.EntityDamane;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.EntityDamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.RenderDamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.DarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.EntityDarkhound;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.EntityDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.RenderDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraal;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.MyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.RenderMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrolloc;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.RenderTrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.TrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.EntityWhitecloak;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.EntityWhitecloakMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.RenderWhitecloakMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.WhitecloakMob;
import projectmayhem1983.wheeloftime.generation.PlantGeneration;
import projectmayhem1983.wheeloftime.generation.PoweroreGeneration;
import projectmayhem1983.wheeloftime.generation.StasisBoxGeneration;
import projectmayhem1983.wheeloftime.generation.TinkerWagonGeneration;
import projectmayhem1983.wheeloftime.init.WheelOfTimeArmor;
import projectmayhem1983.wheeloftime.init.WheelOfTimeBlocks;
import projectmayhem1983.wheeloftime.init.WheelOfTimeEntities;
import projectmayhem1983.wheeloftime.init.WheelOfTimeItems;
import projectmayhem1983.wheeloftime.init.WheelOfTimeRecipes;
import projectmayhem1983.wheeloftime.init.WheelOfTimeRenderingRegistry;
import projectmayhem1983.wheeloftime.init.WheelOfTimeStasisBox;
import projectmayhem1983.wheeloftime.init.WheelOfTimeTools;
import projectmayhem1983.wheeloftime.proxy.ClientProxy;
import projectmayhem1983.wheeloftime.proxy.ServerProxy;
import projectmayhem1983.wheeloftime.tileentity.TileEntityWheelOfTime;

@Mod(modid = "wot", name = "Wheel of Time", version = "1.0")
public class WheelOfTime {

	@Instance("wot")
	public static WheelOfTime instance;

	@SidedProxy(clientSide = "projectmayhem1983.wheeloftime.proxy.ClientProxy", serverSide = "projectmayhem1983.wheeloftime.proxy.ServerProxy")

	public static ServerProxy proxy;

	@Metadata
	public static ModMetadata meta;

	// Material
	public static final Item.ToolMaterial powerToolMaterial = EnumHelper.addToolMaterial("cuendillarToolMaterial",
			4, 3000, 12.0F, 5.0F, 40);
	public static final Item.ToolMaterial relicToolMaterial = EnumHelper.addToolMaterial("cuendillarToolMaterial",
			6, 99999, 20.0F, 8.0F, 400);
	public static final ArmorMaterial enumArmorMaterialWhitecloak = EnumHelper.addArmorMaterial("Whitecloak", 20,
			new int[] { 3, 6, 6, 3 }, 15);
	public static final ArmorMaterial enumArmorMaterialAielgarb = EnumHelper.addArmorMaterial("Aielgarb", 9,
			new int[] { 1, 4, 2, 2 }, 15);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Item/Block init and registering
		// Config handling
		
		proxy.registerRenderThings();

		// Armor Prefixes
		RenderingRegistry.addNewArmourRendererPrefix("5");
		RenderingRegistry.addNewArmourRendererPrefix("6");

		
		
		// Init
		WheelOfTimeBlocks.init();
		WheelOfTimeArmor.init();
		WheelOfTimeTools.init();
		WheelOfTimeItems.init();
		WheelOfTimeEntities.init();
		WheelOfTimeStasisBox.initLoot();

		// Recipe init
		WheelOfTimeRecipes.init();

		// World Gen
		GameRegistry.registerWorldGenerator(new PoweroreGeneration(), 0);
		GameRegistry.registerWorldGenerator(new StasisBoxGeneration(), 0);
		GameRegistry.registerWorldGenerator(new PlantGeneration(), 1);
		//GameRegistry.registerWorldGenerator(new TinkerWagonGeneration(), 1);

		// Block Rendering
		
		TileEntityWheelOfTime.WheelOfTime();

		// Biomes
		BiomeRegistry.WheelOfTime();
		
		//Rendering init
		WheelOfTimeRenderingRegistry.init();
		ClientProxy.registerRenders();
		
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// proxy, entity, Tileentity, GUI and Packet Registering

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		FMLCommonHandler.instance().bus().register(new AngelEventHandler());
		MinecraftForge.EVENT_BUS.register(new AngelEventHandler());
	
		WorldType WheelOfTime = new WorldTypeWheelOfTime(3, "WheelOfTime");

	}

	public static CreativeTabs tabWheelOfTime = new CreativeTabs("tabWheelOfTime") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(WheelOfTimeItems.itemWheeloftime).getItem();
		}
	};
}
