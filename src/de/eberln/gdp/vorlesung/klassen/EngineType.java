package de.eberln.gdp.vorlesung.klassen;

public enum EngineType{
	DIESEL,
	PETROL,
	GAS,
	ELECTRIC;

	public String info() {

		String s = "";
		switch(this) {

			case DIESEL:
				s = "Dieselmotor";
				break;
			case PETROL:
				s = "Dinosauriermotor";
				break;
			case GAS:
				s = "Gasfoermiger Dinosauriermotor";
				break;
			case ELECTRIC:
				s = "Beste Motorform der WEEELt 1!1!111elf!";
				break;

			default:
				s = "Du Hurensohn";
				break;
		}

		return s;
	}
}
