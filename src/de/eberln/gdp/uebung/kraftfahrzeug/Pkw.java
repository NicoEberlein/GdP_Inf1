package de.eberln.gdp.uebung.kraftfahrzeug;

import de.eberln.gdp.uebung.kraftfahrzeug.Antrieb.Antriebsart;
import de.eberln.gdp.uebung.kraftfahrzeug.Antrieb.Einheit;

public class Pkw extends Kraftfahrzeug{

	private String farbe;
	
	private int anzahlSitze;
	
	public Pkw(Gewicht gewicht, Antrieb antrieb, Geschwindigkeit vMax, Gewicht mMax, String farbe, int anzahlSitze) {
		
		super(gewicht, antrieb, vMax, mMax);
		
		this.farbe = farbe;
		this.anzahlSitze = anzahlSitze;
		
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getAnzahlSitze() {
		return anzahlSitze;
	}

	public void setAnzahlSitze(int anzahlSitze) {
		this.anzahlSitze = anzahlSitze;
	}
	
	
	public static void main(String[] args) {
		
		Pkw tesla = new Pkw(
				new Gewicht(1230.5, Gewicht.Einheit.KG),
				new Antrieb(Antrieb.Antriebsart.ELEKTRO, Antrieb.Einheit.KW, 450),
				new Geschwindigkeit(250, Geschwindigkeit.Einheit.KMH),
				new Gewicht(450, Gewicht.Einheit.KG),
				"Weiss",
				5);
		
		Pkw opel = new Pkw(
				new Gewicht(
					1050.5, Gewicht.Einheit.KG),
					new Antrieb(Antriebsart.BENZIN, Antrieb.Einheit.PS, 110),
					new Geschwindigkeit(130, Geschwindigkeit.Einheit.KMH),
					new Gewicht(450, Gewicht.Einheit.KG),
					"Rot",
					5);
		
		System.out.println(tesla.vergleiche(opel.getGewicht()));
		
	}
}
