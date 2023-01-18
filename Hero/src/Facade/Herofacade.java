package Facade;

import java.util.ArrayList;   
import java.util.Scanner; 

import factory.Herofactory;
import hero.Hero;

public class Herofacade {
    Scanner sc = new Scanner (System.in);
    
    private static Herofacade instance;
    
    public static  Herofacade getInstance() {
    	if (instance == null) instance = new Herofacade(); {
			return instance;
		}
    }
    
    public Herofacade(){
    	
    }
    
    public void viewHeroes (ArrayList <Hero> list) {
     for (Hero hero : list) {
    	 System.out.println("===========================");
    	 System.out.println("hero name : " + hero.name);
    	 System.out.println("hero type : " + hero.type);
    	 System.out.println("hero damage : " + hero.damage);
    	 System.out.println("hero range : " +hero.range);
     }
    }
    

	public Hero createHero() {
		Herofactory factory = new Herofactory();
		String name;
		String type;
		int damage;
		int range;
		while(true) {
			System.out.print("Input hero name [max 25 char] [ends with 'hero']: ");
			name = sc.nextLine();
			if(name.length() > 1 && name.length() <= 25 && name.endsWith("hero")) break;
		}
		while(true) {
			System.out.print("Input hero type [ \"melee\" or \"range\"]: ");
			type = sc.nextLine();
			if(type.equals("melee") || type.equals("range")) break;
		}
		while(true) {
			System.out.print("Input hero damage [10 - 150]: ");
			damage = sc.nextInt();
			sc.nextLine();
			if(damage >= 10 && damage <= 150) break;
		}
		while(true) {
			System.out.print("Input hero range [10 - 50]: ");
			range = sc.nextInt();
			sc.nextLine();
			if(range >= 10 && range <= 50) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("Succesfully added Hero");
		System.out.println("Press enter to continue"); sc.nextLine();
		
		
		if (type.equals("melee")) {
			return factory.createMeleehero(type, name, damage, range);
		} else {
	        return factory.createRangehero(type, name, damage, range);
		}
		
	}

}
