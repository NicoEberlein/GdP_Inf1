package de.eberln.gdp.uebung.aufgabenverwaltung;

import java.io.Serializable;

public class Datum implements Serializable{

	private int tag;
	private int monat;
	private int jahr;
	
	public Datum(int tag, int monat, int jahr) {
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		this.monat = monat;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	@Override
	public String toString() {
		return tag + "." + monat + "." + jahr;
	}
	
	
	
}
