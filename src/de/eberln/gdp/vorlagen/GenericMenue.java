/**
 * @author neberlein
 */

package de.eberln.gdp.vorlagen;

import java.util.Scanner;

public class GenericMenue {

	public void hauptmenue() {
		
		boolean abbruch = false;
		
		while(!abbruch) {
			System.out.println("==============================");
			System.out.println("Bitte waehlen Sie eine Option:");
			System.out.println("(1) ");
			System.out.println("(2) ");
			System.out.println("(3) ");
			System.out.println("(4) ");
			System.out.println("(5) ");
			
			String eingabe = eingabeEinlesen();
			if(eingabe.equals("1")) {
				
				//doSomething 1
				
			}else if(eingabe.equals("2")) {
				
				//doSomething 2
				
			}else if(eingabe.equals("3")) {
				
				//doSomething 3
				
			}else if(eingabe.equals("4")) {
				
				//doSomething 4
				
			}else if(eingabe.equals("5")) {
				//Abbruch
				System.out.println("Programm wird beendet");
				abbruch = true;
			}else {
				errorDrucken();
			}
		}
		
	}
	
	
	private String eingabeEinlesen() {
		
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
		
	}
	
	private void errorDrucken() {
		System.out.println("Ungueltige Eingabe");
	}
	
	
}

