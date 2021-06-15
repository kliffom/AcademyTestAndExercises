package com.protom.cibo;

import java.util.Enumeration;
import java.util.Hashtable;

public class NutrInfoHash {

	private String nome;
	private double quantity;
	private Hashtable<Nutrient, Double> valNutr;
	
	{
		valNutr = new Hashtable<Nutrient, Double>();
	}
	
	public NutrInfoHash(String inNome, double inQuantity) {
		this.nome = inNome;
		this.quantity = inQuantity;
	}
	
	public void setNutrient(Nutrient nutr, double value) {
		
		//controllo se il nutriente è già presente
		//aggiungo il nutriente oppure lo modifico
		if(!valNutr.containsKey(nutr)) { //il valore nutrizionale non c'è ancora
			valNutr.put(nutr, value);
		}
		else { //il vlaore nutrizionale c'è, quindi lo aggiorno
			valNutr.replace(nutr, value);
		}
		
	}
	
	
	@Override
	public String toString() {
		
		String result = "Valori nutrizionali per " + quantity + "g di " + nome + ":\n";
		
		Enumeration<Nutrient> keys = valNutr.keys();
		while(keys.hasMoreElements()) {
			var key = keys.nextElement();
			result += key + ": " + valNutr.get(key) + "\n";
		}
		
		
//		return "Valori nutrizionali per " + quantity + "g di " + nome + ":\nProteine: " + valNutr[2] + ";\nGrassi: "  + valNutr[0] + ";\nCarboidrati: "  + valNutr[1] + "." ;
		return result;
	}
	
}
