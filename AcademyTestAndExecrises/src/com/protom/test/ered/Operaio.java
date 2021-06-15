package com.protom.test.ered;

public class Operaio extends Impiegato{

	private String reparto;
	
	public Operaio(String inRep) {
		this.reparto = inRep;
	}
	
	public String getReparto() {
		return this.reparto;
	}
}
