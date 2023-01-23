package de.eberln.gdp;

import java.util.Arrays;

import de.eberln.gdp.klausurvorbereitung.stoehrss2013.Aufgabe1;
import de.eberln.gdp.klausurvorbereitung.stoehrss2013.Aufgabe2;
import de.eberln.gdp.klausurvorbereitung.stoehrss2013.Aufgabe3;
import de.eberln.gdp.klausurvorbereitung.stoehrss2013.Aufgabe4;
import de.eberln.gdp.klausurvorbereitung.stoehrss2013.Aufgabe5;
import de.eberln.gdp.uebung.aufgabenverwaltung.DatumZeit;
import de.eberln.gdp.uebung.aufgabenverwaltung.TerminAufgabe;
import de.eberln.gdp.uebung.aufgabenverwaltung.TerminAufgabe.Prioritaet;
import de.eberln.gdp.uebung.streams.RandomIntWriter;
import de.eberln.gdp.vorlagen.GenericArray;
import de.eberln.gdp.vorlesung.bookexample.Book;
import de.eberln.gdp.vorlesung.bookexample.DVD;
import de.eberln.gdp.vorlesung.methodenundfunktionen.Uebungen;

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
//		System.out.println(new Wurzelrechnung().sqrt(81, 100));
//		
//		TerminAufgabe terminAufgabe = new TerminAufgabe("Hallo", "ihr Wixer", Prioritaet.DRINGEND, new DatumZeit());
//		String[] s = new String[]{"a", "b", "c"};
//		String[] b = GenericArray.appendToArray(s, "d");
//		b = GenericArray.appendToArray(b, "dsigsf");
//		System.out.println(Arrays.toString(b));
//		
//		Uebungen u = new Uebungen();
//		
//		System.out.println(u.iterations(5));
//		
//		DVD dvd = new DVD("Avatar", 120, 5);
//		
//		System.out.println(dvd.toString());
//		
//		RandomIntWriter writer = new RandomIntWriter();
//		writer.writeIntsToFile("files/random_ints.txt");
		
		Aufgabe2 aufgabe2 = new Aufgabe2();
		Aufgabe1 aufgabe1 = new Aufgabe1();
		
		int[] arr = new int[] {1, 6, 0, 1, 1, 5, 0, 4, 1, 30, 8, 1, 0, 9};
		
		int[] arr2 = new int[] {0, 23, 10, 600, 2};
		
		//System.out.println(aufgabe2.recCount(arr, 2));
		//System.out.println(aufgabe1.getTop10(arr, arr2));
		
		Aufgabe3 aufgabe3 = new Aufgabe3();
		System.out.println(aufgabe3.reverseString("abcdefg"));
		
		Integer a = 2345;
		
		Aufgabe4 aufgabe4 = new Aufgabe4();
		
		//System.out.println(aufgabe4.count42(45411042));
		
		Aufgabe5 aufgabe5 = new Aufgabe5();
		
		aufgabe5.printFibo(300);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

			
		
	}
	
}
