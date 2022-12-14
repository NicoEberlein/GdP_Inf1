package de.eberln.gdp.vorlesung.grundlagen;

public class Hello{

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Es wurden keine Argumente uebergeben");
		}else{
			System.out.println("Hallo Welt! Diese Testklasse wurde mit folgenden Argumenten aufgerufen:");
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
			}
		}

	}
}
