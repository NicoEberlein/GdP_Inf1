package de.eberln.gdp.uebung.operatoren;

import java.math.BigInteger;

public class Schaltjahrrechner {

	public static void printIstSchaltjahr(int jahr) {
		
		boolean istSchaltjahr = (jahr % 4 == 0) && (jahr % 100 != 0 || jahr % 400 == 0);
		
		System.out.printf("%d is %sa leap year", jahr, istSchaltjahr ? "":"not ");
		
	}
	
	//BigInteger hier sinnlos, da dieser Ansatz nur unnötig Overhead und Programmieraufwand erzeugt
	
	public static void printIstSchaltjahr(BigInteger jahr) {
		
		boolean istSchaltjahr = 
				jahr.mod(BigInteger.valueOf(4)).intValue() == 0
				&& (jahr.mod(BigInteger.valueOf(100)).intValue() != 0 || jahr.mod(BigInteger.valueOf(400)).intValue() == 0);
		
		System.out.printf("%d is %sa leap year", jahr.intValue(), istSchaltjahr ? "":"not ");
		
	}
	
	public static boolean istSchaltjahr(int jahr) {
		
		return (jahr % 4 == 0) && (jahr % 100 != 0 || jahr % 400 == 0);
		
	}
	
	
}
