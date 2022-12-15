package de.eberln.gdp.uebung.methoden;

public class Baum{
	
	public static void printBaum(int hoehe) {
		
		int max = hoehe*2-1;

		for(int i=1;i<=max;i=i+2) {
			
			printKette('o', (max-i)/2, i);
		
		}

		for(int i=0;i<3;i++) {
		
			printKette('/', (max-3)/2, 3);

		}
		
	}

	private static void printKette(char c, int start, int length) {

		printChar(' ', start);
		printChar(c, length);
		printChar(' ', start);
		System.out.printf("\n");

	}

	public static void printChar(char c, int count) {
		for(int i=0;i<count;i++) {
			System.out.print(c);
		}
	}

}
