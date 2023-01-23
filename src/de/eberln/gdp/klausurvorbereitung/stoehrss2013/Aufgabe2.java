package de.eberln.gdp.klausurvorbereitung.stoehrss2013;

public class Aufgabe2 {

	public int recCount(int[] aArray, int a) {
		
		if(aArray.length == 1) {
		
			if(aArray[0] == a) return 1;
			return 0;
		
		}else {
			
			int[] reducedArray = new int[aArray.length - 1];
			
			for(int i = 0; i< reducedArray.length; i++) {
				
				reducedArray[i] = aArray[i];
				
			}
			
			int count = recCount(reducedArray, a);
			
			if(aArray[aArray.length-1] == a) return ++count;
			
			return count;
		}
		
	}
	
}
