package de.eberln.gdp.uebung.kontrollstrukturen;

public class GrossesEinmaleins{

	public static void printGrossesEinmaleins() {

		for(int i=10;i<21;i++){
			System.out.println(i+":");
			System.out.println("___");

			for(int j=1;j<11;j++){
				System.out.printf("%2d X %2d = %3d\n", j, i, j*i);
			}

			System.out.println("===============");
		}

	}

}
