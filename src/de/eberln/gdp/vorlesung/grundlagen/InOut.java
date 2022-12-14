package de.eberln.gdp.vorlesung.grundlagen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		
		int number;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte eine ganze Zahl angeben");

		try{
			number = scanner.nextInt();
			System.out.println(number + " wurde eingegeben");
		}catch(InputMismatchException e) {
			System.out.println("Bitte eine GANZE ZAHL angeben du Vollhonk");
		}finally{
			scanner.close();
		}

	}

}
