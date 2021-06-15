package com.protom.test.generics;

import com.protom.produzione.Prodotto;

public class TestGenerics {

	public static void main(String[] args) {
		

		Contenitore<String> stringContainer = new Contenitore<>(5);
		Contenitore<Integer> intContainer = new Contenitore<>(10);
		Contenitore<Prodotto> prodContainer = new Contenitore<>(2);
		
		stringContainer.add("Ciao", 0);
		stringContainer.add("ASD", 1);
		
		
		System.out.println(stringContainer.get(0));
		
		intContainer.add(10, 0);
		intContainer.add(20, 1);
		
		
		System.out.println(intContainer.get(1));
		
		prodContainer.add(new Prodotto("Marca", "Modello", 10), 0);
		prodContainer.add(new Prodotto("Marca2", "Modello2", 110), 1);
		
		System.out.println(prodContainer.get(1));
		
		
		System.out.println(stringContainer);
		System.out.println(intContainer);
		System.out.println(prodContainer);
	}

}
