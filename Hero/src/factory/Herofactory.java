package factory;

import hero.Hero; 
import hero.Meleehero;
import hero.Rangehero;

public class Herofactory {

	public Herofactory() {
		// TODO Auto-generated constructor stub
	}

	public Hero createMeleehero(String type, String name, int damage, int range) {
		return new Meleehero(type,  name, damage, range);
	}
	
	public Hero createRangehero(String type, String name, int damage, int range ) {
		return new Rangehero(type, name, damage, range);
	}
}
