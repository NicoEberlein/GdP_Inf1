/*
 * @author: neberlein
 */

package de.eberln.gdp.vorlagen;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class ObjectDeSerializer {
	
	public Object readObjectFromFile(File file) {
		
		ObjectInputStream objectInputStream = null;
		
		try{
			
			objectInputStream = new ObjectInputStream(new FileInputStream(file));
	
			Object obj = objectInputStream.readObject();
			return obj;
			
		}catch(FileNotFoundException e) {
			
			System.out.println("Es wurde keine File unter dem Pfad " + file.getAbsolutePath() + " gefunden");
			return null;
		
		}catch(ClassNotFoundException | IOException e) {
			
			e.printStackTrace();
			return null;
			
		}finally {
			
			try {
				if(objectInputStream != null) objectInputStream.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
			
	}
	
	
	
	public void writeObjectToFile(File file, Serializable object) {
		
		ObjectOutputStream objectOutputStream = null;
		
		try {
		
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			objectOutputStream.writeObject(object);

			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}finally {
		
			try {
				if(objectOutputStream != null) objectOutputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
