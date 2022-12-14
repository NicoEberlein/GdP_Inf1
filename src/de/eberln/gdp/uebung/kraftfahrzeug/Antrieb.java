package de.eberln.gdp.uebung.kraftfahrzeug;

import java.io.Serializable;

public class Antrieb implements Serializable{
	
	public enum Antriebsart{
		ELEKTRO,
		DIESEL,
		BENZIN,
		ERDGAS
	}
	
	public enum Einheit{
		PS,
		KW
	}
	
	private Antriebsart antriebsart;
	
	private Einheit einheit;
	private double leistung;
	
	public Antrieb(Antriebsart antriebsart, Einheit einheit, double leistung) {
		
		this.einheit = einheit;
		this.antriebsart = antriebsart;
		this.leistung = leistung;
		
	}

	public Antriebsart getAntriebsart() {
		return antriebsart;
	}

	public void setAntriebsart(Antriebsart antriebsart) {
		this.antriebsart = antriebsart;
	}

	public Einheit getEinheit() {
		return einheit;
	}

	public void setEinheit(Einheit einheit) {
		this.einheit = einheit;
	}

	public double getLeistung() {
		return leistung;
	}

	public void setLeistung(double leistung) {
		this.leistung = leistung;
	}
	
	
}

	