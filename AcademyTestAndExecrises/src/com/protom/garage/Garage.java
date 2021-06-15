package com.protom.garage;

public class Garage {

	Veicolo[] postiGarage; //ogni posto è il posto per un veicolo
	int postiTotali = 15;
	
	
	{
		postiGarage = new Veicolo[postiTotali];
	}
	
	
	public void addVeicolo(Veicolo inVeic) {
		
		for(int i=0; i<postiTotali; i++) {
			if(postiGarage[i] == null) { //posto vuoto, aggiungo
				postiGarage[i] = inVeic;
				return;
			}
		}
		//se arriva qui vuol dire che non ha trovato posti
		System.out.println("Nessun posto attualmente disponibile.");
	}
	
	public Veicolo removeVeicolo(int index) {
	
		Veicolo temp = postiGarage[index];
		postiGarage[index] = null;
		return temp;
	}
	
	public String stampaSituazione() {

		String situazione = "Situazione attuale garage:";
		
		for(int i=0; i<postiTotali; i++) {
			if(postiGarage[i]!=null) {
				situazione += "\nPosto #" + i + ": " + postiGarage[i].toString();
			}
			else
				situazione += "\nPosto #" + i + ": VUOTO";
		}
		return situazione;
	}
	
}
