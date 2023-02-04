package de.eberln.gdp.vorlesung.uebungsaufgaben.uebungsblatt3;

public class ObjectList<T> {

	private GenericEntry first;
	private GenericEntry last;
	
	public ObjectList() {
		
	}
	
	public void add(T t) {
		
		GenericEntry e = new GenericEntry<T>(t);
		
		if(first == null) {
			first = e;
			last = e;
		}else {
			last.setNext(e);
			last = e;
		}
	}
	
	public void delete(int position) {
		
		if(position == 0) {
			first = first.getNext();
		}else {
			first.delete(position);
		}
		
	}
	
	public T get(int position) {
		
		if(position == 0) {
			return (T) first.getData();
		}else {
			return (T) first.get(position);
		}
		
		
	}
	
	public void print() {
		
		if(first != null) first.print();
		
	}
}
