package de.eberln.gdp.vorlesung.bookexample;

public class DVD extends Media{

	private int laufzeit;
	private int fsk;
	
	public DVD(String titel, int laufzeit, int fsk) {
		super(titel);
		this.laufzeit = laufzeit;
		this.fsk = fsk;
	}

	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	public int getFsk() {
		return fsk;
	}

	@Override
	public String toString() {
		return getTitel() + " " + laufzeit + "min";
	}
	
}
