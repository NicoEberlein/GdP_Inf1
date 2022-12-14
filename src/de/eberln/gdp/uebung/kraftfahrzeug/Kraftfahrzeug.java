package de.eberln.gdp.uebung.kraftfahrzeug;

import java.io.Serializable;

public class Kraftfahrzeug implements Vergleichbar, Serializable {
	
	private Gewicht gewicht;
	
	private Antrieb antrieb;
	
	private Geschwindigkeit vMax;
	
	private Gewicht mMax;
	
	public Kraftfahrzeug(Gewicht gewicht, Antrieb antrieb, Geschwindigkeit vMax, Gewicht mMax) {
		
		this.gewicht = gewicht;
		this.antrieb = antrieb;
		this.vMax = vMax;
		this.mMax = mMax;
		
	}

	public Gewicht getGewicht() {
		return gewicht;
	}

	public void setGewicht(Gewicht gewicht) {
		this.gewicht = gewicht;
	}

	public Antrieb getAntrieb() {
		return antrieb;
	}

	public void setAntrieb(Antrieb antrieb) {
		this.antrieb = antrieb;
	}

	public Geschwindigkeit getvMax() {
		return vMax;
	}

	public void setvMax(Geschwindigkeit vMax) {
		this.vMax = vMax;
	}

	public Gewicht getmMax() {
		return mMax;
	}

	public void setmMax(Gewicht mMax) {
		this.mMax = mMax;
	}
	
	public int vergleiche(Gewicht gewicht) {
		
		if(gewicht.getEinheit() == this.gewicht.getEinheit()) {
			
			if(this.gewicht.getGewicht() < gewicht.getGewicht()) {
				return -1;
			}else if(this.gewicht.getGewicht() > gewicht.getGewicht()) {
				return 1;
			}else {
				return 0;
			}
			
		}else {
			return 1;
		}
		
	}
	
	public int vergleiche(Geschwindigkeit v) {
		
		if(v.getEinheit() == this.vMax.getEinheit()) {
			
			if(this.vMax.getGeschwindigkeit() < v.getGeschwindigkeit()) {
				return -1;
			}else if(this.vMax.getGeschwindigkeit() > v.getGeschwindigkeit()) {
				return 1;
			}else {
				return 0;
			}
			
		}else {
			return 1;
		}
		
	}
	
	public int vergleiche(Antrieb antrieb) {
		
		if(this.antrieb == antrieb) {
			return 0;
		}else {
			return 1;
		}
		
		
	}
	
	

}
