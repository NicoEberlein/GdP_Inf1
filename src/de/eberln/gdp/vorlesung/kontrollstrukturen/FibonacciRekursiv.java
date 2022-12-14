package de.eberln.gdp.vorlesung.kontrollstrukturen;

public class FibonacciRekursiv{

	public static void main(String[] args) {
		
		fibonacciCalc(1, 1, Integer.parseInt(args[0]));

	}

	public static void fibonacciCalc(double fibVor, double fib, int count) {
		if(count > 0) {
			fibonacciCalc(fib, fib+fibVor, count-1);
		}else{
			System.out.println(fib);
		}

	}

}
