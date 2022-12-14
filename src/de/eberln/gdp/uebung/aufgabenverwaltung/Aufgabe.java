package de.eberln.gdp.uebung.aufgabenverwaltung;

public abstract class Aufgabe {

	private String titel;
	
	private String beschreibung;

	public String titel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String beschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	
	
}
