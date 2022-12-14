package de.eberln.gdp.uebung.kraftfahrzeug;

public interface Vergleichbar {

	public int vergleiche(Gewicht gewicht);
	
	public int vergleiche(Geschwindigkeit v);
	
	public int vergleiche(Antrieb antrieb);
	
}
