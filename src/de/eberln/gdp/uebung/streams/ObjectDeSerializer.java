package de.eberln.gdp.uebung.streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectDeSerializer {

	public ObjectDeSerializer() {
		
	}
	
	public Object readObjectFromFile(String filePath) {
		
		ObjectInputStream objectInputStream = null;
		
		try{
			
			objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
		
			Object obj = objectInputStream.readObject();
			
			return obj;
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				objectInputStream.close();	
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	public void writeObjectToFile(String filePath, Object object) {
		
		ObjectOutputStream objectOutputStream = null;
		
		try {
		
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
			objectOutputStream.writeObject(object);

			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				objectOutputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public Object deepCopy(Object oldObj) {
		
		ByteArrayOutputStream byteArrayOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		ObjectInputStream objectInputStream = null;
		
		try {
			
			byteArrayOutputStream = new ByteArrayOutputStream();
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			
			objectOutputStream.writeObject(oldObj);
			objectOutputStream.flush();
			
			
			objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
			
			return objectInputStream.readObject();
			
		}catch(IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
			return null;
			
		}finally {
			
			try {
			
				byteArrayOutputStream.close();
				objectInputStream.close();
				objectOutputStream.close();
			
			}catch(IOException e) {
			
				e.printStackTrace();
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
