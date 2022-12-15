package de.eberln.gdp.uebung.operatoren;

public class Wahrheit{

	public static void printWahrheit() {

	int m = 1, n = -1;
	boolean a = true, b = false;

	System.out.println(a && b);
	//false

	System.out.println(!a || b && a || !b);
	// true

	System.out.println(!a || !b || m < n);
	//false || true || false
	//=> true

	System.out.println(m > n || m == n && m > n);
	
	//true || false && true
	//=> true

	}

}
