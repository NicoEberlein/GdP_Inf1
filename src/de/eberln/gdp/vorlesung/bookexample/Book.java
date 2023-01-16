package de.eberln.gdp.vorlesung.bookexample;

public class Book {
	
	private String titel;
	private String verlag;
	private String[] autoren;
	private int anzahlSeiten;
	
	public Book(String titel, String verlag) {
		
		this.titel = titel;
		this.verlag = verlag;
		
		this.autoren = new String[5];
		
	}

	public void addAutor(String autor) {
		
		for(int i = 0; i<autoren.length;i++) {
			
			if(autoren[i] == null) {
				autoren[i] = autor;
				break;
			}
			
		}
		
	}
	
	public String getTitel() {
		return titel;
	}

	public String getVerlag() {
		return verlag;
	}

	public String[] getAutoren() {
		return autoren;
	}

	public int getAnzahlSeiten() {
		return anzahlSeiten;
	}
	
	
	
	
	

}
