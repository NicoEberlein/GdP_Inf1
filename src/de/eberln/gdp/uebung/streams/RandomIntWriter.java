package de.eberln.gdp.uebung.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomIntWriter {

	Random random;
	FileWriter writer;
	
	public RandomIntWriter() {
		
		random = new Random(1);
		
	}
	
	public void writeIntsToFile(String file) {
		
		try {
			writer = new FileWriter(file, true);
			
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
	
}
