package de.eberln.gdp.klausurvorbereitung.stoehrss2013;

public class Aufgabe1 {

	public int getTop10(int[] a, int[] b) {
		
		return getMaxSpezial(a) + getMaxSpezial(b);
		
	}
	
	private int getMaxSpezial(int[] a) {
		
		int max = 0;
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i] % 10 == 0) {
				
				if(a[i] > max) {
					
					max = a[i];
					
				}
				
			}
			
		}
		
		return max;
		
	}
	
}
