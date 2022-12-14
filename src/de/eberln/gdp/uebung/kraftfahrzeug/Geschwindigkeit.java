package de.eberln.gdp.uebung.kraftfahrzeug;

import java.io.Serializable;

public class Geschwindigkeit implements Serializable{

	public enum Einheit{
		KMH,
		MPH
	}
	
	private Einheit einheit;
	private double geschwindigkeit;
	
	public Geschwindigkeit(double geschwindigkeit, Einheit einheit) {
		
		this.geschwindigkeit = geschwindigkeit;
		this.einheit = einheit;
		
	}

	public Einheit getEinheit() {
		return einheit;
	}

	public void setEinheit(Einheit einheit) {
		this.einheit = einheit;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}
	
	
	
	
	
}
