package de.eberln.gdp.uebung.aufgabenverwaltung;

public class TerminAufgabe {

	private Prioritaet prioritaet;
	
	private DatumZeit alarm;
	
	public enum Prioritaet{
		NORMAL,
		WICHTIG,
		DRINGEND
	}
	
	public Prioritaet prioritaet() {
		return prioritaet;
	}
	
	
}
