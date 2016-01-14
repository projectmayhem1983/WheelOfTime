package projectmayhem1983.wheeloftime.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import projectmayhem1983.wheeloftime.init.WheelOfTimeBlocks;
import projectmayhem1983.wheeloftime.init.WheelOfTimeItems;
import projectmayhem1983.wheeloftime.init.WheelOfTimeTools;
import projectmayhem1983.wheeloftime.item.Ashandarei.AshandareiRenderer;
import projectmayhem1983.wheeloftime.item.Mahalleinir.MahalleinirRenderer;
import projectmayhem1983.wheeloftime.item.RubyDagger.RubyDaggerRenderer;

public class ClientProxy extends ServerProxy{
	public static void registerRenders(){
		MinecraftForgeClient.registerItemRenderer(WheelOfTimeTools.ashandarei, new AshandareiRenderer());
		MinecraftForgeClient.registerItemRenderer(WheelOfTimeTools.mahalleinir, new MahalleinirRenderer());
		MinecraftForgeClient.registerItemRenderer(WheelOfTimeTools.rubydagger, new RubyDaggerRenderer());

		
		}
}
