package de.eberln.gdp.vorlesung.uebungsaufgaben.uebungsblatt3;

public class Entry {

	private String content;
	
	private Entry next;
	
	public Entry(String content) {
		//Setze Inhalt des Listenelements
		this.content = content;
	}
	
	public void setNext(Entry next) {
		//Setze Nachfolger des Listenelements
		this.next = next;
	}
	
	public Entry getNext() {
		//Gebe den Nachfolger des Listenelements zurück
		return next;
	}
	
	public void delete(int position) {
		if(position == 0) {
			next = next.getNext();
		}else {
			if(next != null) {
				next.delete(--position);
			}
		}
	}
	
	public String get(int position) {
		if(position == 0) {
			return content;
		}else {
			if(next != null) {
				return next.get(--position);
			}else {
				return null;
			}
		}
	}
	
	public void print() {
		System.out.println(content);
		if(next != null) {
			next.print();
		}
	}
	
}
