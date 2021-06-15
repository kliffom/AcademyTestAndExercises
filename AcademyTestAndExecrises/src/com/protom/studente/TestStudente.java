package com.protom.studente;



public class TestStudente {

	public static void main(String[] args) {

		Studente.Triennale.setPrefisso("N86");
		Studente.Magistrale.setPrefisso("N97");
		
		Object luca1 = new Studente.Triennale("Luca", "004321");
		Object luca2 = new Studente.Triennale("Luca", "004321");
		Object anna1 = new Studente.Triennale("Anna", "004321");
		Object anna2 = new Studente.Magistrale("Anna", "004321");
		
		System.out.println(luca1.equals(luca2));
		System.out.println(anna1.equals(anna2));
		System.out.println(anna1);

	}

}
