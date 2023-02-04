package de.eberln.gdp.vorlesung.uebungsaufgaben.uebungsblatt3;

public class GenericEntry<T> {

	private T elementData;
	
	private GenericEntry next;
	
	public GenericEntry(T elementData) {
		
		this.elementData = elementData;
		
	}
	
	public void setNext(GenericEntry e) {
		next = e;
	}
	
	public GenericEntry getNext() {
		return next;
	}
	
	public T getData() {
		return elementData;
	}
	
	public void delete(int position) {
		
		if(position == 1) {
			next = next.getNext();
		}else {
			next.delete(--position);
		}
		
	}
	
	public T get(int position) {
		if(position == 0) {
			return elementData;
		}else {
			if(next == null) return null;
			return (T) next.get(--position);
		}
	}
	
	public void print() {
		System.out.println(elementData);
		if(next != null) next.print();
	}
	
}
