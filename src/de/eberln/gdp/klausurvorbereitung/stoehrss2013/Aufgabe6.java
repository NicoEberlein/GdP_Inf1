package de.eberln.gdp.klausurvorbereitung.stoehrss2013;

public class Aufgabe6 {

	private int mValue;
	
	public Aufgabe6() {
		mValue = 42;
		System.out.println("Klausur::Init" + mValue);
	}
	
	public Aufgabe6(int aValue) {
		mValue = aValue;
		doInit(mValue - 21);
		System.out.println(mValue);
	}
	
	private void doInit(int aValue) {
		
		int zwsp;
		
		zwsp = aValue >> 2;
		zwsp = (++zwsp % 2 == 0) ? ++zwsp:zwsp--;
		
		System.out.println(zwsp);
	}
	
	public void showValue() {
		System.out.println("showValue" + mValue);
	}
	
	public static void main(String[] args) {
		
		Nachholklausur nhk = new Nachholklausur(12);
		nhk.showValue();
		
	}
	
}

class Nachholklausur extends Aufgabe6{
	
	private int mValue;
	
	public Nachholklausur(int aValue) {
		doInit(aValue);
		System.out.println("Nachholklausur::mValue " + aValue);
	}
	
	private void doInit(int aValue) {
		int zwsp;
		
		zwsp = aValue << 2;
		zwsp = (zwsp-- % 2 == 0) ? ++zwsp : zwsp--;
		
		mValue = zwsp;
		System.out.println("DoInit:" + zwsp);
	}
	
}
