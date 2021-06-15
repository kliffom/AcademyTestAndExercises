package com.protom.produzione;

public class Televisore extends Prodotto{

	private double pollici;
	private boolean isSmart;
	
	public Televisore(String inMarca, String inModello, double inPrezzo, double inPollici, boolean inSmart) {
		super(inMarca, inModello, inPrezzo);
		pollici = inPollici;
		isSmart = inSmart;
	}
	
	public void applicaSconto() {
		
		this.prezzo -= ((this.prezzo * 20) / 100);
		
	}
	
}
