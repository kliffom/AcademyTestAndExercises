package com.protom.produzione;

public class Prodotto {
	
	protected String marca;
	protected String modello;
	protected double prezzo;
	
	
	public Prodotto(String inMarca, String inModello, double inPrezzo) {
		this.marca = inMarca;
		this.modello = inModello;
		this.prezzo = inPrezzo;
	}


	public void applicaSconto() {
	}


	public double getPrezzo() {
		return this.prezzo;
	}


	@Override
	public String toString() {
		return "Prodotto [marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo + "]";
	}
	
	
}
