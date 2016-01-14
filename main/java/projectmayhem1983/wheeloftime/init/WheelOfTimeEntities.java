package projectmayhem1983.wheeloftime.init;

import projectmayhem1983.wheeloftime.entities.creatures.Gara.EntityGara;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.EntityGoat;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.EntityMotai;
import projectmayhem1983.wheeloftime.entities.creatures.Torm.EntityTorm;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAiel;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.EntityAshaman;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.EntityDamane;
import projectmayhem1983.wheeloftime.entities.mobs.Darkhound.EntityDarkhound;
import projectmayhem1983.wheeloftime.entities.mobs.Deatchwatch.EntityDeathwatch;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraal;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrolloc;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.EntityWhitecloak;

public class WheelOfTimeEntities {
	
	public static void init(){
		
		
		//Animal
		EntityMotai.WheelOfTime();
		EntityGoat.WheelOfTime();
		EntityTorm.WheelOfTime();
		
		//Passive
		EntityAiel.WheelOfTime();
		EntityWhitecloak.WheelOfTime();
		EntityAshaman.WheelOfTime();
		EntityDeathwatch.WheelOfTime();

		//Hostile
		EntityTrolloc.WheelOfTime();
		EntityDarkhound.WheelOfTime();
		EntityMyrddraal.WheelOfTime();
		EntityDamane.WheelOfTime();
		EntityGara.WheelOfTime();
	}

}
