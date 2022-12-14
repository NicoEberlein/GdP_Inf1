package de.eberln.gdp.vorlesung.methodenundfunktionen;

import java.lang.Exception;
import java.util.Scanner;

public class PositivNegativNullScanner{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try{

			double num = scanner.nextDouble();

			if(num > 0) {
				System.out.println("Die Zahl ist positiv.");
			}else if(num < 0) {
				System.out.println("Die Zahl ist negativ.");
			}else{
				System.out.println("Die Zahl ist 0.");
			}	
		
		}catch(Exception e) {
			System.err.println("An error occured");
		}finally{
			scanner.close();
		}

	}

}
