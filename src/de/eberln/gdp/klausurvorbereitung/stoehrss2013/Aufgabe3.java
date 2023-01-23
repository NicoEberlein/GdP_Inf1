package de.eberln.gdp.klausurvorbereitung.stoehrss2013;

public class Aufgabe3 {

	public String reverseString(String aStr) {
		
		if(aStr.toCharArray().length == 1) {
			return aStr;
		}else {
			
			char[] reduced = new char[aStr.toCharArray().length -1];
			
			for(int i = 0; i<aStr.toCharArray().length-1;i++) {
				
				reduced[i] = aStr.toCharArray()[i];
				
			}
			
			String returnEnd = reverseString(new String(reduced));
			
			return aStr.toCharArray()[aStr.toCharArray().length -1] + returnEnd;
		}
		
		
	}
	
	
}
