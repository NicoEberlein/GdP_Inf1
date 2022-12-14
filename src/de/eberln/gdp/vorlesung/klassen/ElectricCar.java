package de.eberln.gdp.vorlesung.klassen;

public class ElectricCar extends Vehicle implements Electric{

	private int range;

	public ElectricCar(String manufacturer, String type) {

		super(manufacturer, type);

	}

	public ElectricCar(String type) {

		this("", type);

	}

	public int getRange() {

		return range;
	
	}

	public void setRange(int range) {
		
		this.range = range;

	}
}
