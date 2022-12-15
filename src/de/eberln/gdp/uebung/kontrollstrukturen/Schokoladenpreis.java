package de.eberln.gdp.uebung.kontrollstrukturen;

public class Schokoladenpreis {

	public static void schokoladenPreisAusgaben(int anzahl) {
		
		if(anzahl > 0) {
			
			double preis = anzahl * 0.79;
			int rabatt = 0;
			
			if(anzahl >= 5 && anzahl < 10 ) {
				
				preis = preis - preis * 0.1;
				rabatt = 10;
				
			}else if(anzahl >= 10) {
				
				preis = preis - preis * 0.2;
				rabatt = 20;
				
			}
			
			System.out.printf("Der Preis für %d Schokoladen betraegt %.2f€\nIm Preis inbegriffen sind %d%% Mengenrabatt.", anzahl, preis, rabatt);
			
		}else {
			System.out.println("Die Anzahl gekaufter Schokoladen muss groeßer als 0 sein.");
		}
		
	}
	
}
