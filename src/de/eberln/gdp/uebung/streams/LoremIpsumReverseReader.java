package de.eberln.gdp.uebung.streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LoremIpsumReverseReader {

	public LoremIpsumReverseReader(String filePath)  {
		
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile(new File(filePath), "r");
			FileOutputStream fw = new FileOutputStream("files/lorem_rueckwaerts.txt");
			
			for(long i=randomAccessFile.length();i>0;i--) {
				
				randomAccessFile.seek(i-1);
				fw.write(randomAccessFile.readByte());
				
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
