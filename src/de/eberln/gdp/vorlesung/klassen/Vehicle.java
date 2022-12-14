package de.eberln.gdp.vorlesung.klassen;

public class Vehicle{

	private String manufacturer;
	private String type;
	private int capacity;
	private EngineType engineType;

	public Vehicle(String manufacturer, String type) {

		this(type);
		this.manufacturer = manufacturer;

	}

	public Vehicle(String type) {

		this.type = type;

	}

	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Vehicle: " + manufacturer + " " + type;
	}

	@Override
	public boolean equals(Object o) {
	
		if(o instanceof Vehicle) {
			Vehicle v = (Vehicle) o;
			return this.getManufacturer().equals(v.getManufacturer()) && this.getType().equals(v.getType());
		}else{
			return false;
		}


	}


}
