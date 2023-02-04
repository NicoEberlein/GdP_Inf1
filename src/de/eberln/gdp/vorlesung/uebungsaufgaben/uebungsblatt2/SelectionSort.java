package de.eberln.gdp.vorlesung.uebungsaufgaben.uebungsblatt2;

import java.util.Arrays;

public class SelectionSort {

	int[] data;
	
	public SelectionSort(int[] data) {
		this.data = data;
	}
	
	public int[] getData() {
		return data;
	}
	
	public void setData(int[] data) {
		this.data = data;
	}
	
	private int getPosMin(int start) {
		
		int currentMin = data[start];
		int currentPos = start;
		
		if(start >= data.length) {
			return start;
		}
		
		for(int i = start+1; i < data.length; i++) {
			
			if(data[i] < currentMin) {
				currentPos = i;
				currentMin = data[i];
			}
			
		}
		
		return currentPos;
		
	}
	
	public void sort() {
		
		for(int i = 0; i< data.length; i++) {
			
			int smallerEntry = getPosMin(i);
			
			if(smallerEntry != i) {
				int zwsp = data[i];
				data[i] = data[smallerEntry];
				data[smallerEntry] = zwsp;
			}
			
		}
		
	}
	
	public int find(int n) {
		
		int i = data.length/2;
		
		while(i<data.length && i>0) {
			
			if(n == data[i]) {
				return i;
			}else if(n > data[i]) {
				
				i++;
				
			}else if(n < data[i]) {
				
				i--;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] a = new int[] {1,6,9,2,5,3,4,2,7,6,1,4,2};
		
		SelectionSort s = new SelectionSort(a);
		
		System.out.println(Arrays.toString(s.getData()));
		
		s.sort();
		
		System.out.println(Arrays.toString(s.getData()));
		
		System.out.println(s.find(10));
		
	}
	
}
