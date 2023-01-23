package de.eberln.gdp.klausurvorbereitung.stoehrss2013;

import java.util.Arrays;

public class Aufgabe4 {

	public int count42(int aNr) {
		
		int count = 0;
		
		String aStr = new Integer(aNr).toString();
		char[] charArray = aStr.toCharArray();

		
		try {
			
			for(int i = 0;i<charArray.length;i++) {
				
				if(charArray[i] == '4') {
					if(charArray[i+1] == '2') {
						
						count++;
						
					}
				}
				
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			return count;
		}
		
		return count;
		
	}
	
}
