package de.eberln.gdp.uebung.aufgabenverwaltung;

import java.io.File;
import java.util.Scanner;

import de.eberln.gdp.uebung.aufgabenverwaltung.TerminAufgabe.Prioritaet;
import de.eberln.gdp.vorlagen.ObjectDeSerializer;

public class AufgabenVerwaltung {

	private Aufgabe[] aufgaben;
	private int currentIndex = 0;
	
	private final String persistentFile = "files/aufgaben_persistent.txt";
	private ObjectDeSerializer objectDeSerializer;
	
	public AufgabenVerwaltung() {
		
		objectDeSerializer = new ObjectDeSerializer();
		
		Aufgabe[] gespeicherteAufgaben = (Aufgabe[]) objectDeSerializer.readObjectFromFile(new File(persistentFile));
		
		if(gespeicherteAufgaben != null) {
			
			this.aufgaben = gespeicherteAufgaben;
			
			for(Aufgabe aufgabe : aufgaben) {
				if(aufgabe != null) {
					currentIndex++;
				}
			}
			
		}else {
			
			aufgaben = new Aufgabe[100];
			
		}
	}
	
	
	public void hauptmenue() {
	
		boolean abbruch = false;
		
		while(!abbruch) {
			System.out.println("==============================");
			System.out.println("Bitte waehlen Sie eine Option:");
			System.out.println("(1) Neue Aufgabe erstellen");
			System.out.println("(2) Alle Aufgaben drucken");
			System.out.println("(3) Nach Aufgaben suchen");
			System.out.println("(4) Beenden und Aufgaben speichern");
			System.out.println("(5) Ohne Speichern beenden");
			
			String eingabe = eingabeEinlesen();
			if(eingabe.equals("1")) {
				neuMenue();
			}else if(eingabe.equals("2")) {
				druckenMenue();
			}else if(eingabe.equals("3")) {
				suchenMenue();
			}else if(eingabe.equals("4")) {
				objectDeSerializer.writeObjectToFile(new File(persistentFile), aufgaben);
				abbruch = true;
			}else if(eingabe.equals("5")) {
				System.out.println("Programm wird beendet");
				abbruch = true;
			}else {
				errorDrucken();
			}
		}
		
	}
	
	protected void neuMenue() {
		System.out.println("Geben Sie einen Titel fuer die Aufgabe ein:");
		String titel = eingabeEinlesen();
		
		System.out.println("Geben Sie eine Beschreibung ein:");
		String beschreibung = eingabeEinlesen();
		
		System.out.println("Wollen Sie eine Tagesaufgabe(1) oder eine Terminaufgabe(2) erstellen?");
		String eingabe = eingabeEinlesen();
		
		if(eingabe.equals("1")) {
			Datum datum = datumEinlesen();
			
			TagesAufgabe tagesAufgabe = new TagesAufgabe(titel, beschreibung, datum);
			
			appendAufgabe(tagesAufgabe);
			
		}else if(eingabe.equals("2")) {
			
			System.out.println("Bitte geben Sie eine Prioritaet an: (NORMAL, WICHTIG, DRINGEND");
			String prioritaetString = eingabeEinlesen();
			Prioritaet prioritaet = null;
			
			if(prioritaetString.equalsIgnoreCase("NORMAL")) {
				prioritaet = Prioritaet.NORMAL;
			}else if(prioritaetString.equalsIgnoreCase("WICHTIG")) {
				prioritaet = Prioritaet.WICHTIG;
			}else if(prioritaetString.equalsIgnoreCase("DRINGEND")) {
				prioritaet = Prioritaet.DRINGEND;
			}else {
				errorDrucken();
			}
			
			Datum datum = datumEinlesen();
			
			System.out.println("Bitte geben Sie eine Zeit in der Form hh:mm an");
			String[] zeitStringArray = eingabeEinlesen().split(":");
			Zeit zeit = new Zeit(Integer.parseInt(zeitStringArray[0]), Integer.parseInt(zeitStringArray[1]));
			
			TerminAufgabe terminAufgabe = new TerminAufgabe(titel, beschreibung, prioritaet, new DatumZeit(datum, zeit));
			
			appendAufgabe(terminAufgabe);
			
		}else {
			errorDrucken();
		}
	}
	
	protected void druckenMenue() {
		if(aufgaben[0] == null) {
			System.out.println("Es sind noch keine Aufgaben vorhanden.");
		}else {
		
			for(Aufgabe aufgabe : aufgaben) {
				if(aufgabe != null) {
					if(aufgabe instanceof TerminAufgabe) {
						System.out.println(((TerminAufgabe) aufgabe));
					}else if(aufgabe instanceof TagesAufgabe) {
						System.out.println(((TagesAufgabe) aufgabe));
					}
				}	
			}
			
		}
	}
	
	protected void suchenMenue() {
		System.out.println("Suchbegriff:");
		String suchbegriff = eingabeEinlesen();
		
		for(Aufgabe aufgabe : aufgaben) {
			if(aufgabe != null) {
			
				if(aufgabe.titel().contains(suchbegriff) || aufgabe.beschreibung().contains(suchbegriff)) {
					System.out.println(aufgabe);
				}
				
			}
		}
	}
	
	private String eingabeEinlesen() {
		
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
		
	}
	
	private Datum datumEinlesen() {
		
		System.out.println("Bitte geben Sie ein Datum in der Form dd.MM.yyyy an");
		String[] datumStringArray = eingabeEinlesen().split("\\.");
		return new Datum(Integer.parseInt(datumStringArray[0]), Integer.parseInt(datumStringArray[1]), Integer.parseInt(datumStringArray[2]));
		
	}
	
	private void errorDrucken() {
		System.out.println("Ungueltige Eingabe");
	}
	
	private void appendAufgabe(Aufgabe aufgabe) {
		aufgaben[currentIndex] = aufgabe;
		currentIndex++;
	}
	
	
}
