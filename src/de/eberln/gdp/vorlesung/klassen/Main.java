package de.eberln.gdp.vorlesung.klassen;

public class Main{

	public static void main(String[] args) {

		Vehicle v = new Car("A", "C");
		Vehicle e = new ElectricCar("Tesla", "S P100D");

		e.setEngineType(EngineType.ELECTRIC);
		v.setEngineType(EngineType.PETROL);
		
		((Electric)e).setRange(420);
		
		System.out.println(((ElectricCar)e).getEngineType());
		System.out.println(v.getEngineType());
		System.out.println(((Electric)e).getRange());

		


	}

}
