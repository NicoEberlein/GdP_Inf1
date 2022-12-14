package de.eberln.gdp.uebung.streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LoremIpsumReader {
	
	public LoremIpsumReader(String filePath) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			
			String fileContent = "";
			fr = new FileReader(filePath);
			fw = new FileWriter("files/lorem_neu.txt");
			
			while(fr.ready()) {
				fileContent = fileContent + ((char)fr.read());
			}
			
			fw.write(fileContent);
			
			System.out.println(fileContent);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
