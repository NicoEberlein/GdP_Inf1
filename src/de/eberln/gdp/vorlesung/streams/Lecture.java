package de.eberln.gdp.vorlesung.streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lecture implements Serializable{

	private String name;
	private int sws;
	private int ects;
	//private Student[] students;
	
	
	public Lecture(String name, int sws, int ects) {
		this.name = name;
		this.sws = sws;
		this.ects = ects;
	}
	
	public void writeLecture(String file) {
		
		DataOutputStream dataOutputStream = null;
		
		try {
			
			dataOutputStream = new DataOutputStream(new FileOutputStream(file));
			
			dataOutputStream.writeInt(ects);
			dataOutputStream.writeInt(sws);
			
			dataOutputStream.writeUTF(name);
			
			dataOutputStream.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			}catch(IOException e) {
				
			}
		}
		
	}
	
	public Lecture readLecture(String file) {
		
		DataInputStream dataInputStream = null;
		
		try {
			
			dataInputStream = new DataInputStream(new FileInputStream(file));
			
			int readEcts = dataInputStream.readInt();
			int readSws = dataInputStream.readInt();
			String readName = dataInputStream.readUTF();
			
			return new Lecture(readName, readEcts, readSws);
		
		}catch(IOException e) {
			
			return null;
			
		}finally {
			try {
				dataInputStream.close();
				
			}catch(IOException e) {
				
			}
		}
		
	}
	
	@Override
	public String toString() {
	
		return name + " " + sws + " " + ects;
		
	}
	
	
}
