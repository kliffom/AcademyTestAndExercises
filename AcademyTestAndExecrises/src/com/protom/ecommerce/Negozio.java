package com.protom.ecommerce;

import java.util.Scanner;

import com.protom.ecommerce.entity.*;


public class Negozio {

	public static void main(String[] args) {
		
		Product p1 = new Product("Creality Ender 3", Tipologia.STAMPANTE3D, 250, 5, 1);
		Product p2 = new Product("Elegoo Mars 2 Mono", Tipologia.STAMPANTE3D, 210, 8, 2);
		Product p3 = new Product("Coca-Cola lattina", Tipologia.CIBO, 1, 25, 7);
		Product p4 = new Product("Onyx Boox Note Air", Tipologia.TABLET, 480, 2, 0);
		Product p5 = new Product().setMarca("Oneplus 5T").setTipo(Tipologia.SMARTPHONE).setPrezzo(490).setQuantity(6).setVendutaQuantity(3);
		
		// Test per controllare l'autoincremento degli ID da utilizzare nelle Hash
//		System.out.println(p1.getId() + ": " + p1.getMarca() + ", \n" + 
//							p2.getId() + ": " + p2.getMarca() + ", \n" + 
//							p3.getId() + ": " + p3.getMarca() + ", \n" + 
//							p4.getId() + ": " + p4.getMarca() + ", \n");

		Magazzino mag = Magazzino.getInstance();
		
		mag.addProdotto(p1);
		p1.setQuantity(8);
		mag.addProdotto(p1);
		p1.setQuantity(2);
		mag.addProdotto(p1);
		mag.addProdotto(p2);
		mag.addProdotto(p3);
		mag.addProdotto(p4);
		mag.addProdotto(p5);
		
		mag.printAllProdotto();
		
		Product got = mag.getAndRemoveProdotto(6, 2);
		
		System.out.println("Prodotto rimosso: " + got);
		
		mag.printAllProdotto();
		
		Carrello kart = new Carrello();
		
		
		
		
		int scelta = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Sistema gestione negozio.");
		do {
			System.out.println("Menu principale.");
			System.out.println("Inserisci il numero dell'operazione da effettuare:");
			System.out.println("[1] Stampa dettaglio prodotti disponibili.");
			System.out.println("[2] Scegli prodotto da inserire nel carrello.");
			System.out.println("[3] Rimuovi un prodotto dal carrello.");
			System.out.println("[4] Visualizza contenuto carrello.");
			System.out.println("[0] Esci (tutte le modifiche andranno perse).");
			
			scelta = in.nextInt();
			
			switch(scelta) {
			case 0:
				System.out.println("Uscita in corso. Grazie per la visita.");
				return;
			case 1:
				System.out.println("Stampo prodotti disponibili.");
				mag.printAllProdotto();
				break;
			case 2:
				System.out.println("Scelta prodotti da aggiungere al carrello.");
				//Invoca scelta prodotto per aggiunta
				
				//Stampa tutti i prodotti nel magazzino
				//Richiedi ID del prodotto da aggiungere
				//Ritira oggetto dal magazzino (e rimuovi)
				//Inserisci oggetto nel carrello
				
				break;
			case 3:
				System.out.println("Scelta prodotto da rimuovere dal carrello.");
				//Invoca rimozione prodotto carrello
				
				//Stampa tutti i prodotti nel carrello
				//Richiedi ID prodotto da rimuovere
				//Ritira oggetto dal carrello (e rimuovi)
				//Inserisci oggetto nel magazzino
				break;
			case 4:
				System.out.println("Stampa carrello.");
				//Invoca visualizzazione carrello
				//kart.printAllProdotto();
				break;
			default:
				System.out.println("Scelta non valida.");
			}
			
		}
		while(true);
		
	}
}
