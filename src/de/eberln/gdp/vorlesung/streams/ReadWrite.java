package de.eberln.gdp.vorlesung.streams;

import java.io.*;

public class ReadWrite{

	public static void main(String[] args) {

		new ReadWrite();

	}

	public ReadWrite() {

		FileReader fr = null;
		FileWriter fw = null;

		try{
			fr = new FileReader("in.txt");
			fw = new FileWriter("out.txt");


			int n = fr.read();
			while (n != -1) {
				char c = (char) n;
				fw.write(n);
				n = fr.read();
			}

		}catch(IOException e) {

			e.printStackTrace();

		}finally{

			try {
				if(fr != null) {
					fr.close();
				}
				if(fw != null) {
					fw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}

		}

	}



}
