package de.eberln.gdp.vorlesung.methodenundfunktionen;

public class PositivNegativNullArgument{

	public static void main(String[] args) {

		double num = Double.parseDouble(args[0]);

		if(num > 0) {
			System.out.println("Die Zahl ist positiv.");
		}else if(num < 0) {
			System.out.println("Die Zahl ist negativ.");
		}else{
			System.out.println("Die Zahl ist 0.");
		}	
	}

}
