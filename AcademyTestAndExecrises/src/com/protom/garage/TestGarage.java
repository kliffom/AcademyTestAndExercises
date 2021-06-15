package com.protom.garage;

public class TestGarage {

	public static void main(String[] args) {
		
		Garage g = new Garage();
		
		Veicolo auto1 = new Auto("Alfa Romeo", "Mito", "Utilitaria");
		Veicolo auto2 = new Auto("Alfa Romeo", "Giulia", "Sportiva");
		Veicolo auto3 = new Auto("Chrvrolet", "Camaro ZL1", "Muscle");
		Veicolo auto4 = new Auto("Ariel", "Atom", "Indefinita");
		
		Veicolo moto1 = new Moto("Aprilia", "Rally", false);
		Veicolo moto2 = new Moto("Piaggio", "Vespa 125", true);
		Veicolo moto3 = new Moto("Kawasaki", "Ninja", false);
		Veicolo moto4 = new Moto("Mezzo militare", "Who knows", true);
		
		Veicolo furg1 = new Furgone("Iveco", "Daily", 2500);
		Veicolo furg2 = new Furgone("Chevrolet", "Chevy Van", 3500);
		Veicolo furg3 = new Furgone("Ford", "F150", 5500);
		Veicolo furg4 = new Furgone("Peg Perego", "Baby", 12);
		
		g.addVeicolo(auto1);
		g.addVeicolo(auto2);
		g.addVeicolo(moto1);
		
		System.out.println(g.stampaSituazione());
		
		g.addVeicolo(moto2);
		g.addVeicolo(furg1);
		
		System.out.println("Esce un veicolo: " + g.removeVeicolo(2));
		System.out.println(g.stampaSituazione());
		
		g.addVeicolo(furg3);

		System.out.println(g.stampaSituazione());
		
		System.out.println("Esce un veicolo: " + g.removeVeicolo(8));
	}

}
