package de.eberln.gdp.uebung.kraftfahrzeug;

import java.io.Serializable;

public class Gewicht implements Serializable{

	public enum Einheit{
		KG,
		LBS
	}
	
	private Einheit einheit;
	private double gewicht;
	
	public Gewicht(double gewicht, Einheit einheit) {
		
		this.gewicht = gewicht;
		this.einheit = einheit;
		
	}

	public Einheit getEinheit() {
		return einheit;
	}

	public void setEinheit(Einheit einheit) {
		this.einheit = einheit;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
}
