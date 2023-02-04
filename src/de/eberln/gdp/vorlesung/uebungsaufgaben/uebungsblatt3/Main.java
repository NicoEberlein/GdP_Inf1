package de.eberln.gdp.vorlesung.uebungsaufgaben.uebungsblatt3;

public class Main {

	public static void main(String[] args) {
		
		/*ObjectList<Integer> stringList = new ObjectList<>();
		
		stringList.add(1);
		stringList.add(2);
		stringList.add(3);
		stringList.add(4);
		stringList.add(5);
		stringList.add(6);
		stringList.add(7);
		
		stringList.print();
		
		System.out.println("======");
		
		stringList.delete(2);
		
		stringList.print();
		
		System.out.println("=====");
		
		System.out.println(stringList.get(3));*/
		
		StringList stringList = new StringList();
		
		stringList.add("0");
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		stringList.add("4");
		stringList.add("5");
		stringList.add("6");
	
		stringList.printAllEntries();
		
		System.out.println("======");
		
		stringList.delete(3);
		
		System.out.println(stringList.get(2));
		
		stringList.printAllEntries();
	}
	
}
