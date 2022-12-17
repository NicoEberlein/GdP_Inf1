package de.eberln.gdp.uebung.aufgabenverwaltung;

import java.io.Serializable;

public class TerminAufgabe extends Aufgabe implements Serializable{
	
	private Prioritaet prioritaet;
	
	private DatumZeit alarm;
	
	public enum Prioritaet{
		NORMAL,
		WICHTIG,
		DRINGEND
	}
	
	public TerminAufgabe(String titel, String beschreibung, Prioritaet prioritaet, DatumZeit datumZeit) {
		super(titel, beschreibung);
		this.prioritaet = prioritaet;
		this.alarm = datumZeit;
	}
	
	public Prioritaet prioritaet() {
		return prioritaet;
	}
	
	@Override
	public String toString() {
		return super.titel() + ": " + super.beschreibung() + " am " + alarm.getDatum() + " mit der Priorität " + prioritaet;
	}

	
	
}
