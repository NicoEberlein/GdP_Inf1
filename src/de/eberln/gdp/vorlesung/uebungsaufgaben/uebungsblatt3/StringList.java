package de.eberln.gdp.vorlesung.uebungsaufgaben.uebungsblatt3;

public class StringList {

	private Entry first;
	private Entry last;
	
	public StringList() {
		
	}
	
	public void add(String s) {
		
		//Erstelle neues Entry-Objekt, welches String s enthält
		Entry newEntry = new Entry(s);
		
		if(first == null) {
			//Liste enthält noch keine Entries
			
			first = newEntry;
			last = newEntry;
		}else {
			//Liste enthält schon mindestens einen Entry
			last.setNext(newEntry);
			last = newEntry;
		}
		
	}
	
	public void delete(int position) {
		
		if(position == 0 && first != null) {
			//Erster Entry der Liste muss gelöscht werden
			first = first.getNext();
		}else {
			//Wenn nicht der erste Entry gelöscht werden soll: Delegiere Methodenaufruf an ersten Entry
			first.delete(--position);
		}
		
	}
	
	public String get(int position) {
		
		if(first != null) {
			
			return first.get(position);
			
		}else {
			
			return null;
			
		}
	}
	
	public void printAllEntries() {
		first.print();
	}
	
}
