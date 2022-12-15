package de.eberln.gdp.uebung.operatoren;

import java.math.BigDecimal;

public class Temperaturumrechner {

	public static double convertCelsiusToFahrenheit(double celsius) {
		
		return celsius * 1.8 + 32;
		
	}
	
	
	//BigInteger hier (wenn keine Kerntemperaturen von Sonnen umgerechnet werden sollen) sinnlos,
	//da dieser Ansatz nur unnötig Overhead und Programmieraufwand erzeugt
	
	public static BigDecimal convertCelsiusToFahrenheit(BigDecimal celsius) {
		
		return celsius.multiply(BigDecimal.valueOf(1.8)).add(BigDecimal.valueOf(32));
		
	}
	
}
