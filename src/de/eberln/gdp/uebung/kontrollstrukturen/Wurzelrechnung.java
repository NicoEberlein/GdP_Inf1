package de.eberln.gdp.uebung.kontrollstrukturen;

public class Wurzelrechnung{

	public Wurzelrechnung() {
		
	}
	
	public double sqrt(double a, int iterations) {
		double xn = (a+1)/2;
		return heron(a, xn, iterations);
	}
	
	private double heron(double x0, double xn, int iterations) {

		if(iterations == 0) {
			return xn;
		}else{
			xn = 0.5 * (xn + x0/xn);
			return heron(x0, xn, --iterations);
		}

	}


}
