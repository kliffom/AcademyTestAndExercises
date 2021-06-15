package com.protom.garage;

public class Moto extends Veicolo {

	private boolean isSidecar;
	
	public Moto(String inMarca, String inModello, boolean inSidecar) {
		super(inMarca, inModello);
		this.isSidecar = inSidecar;
	}

	@Override
	public String toString() {
		return "Auto - " + marca + " " + modello + " (" + isSidecar + ")";
	}
	
}
