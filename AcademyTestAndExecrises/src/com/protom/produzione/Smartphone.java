package com.protom.produzione;

public class Smartphone extends Prodotto{

	
	private String opSis;
	private int annoProd;
	private int ram;
	
	public Smartphone(String inMarca, String inModello, double inPrezzo, String inOpSis, int inRam, int inAnnoProd) {
		super(inMarca, inModello, inPrezzo);
		this.opSis = inOpSis;
		this.annoProd = inAnnoProd;
		this.ram = inRam;
	}
	
	public void applicaSconto() {
		
		this.prezzo -= ((this.prezzo * 30) / 100);	

	}
	
}
