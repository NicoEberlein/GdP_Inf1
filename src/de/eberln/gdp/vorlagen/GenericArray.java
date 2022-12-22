/**
 * @author: neberlein | nico.eberlein@hof-university.de
 */

package de.eberln.gdp.vorlagen;

public class GenericArray {

	public static String[] appendToArray(String[] array, String s) {
		
		int currentIndex = 0;
		
		try {
			while(array[currentIndex] != null) {
				currentIndex++;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			//Array voll
			array = extendArray(array);
		}
		
		array[currentIndex] = s;
		return array;
		
	}
	
	private static String[] extendArray(String[] array) {
		String[] newArray = new String[array.length * 2];
		for(int i = 0; i<array.length;i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	
	
}
