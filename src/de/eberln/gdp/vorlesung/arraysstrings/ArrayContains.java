package de.eberln.gdp.vorlesung.arraysstrings;

public class ArrayContains{
	
	public static void main(String args[]) {
	
		int[] array = {3, 6, 34, 98, 1, 5, 76, 44, 76, 2};
		int n = 99;

		System.out.println(contains(n, array));

	}

	public static boolean contains(int n, int[] a) {

		boolean contains = false;

		for(int value : a) {
			if(value == n) {
				contains = true;
				break;
			}
		}

		return contains;

	}

}
