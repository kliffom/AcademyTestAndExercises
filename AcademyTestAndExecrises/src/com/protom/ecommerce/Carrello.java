package com.protom.ecommerce;
import java.util.ArrayList;

import com.protom.ecommerce.entity.*;





public class Carrello implements Gestione{

	private ArrayList<Product> prodCarrello;
	
	
	{
		prodCarrello = new ArrayList<Product>();
	}


	@Override
	/**
	 * Aggiunge {@link Product} al carrello (uno per quantità)
	 */
	public void addProdotto(Product p) {
		
		for(int i=0; i<p.getQuantity(); i++) { //in base al numero di Product da aggiungere

			// Ne imposta la quantità a 1 (per eventuali controlli futuri)
			p.setQuantity(1);

			// Aggiunge il prodotto al carrello 
			prodCarrello.add(p);
		}
		
	}


	@Override
	/**
	 * Rimuove {@link Product} dal carrello e lo restituisce (contente la rimozione di 1 solo prodotto per volta)
	 * 
	 * @param int id - identificativo del prodotto da rimuovere
	 * @param int quantity - Non utilizzato, viene sovrascritto a 1
	 * 
	 * @return {@link Product} - restituisce il prodotto rimosso dal carrello
	 */
	public Product getAndRemoveProdotto(int id, int inQuantity) {
		
		
		return null;
	}


	@Override
	/**
	 *  Stampa tutti i prodotti nel carrello, specificando l'ID
	 */
	public void printAllProdotto() {
		// TODO Auto-generated method stub
		
	}



	
}
