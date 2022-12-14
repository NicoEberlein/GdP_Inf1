package de.eberln.gdp.vorlesung.streams;

import java.io.*;
import java.lang.Math;

public class Primzahlfinder{

	public static void main(String[] args) {

		new Primzahlfinder();

	}

	public Primzahlfinder() {

		PrintWriter writer = null;

		try{
			writer = new PrintWriter("files/test.txt");

			writer.println("2");

			for(int i = 3;i<101;i++) {
				if(istPrimzahl(i)) {
					writer.println(i);
				}
			}

			writer.flush();

		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			writer.close();
		}

	}


	private boolean istPrimzahl(int zahl) {

		boolean istPrimzahl = true;

		for(int i = 2;i<=Math.ceil(Math.sqrt(zahl));i++) {
			if(zahl % i == 0) {
				istPrimzahl = false;
			}
		}

		return istPrimzahl;

	}



}

