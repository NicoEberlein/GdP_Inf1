package de.eberln.gdp.vorlesung.methodenundfunktionen;

import java.util.Arrays;

public class StringList {

	private String[] data = new String[16];
	private int size = 0;
	
	public StringList() {
		
	}
	
	public void add(String s) {
		
		if(size < data.length) {
			
			data[size] = s;
			size++;
			
		}else {
			
			extendArray();
			data[size] = s;
			size++;
		}
		
	}
	
	public void delete(int position) {
		for(int i = position; i<data.length; i++) {
			
			try {
				
				if(data[i+1] != null) {
					data[i] = data[i+1];
				}else {
					data[i] = null;
					size--;
				}
				
			}catch(ArrayIndexOutOfBoundsException e) {
				data[i] = null;
				size--;
			}
			
		}
	}
	
	private void extendArray() {
		
		String[] extended = new String[data.length + data.length/2];
		
		for(int i = 0; i<data.length; i++) {
			extended[i] = data[i];
		}
		
		data = extended;
		
	}
	
	public int size() {
		return size;
	}
	
	public String[] data() {
		return data;
	}
	
	public void append(StringList s) {
		
		String[] appendData = s.data();
		
		for(String str : appendData) {
			add(str);
		}

		
	}
	
	public void reverse() {
		
		String[] backup = data;
		
		for(int i = 0; i<size(); i++) {
			data[i] = backup[size-i];
		}
		
	}
	
	public static void main(String[] args) {
		
		StringList s = new StringList();
		
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		s.add("f");
		s.add("g");
		s.add("h");
		s.add("i");
		s.add("j");
		s.add("k");
		s.add("l");
		s.add("m");
		s.add("n");
		s.add("o");
		s.add("p");
		s.add("q");
		
		System.out.println(Arrays.toString(s.data));
		
		s.delete(3);
		
		System.out.println(Arrays.toString(s.data));
		
		s.reverse();
		
		System.out.println(Arrays.toString(s.data()));
	}
	
}
