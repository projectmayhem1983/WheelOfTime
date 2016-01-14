package projectmayhem1983.wheeloftime.init;

import cpw.mods.fml.client.registry.RenderingRegistry;
import projectmayhem1983.wheeloftime.entities.creatures.Gara.EntityGaraMob;
import projectmayhem1983.wheeloftime.entities.creatures.Gara.GaraMob;
import projectmayhem1983.wheeloftime.entities.creatures.Gara.RenderGaraMob;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.EntityGoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.GoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.RenderGoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.EntityMotaiMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.MotaiMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.RenderMotaiMob;
import projectmayhem1983.wheeloftime.entities.creatures.Torm.EntityTormMob;
import projectmayhem1983.wheeloftime.entities.creatures.Torm.RenderTormMob;
import projectmayhem1983.wheeloftime.entities.creatures.Torm.TormMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.AielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.RenderAielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.AshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.EntityAshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.RenderAshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.DamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.EntityDamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.RenderDamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.DarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.EntityDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.RenderDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Deatchwatch.DeathwatchMob;
import projectmayhem1983.wheeloftime.entities.mobs.Deatchwatch.EntityDeathwatch;
import projectmayhem1983.wheeloftime.entities.mobs.Deatchwatch.EntityDeathwatchMob;
import projectmayhem1983.wheeloftime.entities.mobs.Deatchwatch.RenderDeathwatchMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.MyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.RenderMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.RenderTrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.TrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.EntityWhitecloakMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.RenderWhitecloakMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.WhitecloakMob;

public class WheelOfTimeRenderingRegistry {
	public static void init(){
		
		
		// Mob Rendering
				RenderingRegistry.registerEntityRenderingHandler(EntityMotaiMob.class, new RenderMotaiMob(new MotaiMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityTrollocMob.class, new RenderTrollocMob(new TrollocMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityAielMob.class, new RenderAielMob(new AielMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityGoatMob.class, new RenderGoatMob(new GoatMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityDarkhoundMob.class, new RenderDarkhoundMob(new DarkhoundMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityMyrddraalMob.class, new RenderMyrddraalMob(new MyrddraalMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityDamaneMob.class,	new RenderDamaneMob(new DamaneMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityWhitecloakMob.class,	new RenderWhitecloakMob(new WhitecloakMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityAshamanMob.class, new RenderAshamanMob(new AshamanMob(), 0));
				RenderingRegistry.registerEntityRenderingHandler(EntityGaraMob.class, new RenderGaraMob(new GaraMob(),0));
				RenderingRegistry.registerEntityRenderingHandler(EntityTormMob.class, new RenderTormMob(new TormMob(),0));
				RenderingRegistry.registerEntityRenderingHandler(EntityDeathwatchMob.class, new RenderDeathwatchMob (new DeathwatchMob(),0));

	}

}
