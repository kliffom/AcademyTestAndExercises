package com.protom.ecommerce;


import java.util.Enumeration;
import java.util.Hashtable;
import com.protom.ecommerce.entity.Product;


public class Magazzino implements Gestione{
	
	private static Magazzino _instance;

	private Hashtable<Integer, Product> prodMagaz;
	private boolean logging = true;
	
	
	{
		prodMagaz = new Hashtable<Integer, Product>();

	}

	
	// Costruttore privato per rendere Magazzino una classe Singleton
	private Magazzino() {
		
	}
	
	//Istanziatore Magazzino per averne solo 1
	public static Magazzino getInstance() {
		if(_instance==null)
			_instance = new Magazzino();
		return _instance;
	}
	
	

	@Override
	/**
	 *  Consente l'aggiunta di un oggetto all'interno del magazzino.
	 *  Se il prodotto è già presente, ne aggiorna la quantità disponibile.
	 *  Se il prodotto non è ancora presente, lo aggiunge.
	 *  
	 *  @param {@link Product} p - Oggetto Product da aggiungere al magazzino
	 */
	public void addProdotto(Product p) {
		
		
		// Controllo se il prodotto è già in magazzino
		if(prodMagaz.containsKey(p.getId())) {
			if(logging)
				System.out.println("[LOG] Il prodotto (" + p.getId() + "-" + p.getMarca() + ") è già in magazzino");

			// Se sì, incrementa il valore di quantità
			Product temp = prodMagaz.get(p.getId());											// Prendo un prodotto dall'hash
			
			if(logging)
				System.out.println("[LOG] Prodotto precedente:\n" + temp.toString());
			
			temp.setVendutaQuantity(temp.getVendutaQuantity()+p.getVendutaQuantity());			// Incremento la quantità venduta
			temp.setQuantity(temp.getQuantity()+p.getQuantity());								// Incremento la quantità nel magazzino
			prodMagaz.replace(p.getId(), temp);													// Inserisco l'oggetto al posto del precedente
			
			if(logging)
				System.out.println("[LOG] Prodotto in magazzino dopo l'aggiornamento:\n" + prodMagaz.get(p.getId()).toString());
		}
		else {
			
			// Altrimenti aggiunge il Prodotto all'hashtab, utilizzando l'id come identificativo
			Product temp = null;
			
			try {
				temp = (Product) p.clone();
			} catch (CloneNotSupportedException e) {
				System.err.println("Impossibile clonare. Rigenero l'oggetto");
				temp = new Product().setMarca(p.getMarca()).setPrezzo(p.getPrezzo()).setQuantity(p.getQuantity()).setTipo(p.getTipo()).setVendutaQuantity(p.getVendutaQuantity());
			}
			
			prodMagaz.put(p.getId(), temp);
			
			
			if(logging)
				System.out.println("[LOG] Prodotto aggiunto in magazzino:\n" + prodMagaz.get(p.getId()).toString());
		}
		
		if(logging)
			System.out.println(prodMagaz);
	}
	
	// TODO rimuovere inserimento quantità. Quando si vogliono più elementi si fanno più chiamate al metodo  
	@Override
	/**
	 *  Consente la ricezione di un {@link Product} dato il suo identificativo (se esiste in magazzino).
	 *  L'oggetto ricevuto avrà come parametro quantità quella richiesta.
	 *  
	 *  @param int id - Identificativo del prodotto da ricevere
	 *  @param int quantity - Quantità del prodotto da ricevere
	 *  @return {@link Product} p - Oggetto Product preso dal magazzino.
	 */
	public Product getAndRemoveProdotto(int id, int inQuantity) {
		
		// Controlla se il prodotto esiste in magazzino
		if(prodMagaz.contains(id)) {
			
			// Controlla se ci sono prodotti disponibili
			if(prodMagaz.get(id).getQuantity()>=inQuantity) {
				
				// Se sì, decrementa il valore di quantità
				Product temp = prodMagaz.get(id);
				temp.setQuantity(temp.getQuantity()-inQuantity);
				prodMagaz.replace(id, temp);
				
				// Imposta la quantità richiesta dall'utente
				temp.setQuantity(inQuantity);
				return temp;
				
			}
		}
		// Se il prodotto non esiste, oppure non ce n'è abbastanza
		return null;
	}

	@Override
	/**
	 *  Stampa tutti i prodotti nel magazzino, specificando l'ID
	 */
	public void printAllProdotto() {
		// TODO Auto-generated method stub
		
		StringBuilder print = new StringBuilder(); //utilizzo lo StringBuilder per non intasare lo StringConstPool
		print.append("Stampa prodotti presenti in magazzino:\n");
		
		Enumeration<Integer> keys = prodMagaz.keys();
		
		while(keys.hasMoreElements()) {
			int key = keys.nextElement();
			Product p = prodMagaz.get(key);
			//aggiungo alla stringa i dati preso dalla table con questa key
			print.append("[ID: " + p.getId() + "] " + p.getMarca() + " (" + p.getTipo()+ "), "+ p.getPrezzo() + 
					"€ (Disponibile: " + p.getQuantity() + ", Venduti: " + p.getVendutaQuantity() + ")\n");
		}
		
		System.out.println(print.toString());
	}
	
	
}
