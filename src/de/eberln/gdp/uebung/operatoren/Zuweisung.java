package de.eberln.gdp.uebung.operatoren;

public class Zuweisung{

	public static void printZuweisungen() {

		int x,z = 10;

		System.out.println(x = z++);  //10; x=10,z=11
		System.out.println(z = ++x);  //11; x=11,z=11
		System.out.println(x += ++z); //23; x=23,z=12
		System.out.println(z += x++); //35; x=24,z=35
	}

}
