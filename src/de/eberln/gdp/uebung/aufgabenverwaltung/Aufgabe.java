package de.eberln.gdp.uebung.aufgabenverwaltung;

public abstract class Aufgabe implements Vergleichbar{

	private String titel;
	
	private String beschreibung;

	protected Aufgabe(String titel, String beschreibung) {
		this.titel = titel;
		this.beschreibung = beschreibung;
	}
	
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
	
	public int vergleiche(Aufgabe aufgabe) {
		return this.titel().compareTo(aufgabe.titel());
	}
	
	@Override
	public String toString() {
		return titel + ": " + beschreibung;
	}
	
	
	
}
