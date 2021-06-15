package com.protom.esercizi.es11;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SafeSet <T>{

	
	HashMap<T, Boolean> safe; //L'oggetto da aggiungere sarà la chiave (così da non poterne aggiungere più di 1), il bool sarà il flag per la rimozione
	
	{
		safe = new HashMap<>();	
	}
	
	
	/**
	 * Aggiunge un elemento al SafeSet se questo non è ancora stato inserito.
	 * @param <T> elem - il generico elemento da inserire.
	 * @return true se l'aggiunta va a buon fine, false se l'elemento è già presente.
	 */
	public boolean add(T elem) {
		
		if(!contains(elem)) { //non c'è l'elemento, lo aggiungo.
			safe.put(elem, false); //imposto il flag a false perché non deve essere ancora eliminato
			return true;
		}
		return false;
	}
	
	
	/**
	 * Rimuove un elemento dal SafeSet. La rimozione avviene solo se vengono invocate 2 chiamate sullo stesso oggetto.
	 * @param <T> elem - il generico elemento da eliminare.
	 * @return true se si esegue la seconda chiamata sull'oggetto da eliminare, false se è la prima chiamata oppure l'elemento non esiste.
	 */
	public boolean remove(T elem) {
		
		if(safe.containsKey(elem)) { // controllo se l'elemento è presente
			
			boolean flagged = safe.get(elem); 
			if(!flagged) { 						// l'elemento non è ancora flaggato da eliminare
				flagged = true;					// flag elemento da eliminare alla prossima invocazione
				safe.put(elem, flagged);
				return false;
			}
			else {
				safe.remove(elem);
				return true;
			}
		}
		
		
		return false;
	}
	
	/**
	 * Restituisce se un elemento è presente o meno nel SafeSet.
	 * @param <T> elem - il generico elemento da ricercare.
	 * @return true se il SafeSet contiene l'elemento, false altrimenti.
	 */
	public boolean contains(T elem) {
		
		if(safe.containsKey(elem))
			return true;
		return false;
	}
	
	/**
	 * Metodo per la stampa dell'intero SafeSet per il test dei metodi
	 */
	public void printState() {
		
		Iterator<T> it = (Iterator<T>) safe.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<T, Boolean> entry = (Map.Entry<T, Boolean>) it.next();
			System.out.println("[" + entry.getKey() + ", flag rimozione: " + entry.getValue());
		}
	}
}
