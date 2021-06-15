package com.protom.garage;

public class Auto extends Veicolo {

	private String tipologia;
	
	public Auto(String inMarca, String inModello, String inTipologia) {
		super(inMarca, inModello);
		this.tipologia = inTipologia;
	}

	@Override
	public String toString() {
		return "Auto - " + marca + " " + modello + " (" + tipologia + ")";
	}
	
	
}
