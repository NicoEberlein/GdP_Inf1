package de.eberln.gdp.vorlesung.operatoren;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Addieren{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		try{
			System.out.println("Ersten Summanden eingeben:");
			int sum1 = scanner.nextInt();

			System.out.println("Zweiten Summanden eingeben:");
			int sum2 = scanner.nextInt();

			int summe = sum1 + sum2;
			System.out.println("Ergebnis: " + summe);

		}catch(InputMismatchException e) {

			System.out.println("Fehler bei Verarbeitung von Eingabe. Bitte nur Ganzzahlen eingeben.");
		
		}finally{
		
			scanner.close();
		
		}

	}

}
