package de.eberln.gdp.vorlesung.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class StreamsAufgabe2 {

	Random random;
	FileWriter writer;
	
	public StreamsAufgabe2(long seed) {
		
		random = new Random(seed);
		
	}
	
	public void writeIntsToFile(String file) {
		
		try {
			writer = new FileWriter(file, false);
			
			for(int i = 0; i<100; i++) {
			
				writer.write("" + random.nextInt(0, 10) + "\n");
				
			}
			
			writer.flush();
			
		} catch (IOException e) {
	
			//Wenn IOException: Mache basically nichts. Printe nur Error in die Konsole
			e.printStackTrace();
		
		} finally {
			
			try {
				
				//Schließe writer sollte dieser nicht null sein
				if(writer != null) writer.close();
			
			} catch (IOException e) {
			
				//Wenn IOException: Mache basically nichts. Printe nur Error in die Konsole
				e.printStackTrace();
			}
			
		}
		
	}
	
	public double calcAverageFromFile(String file) {
		
		Scanner scanner = null;
		
		double sum = 0;
		int count = 0;
		
		try {
		
			scanner = new Scanner(new File(file));
			
			while(scanner.hasNextInt()) {
				sum += scanner.nextInt();
				count++;
			}
			
			scanner.close();
			
		}catch(FileNotFoundException e) {
			
		}finally {
			if(scanner != null) scanner.close();
		}
		
		if(count == 0) {
			return 0;
		}else {
			return sum / count;
		}
		
		
	}
	
}
