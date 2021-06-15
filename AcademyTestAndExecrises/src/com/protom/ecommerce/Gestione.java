package com.protom.ecommerce;

import com.protom.ecommerce.entity.Product;


public interface Gestione {

	/*
	 * Passato un prodotto, lo aggiunge
	 */
	public void addProdotto(Product p);
	
	/*
	 * Passando id e quantità, restituisce il prodotto
	 */
	public Product getAndRemoveProdotto(int id, int inQuantity);
	
	
	/*
	 * Stampa tutti i prodotti contenuti
	 */
	public void printAllProdotto();
}
