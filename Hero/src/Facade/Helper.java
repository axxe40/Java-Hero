package Facade;

import java.util.Scanner;

public class Helper {
	 Scanner sc = new Scanner(System.in);
	 
	 private static Helper instance;
	    public static Helper getInstance() {
	    if (instance == null) instance = new Helper();
	    return instance;
	    }
	    
	    
	 public void clrscrn() {
		 for (int i = 0; i < 33; i++) {
			System.out.println();		
		}
	 }
	 
	 public void enter() {
		 System.out.println("Press enter to continue...");
		 String enter = sc.nextLine();
	 }
	    
}
