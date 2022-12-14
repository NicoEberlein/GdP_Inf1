package de.eberln.gdp.uebung.aufgabenverwaltung;

public class Zeit {

	private int minute;
	private int stunde;
	
	public Zeit(int stunde, int minute) {
		
		this.stunde = stunde;
		this.minute = minute;
		
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getStunde() {
		return stunde;
	}

	public void setStunde(int stunde) {
		this.stunde = stunde;
	}
	
	
}
