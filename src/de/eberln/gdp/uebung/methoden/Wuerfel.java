package de.eberln.gdp.uebung.methoden;

public class Wuerfel{

	public Wuerfel(int min, int max) {

		System.out.println(random(min, max));

	} 

	private int random(int min, int max) {

		return min + (int)(Math.random() * ((max - min) + 1));

	}


}
