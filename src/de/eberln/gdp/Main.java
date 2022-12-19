package de.eberln.gdp;

import java.math.BigInteger;
import java.util.Arrays;

import de.eberln.gdp.uebung.aufgabenverwaltung.AufgabenVerwaltung;
import de.eberln.gdp.uebung.kontrollstrukturen.GrossesEinmaleins;
import de.eberln.gdp.uebung.kontrollstrukturen.NullstellenRechner;
import de.eberln.gdp.uebung.kontrollstrukturen.Schokoladenpreis;
import de.eberln.gdp.uebung.kontrollstrukturen.Wurzelrechnung;
import de.eberln.gdp.uebung.kraftfahrzeug.Antrieb;
import de.eberln.gdp.uebung.kraftfahrzeug.Geschwindigkeit;
import de.eberln.gdp.uebung.kraftfahrzeug.Gewicht;
import de.eberln.gdp.uebung.kraftfahrzeug.Kraftfahrzeug;
import de.eberln.gdp.uebung.operatoren.Schaltjahrrechner;
import de.eberln.gdp.uebung.operatoren.Temperaturumrechner;
import de.eberln.gdp.uebung.streams.LoremIpsumReader;
import de.eberln.gdp.uebung.streams.LoremIpsumReverseReader;
import de.eberln.gdp.vorlagen.ObjectDeSerializer;

public class Main {

	public static void main(String[] args) {
		
//		new LoremIpsumReader(args[0]);
//		
//		new LoremIpsumReverseReader(args[0]);
//		
//		Kraftfahrzeug kraftfahrzeug = new Kraftfahrzeug(
//				new Gewicht(1349.3, Gewicht.Einheit.KG),
//				new Antrieb(Antrieb.Antriebsart.BENZIN, Antrieb.Einheit.KW, 321.9),
//				new Geschwindigkeit(240.0, Geschwindigkeit.Einheit.KMH),
//				new Gewicht(340, Gewicht.Einheit.KG)
//		);
//		
//		ObjectDeSerializer ser = new ObjectDeSerializer();
//		ser.writeObjectToFile("files/test.txt", kraftfahrzeug);
//		
//		Object obj = ser.readObjectFromFile("files/test.txt");
//		Kraftfahrzeug k = (Kraftfahrzeug) obj;
//		System.out.println(k.getAntrieb().getLeistung());
//		System.out.println(k.getAntrieb().getAntriebsart());
//		
//		Schaltjahrrechner.istSchaltjahr(BigInteger.valueOf(2004));
//		Temperaturumrechner.convertCelsiusToFahrenheit(-80);
//		Schokoladenpreis.schokoladenPreisAusgaben(20);
//		
//		NullstellenRechner nullstellenRechner= new NullstellenRechner();
//		System.out.println(Arrays.toString(nullstellenRechner.nullstellenBerechnen(1, -8, 15)));	
//		System.out.println(Arrays.toString(nullstellenRechner.nullstellenBerechnen(9, 6, 1)));	
//		System.out.println(Arrays.toString(nullstellenRechner.nullstellenBerechnen(3, 2, 7)));	
//		System.out.println(Arrays.toString(nullstellenRechner.nullstellenBerechnen(0, 0, 0)));	
//		System.out.println(Arrays.toString(nullstellenRechner.nullstellenBerechnen(0, 3, 2)));	
//		System.out.println(Arrays.toString(nullstellenRechner.nullstellenBerechnen(0, 0, 5)));	
		
//		GrossesEinmaleins.printGrossesEinmaleins();
		//System.out.println(new Wurzelrechnung().sqrt(81, 100));
		
		AufgabenVerwaltung aufgabenVerwaltung = new AufgabenVerwaltung();
		aufgabenVerwaltung.hauptmenue();
	}
	
}
