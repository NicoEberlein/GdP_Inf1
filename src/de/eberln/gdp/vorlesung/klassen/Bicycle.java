package de.eberln.gdp.vorlesung.klassen;

public class Bicycle extends Vehicle{

	private int gears;

	public Bicycle(String manufacturer, String type) {

		super(manufacturer, type);

	}

	public Bicycle(String type) {

		super(type);

	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

}
