package de.eberln.gdp.uebung.aufgabenverwaltung;

public class TagesAufgabe extends Aufgabe{

	private Datum datum;

	
	public int tagDerWoche() {
		return 0;
	}
	
	public int tag() {
		return datum.getTag();
	}
	
	public int monat() {
		return datum.getMonat();
	}
	
	
	public Datum getDatum() {
		return datum;
	}

	public void setDatum(Datum datum) {
		this.datum = datum;
	}
	
	
	
	
}
