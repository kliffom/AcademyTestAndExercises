package com.protom.esercizi.es11;

import com.protom.produzione.Prodotto;

public class SafeSetTest {

	public static void main(String[] args) {
		
		SafeSet<Integer> safe1 = new SafeSet<>();
		
		SafeSet<Prodotto> safe2 = new SafeSet<>();
		
		System.out.println("Aggiungo 5: " + safe1.add(5));
		System.out.println("Aggiungo 5: " + safe1.add(5));
		System.out.println("Aggiungo 7: " + safe1.add(7));
		System.out.println("Aggiungo 8: " + safe1.add(8));
		System.out.println("Aggiungo 10: " + safe1.add(10));
		
		safe1.printState();
		
		
		System.out.println("Rimuovo 5: " + safe1.remove(5));
		System.out.println("Rimuovo 5: " + safe1.remove(5));
		System.out.println("Rimuovo 7: " + safe1.remove(7));
		System.out.println("Rimuovo 8: " + safe1.remove(8));
		
		safe1.printState();
		
		System.out.println("Contiene 5: " + safe1.contains(5));
		System.out.println("Contiene 8: " + safe1.contains(8));
		System.out.println("Contiene 10: " + safe1.contains(10));
		
		Prodotto p1 = new Prodotto("Marca1", "modello1", 250);
		System.out.println("Aggiungo p1: " + safe2.add(p1));
		System.out.println("Aggiungo p1: " + safe2.add(p1));
		Prodotto p2 = new Prodotto("Marca2", "modello2", 350);
		System.out.println("Aggiungo p2: " + safe2.add(p2));
		Prodotto p3= new Prodotto("Marca3", "modello3", 450);
		System.out.println("Aggiungo p3: " + safe2.add(p3));
		Prodotto p4 = new Prodotto("Marca4", "modello4", 550);
		System.out.println("Aggiungo p4: " + safe2.add(p4));
		
		safe2.printState();
		
		System.out.println("Rimuovo p1: " + safe2.remove(p1));
		System.out.println("Rimuovo p1: " + safe2.remove(p1));
		System.out.println("Rimuovo p2: " + safe2.remove(p2));
		System.out.println("Rimuovo p3: " + safe2.remove(p3));
		
		safe2.printState();
		
		System.out.println("Contiene p1: " + safe2.contains(p1));
		System.out.println("Contiene p2: " + safe2.contains(p2));
		
	}

}
