package de.eberln.gdp.vorlesung.kontrollstrukturen;

public class FibonacciIterativ{
	
	public static void main(String[] args) {
		
		new FibonacciIterativ(Integer.parseInt(args[0]));

	}

	public FibonacciIterativ(int count) {

		double fib = 1;
		double fibVor = 1;
		double temp;

		for(int i = 0;i < count; i++) {

			temp = fib + fibVor;
			fibVor = fib;
			fib = temp;

		}

		System.out.println(fib);

	}

}
