package de.eberln.gdp.uebung.kraftfahrzeug;

public class Lkw extends Kraftfahrzeug{

	private double zugKraft;
	
	public Lkw(Gewicht gewicht, Antrieb antrieb, Geschwindigkeit vMax, Gewicht mMax, String farbe, double zugKraft) {
		
		super(gewicht, antrieb, vMax, mMax);
		
		this.zugKraft = zugKraft;
		
	}
	
	
}
