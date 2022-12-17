package de.eberln.gdp.uebung.aufgabenverwaltung;

import java.io.Serializable;

public class DatumZeit implements Serializable{

	private Datum datum;
	private Zeit zeit;
	
	public DatumZeit(Datum datum, Zeit zeit) {
		this.datum = datum;
		this.zeit = zeit;
	}
	
	public void setTag(int tag) {
		datum.setTag(tag);
	}
	public void setMonat(int monat) {
		datum.setMonat(monat);
	}
	public void setJahr(int jahr) {
		datum.setJahr(jahr);
	}
	public void setStunde(int stunde) {
		zeit.setStunde(stunde);
	}
	public void setMinute(int minute) {
		zeit.setMinute(minute);
	}
	
	public int getTag() {
		return datum.getTag();
	}
	public int getMonat() {
		return datum.getMonat();
	}
	public int getJahr() {
		return datum.getJahr();
	}
	public int getStunde() {
		return zeit.getStunde();
	}
	public int getMinute() {
		return zeit.getMinute();
	}

	public Datum getDatum() {
		return datum;
	}

	public void setDatum(Datum datum) {
		this.datum = datum;
	}

	public Zeit getZeit() {
		return zeit;
	}

	public void setZeit(Zeit zeit) {
		this.zeit = zeit;
	}
	
	
}
