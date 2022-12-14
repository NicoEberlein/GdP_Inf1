package de.eberln.gdp.vorlesung.methodenundfunktionen;

public class Hanoi{

	public static void main(String[] args) {
		
		hanoi(Integer.parseInt(args[0]), 'A', 'B', 'C');

	}

	private static void hanoi(int n, char x, char y, char z) {

		if(n == 1) {
			System.out.println("Scheibe "+n+" von "+x+" nach "+y);
		}else{
			hanoi(n-1, x,z,y);
			System.out.println("Scheibe "+n+" von "+x+" nach "+y);
			hanoi(n-1, z,y,x);
		}

	}


}
