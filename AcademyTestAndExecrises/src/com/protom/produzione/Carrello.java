package com.protom.produzione;

import java.util.ArrayList;

public class Carrello {
	
//	private Prodotto[] products;
	private ArrayList<Prodotto> prodotti;
	
	private int maxCarrello = 10;
	
	{
		prodotti = new ArrayList<Prodotto>();
	}
	
	
	
	public void addProdotto(Prodotto inProdotto) {
		
		if(prodotti.size()<maxCarrello) {
			prodotti.add(inProdotto);
		}
		else
			System.out.println("Il carrello contiene già il massimo di elementi (" + maxCarrello + ").");
		
	}
	
	public double acquista() {
		
		double costoTotale = 0;
		
		for(Prodotto p : prodotti) {
			p.applicaSconto();
			costoTotale += p.getPrezzo();
		}
		
		if(costoTotale>2500)
			costoTotale -= ((costoTotale*5)/100);
		
		return costoTotale;
	}

}
