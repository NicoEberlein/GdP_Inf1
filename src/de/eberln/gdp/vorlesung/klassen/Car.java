package de.eberln.gdp.vorlesung.klassen;

public class Car extends Vehicle{

	private int power;

	public Car(String manufacturer, String type) {

		super(manufacturer, type);

	}

	public Car(String type) {

		super(type);
		
	}

	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}




}
