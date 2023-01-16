package de.eberln.gdp.vorlesung.bookexample;

public abstract class Media {

	private String titel;
	
	public Media(String titel) {
		this.titel = titel;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public abstract String toString();
	
}
