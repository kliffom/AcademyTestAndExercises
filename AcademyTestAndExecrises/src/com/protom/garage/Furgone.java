package com.protom.garage;

public class Furgone extends Veicolo {

	private int peso;
	
	public Furgone(String inMarca, String inModello, int inPeso) {
		super(inMarca, inModello);
		this.peso = inPeso;
	}

	@Override
	public String toString() {
		return "Auto - " + marca + " " + modello + " (" + peso + "KG)";
	}
	
}
