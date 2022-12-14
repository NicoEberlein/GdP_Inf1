package de.eberln.gdp.vorlesung.methodenundfunktionen;

public class Fibonacci{

	public static void main(String[] args) {
		System.out.println(fibonacci(Long.parseLong(args[0])));
	}

	public static long fibonacci(long n) {
  	
		if(n == 0) {
    			return 0;
  		}else if(n == 1){
    			return 1;
  		}else{

			long fib1 = fibonacci(n-1);
			long fib2 = fibonacci(n-2);
    			return fib1 + fib2;
  		}
	}

}
