package de.eberln.gdp.vorlesung.methodenundfunktionen;

import java.util.ArrayList;

public class Uebungen {
	
	public int count(int[] a, int n) {
		
		int count = 0;
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] == n) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public int iterations(int n) {
		
		double sum = 0;
		int iterations = 1;
		
		while(sum < n) {
			
			sum += 1 / iterations;
			
			iterations++;
			
		}
		
		return iterations;
		
	}
	
	
	
}
