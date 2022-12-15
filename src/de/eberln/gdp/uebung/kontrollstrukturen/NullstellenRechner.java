package de.eberln.gdp.uebung.kontrollstrukturen;

public class NullstellenRechner {

	public NullstellenRechner() {
		
	}
	
	public double[] nullstellenBerechnen(double a, double b, double c) {

		if(a == 0 && b == 0 && c == 0) {
			System.out.println("Es gibt unendlich viele Loesungen");
			return new double[]{Double.NaN, Double.NaN};
		}
		if(a == 0 && b == 0) {
			System.out.println("Es gibt keine Lösung");
			return new double[]{Double.NaN, Double.NaN};
		}
		if(a == 0 && b != 0) {
			return new double[]{((-1 * c) / b), Double.NaN};
		}

		double[] loesungen = new double[2];

		double diskriminante = Math.pow(b, 2) - 4*a*c;

		if(diskriminante < 0) {
			loesungen[0] = Double.NaN;
			loesungen[1] = Double.NaN;
		}else{
		
			loesungen[0] = (-1 * b + Math.sqrt(diskriminante)) / (2*a);
			loesungen[1] = (-1 * b - Math.sqrt(diskriminante)) / (2*a);
		}

		return loesungen;

	
	}


}
