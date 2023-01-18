package app;

import java.util.ArrayList;
import java.util.Scanner;

import Facade.Helper;
import Facade.Herofacade;
import hero.Hero;

public class Main {
 Scanner sc = new Scanner(System.in);
 Herofacade hero = new Herofacade();
 Helper facade = new Helper();
 
 ArrayList<Hero> heroes = new ArrayList<>();
 
 public void  showmenu(){
	 int m = 0;
	  
	  while (true) {
		  System.out.println("Customize your hero");
		  System.out.println("====================");
		  System.out.println("1. Create hero");
		  System.out.println("2. View hero");
		  System.out.println("3. Exit");
		  System.out.print(">> ");
		  m = sc.nextInt();
		 
		  
		if (m == 1) {
//			System.out.println("Create hero");
			heroes.add(hero.createHero());
			
			
		}  else if (m == 2) {
//			System.out.println("View hero");
			hero.viewHeroes(heroes);
			facade.enter();
	
		} else if (m == 3) {
			System.exit(0);
		}   else  {
			System.out.println("invalid input");
		}
		  
   }

}
 
	public Main() {
	  showmenu();
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Main();
	}

}
