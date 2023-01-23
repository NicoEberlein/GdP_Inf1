package de.eberln.gdp.klausurvorbereitung.stoehrss2013;

public class Aufgabe5 {

	private int getSingleFiboRec(int n) {
		
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return getSingleFiboRec(n-1) + getSingleFiboRec(n-2);
		}
		
	}
	
	public void printFibo(int n) {
		
		for(int i = 0; i<=n; i++) {
			System.out.println(getSingleFiboRec(i));
		}
		
	}
	
}
