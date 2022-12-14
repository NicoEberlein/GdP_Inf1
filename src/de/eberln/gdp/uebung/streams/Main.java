package de.eberln.gdp.uebung.streams;

import de.eberln.gdp.uebung.kraftfahrzeug.Antrieb;
import de.eberln.gdp.uebung.kraftfahrzeug.Geschwindigkeit;
import de.eberln.gdp.uebung.kraftfahrzeug.Gewicht;
import de.eberln.gdp.uebung.kraftfahrzeug.Kraftfahrzeug;

public class Main {

	public static void main(String[] args) {
		
		//new LoremIpsumReader(args[0]);
		
		//new LoremIpsumReverseReader(args[0]);
		
		Kraftfahrzeug kraftfahrzeug = new Kraftfahrzeug(
				new Gewicht(1349.3, Gewicht.Einheit.KG),
				new Antrieb(Antrieb.Antriebsart.BENZIN, Antrieb.Einheit.KW, 321.9),
				new Geschwindigkeit(240.0, Geschwindigkeit.Einheit.KMH),
				new Gewicht(340, Gewicht.Einheit.KG)
		);
		
		ObjectDeSerializer ser = new ObjectDeSerializer();
		//ser.writeObjectToFile("test.txt", kraftfahrzeug);
		
		/*Object obj = ser.readObjectFromFile("test.txt");
		Kraftfahrzeug k = (Kraftfahrzeug) obj;
		System.out.println(k.getAntrieb().getLeistung());
		System.out.println(k.getAntrieb().getAntriebsart());*/
		
		
	}
	
}
