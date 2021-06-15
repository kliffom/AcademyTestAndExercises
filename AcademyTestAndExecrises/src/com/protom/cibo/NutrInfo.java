package com.protom.cibo;

import java.util.Arrays;

public class NutrInfo {

	private String nome;
	private double quantity;
	private double[] valNutr;
	
	{
		valNutr = new double[3];
	}
	
	public NutrInfo(String inNome, double inQuantity) {
		this.nome = inNome;
		this.quantity = inQuantity;
	}
	
	public void setNutrient(Nutrient nutr, double value) {
		
		switch(nutr) {
			case GRASSI:
				valNutr[0] = value;
				break;
			case CARBOIDRATI:
				valNutr[1] = value;
				break;
			case PROTEINE:
				valNutr[2] = value;
				break;
			default:
				break;
		}
	}

	@Override
	public String toString() {
		return "Valori nutrizionali per " + quantity + "g di " + nome + ":\nProteine: " + valNutr[2] + ";\nGrassi: "  + valNutr[0] + ";\nCarboidrati: "  + valNutr[1] + "." ;
	}
	
	
}
