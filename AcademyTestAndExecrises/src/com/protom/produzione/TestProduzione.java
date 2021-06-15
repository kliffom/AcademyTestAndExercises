package com.protom.produzione;

public class TestProduzione {

	public static void main(String[] args) {
		
		char esercizio = 'B';
		
		if(esercizio == 'A') {
			
			System.out.println("SEZIONE SIMPLE");
			
			Prodotto tvLg = new Televisore("LG", "nuovo", 1000, 48, true);
			Prodotto umidigi = new Smartphone("Umidigi", "F2", 250, "Android 10.0", 6, 2020);
			
			tvLg.applicaSconto();
			umidigi.applicaSconto();
			
			System.out.println(tvLg.getPrezzo());
			System.out.println(umidigi.getPrezzo());
			
		}
		else if(esercizio == 'B') {
		
			System.out.println("SEZIONE CARRELO");
		
			Prodotto tvLg = new Televisore("LG", "AXC", 1000, 48, true);
			Prodotto umidigi = new Smartphone("Umidigi", "F2", 250, "Android 10.0", 6, 2020);
			Prodotto tvSony = new Televisore("Sony", "WDE", 3000, 56, true);
			Prodotto samsung = new Smartphone("Samsung", "S7", 300, "Android 6.0", 2, 2017);
			Prodotto akai = new Televisore("Akai", "BGT", 235, 32, false);
			
			Carrello c = new Carrello();
			c.addProdotto(tvLg);
			c.addProdotto(tvSony);
			c.addProdotto(samsung);
			c.addProdotto(umidigi);
			c.addProdotto(akai);
			
			System.out.println("totale = " + c.acquista());
		
		}
	}

}
