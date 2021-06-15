package com.protom.esercizi.es1_2;

public class Esercizio1e2 {

	
	public static void counter50() {
		
		System.out.println("Contatore da 50 a 0:");
		for(int i=50; i>0; i--) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void tabellina(int inNumero) {
		
		System.out.println("Tabellina del " + inNumero);
		for(int i=0; i<=10; i++) {
			System.out.print(i*inNumero);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void fibonacci(int n) {
		
		System.out.println("Sequenza di Fibonacci per i primi " + n + " numeri: ");
		int val1 = 0;
		int val2 = 1;
		int temp = 0;
		for(int i=0; i<n; i++) {
			temp = val1 + val2;
			System.out.print(temp);
			System.out.print(" ");
			val1 = val2;
			val2 = temp;
		}
		System.out.println();
	}
	
	public static void calcoloVoto(int inVotoTeoria, int inVotoPratica) {
		
		System.out.println("Calcolo voto finale con " + inVotoTeoria + " e " + inVotoPratica + ":");
		if(inVotoTeoria < -8 || inVotoTeoria > 8)
			System.out.println("ERRORE: Il voto teoria deve essere compreso tra -8 e 8");
		if(inVotoPratica < 0 || inVotoPratica > 24)
			System.out.println("ERRORE: Il voto pratica deve essere compreso tra 0 e 24");
		
		int result = inVotoTeoria + inVotoPratica;
		
		
		if(inVotoTeoria<=0 && result > 18)
			System.out.println("Bocciato.");
		else if(inVotoTeoria<=0 && result < 18)
			System.out.println("Bocciato.");
		else if(inVotoTeoria>0 && result < 18)
			System.out.println("Bocciato.");
		else if(result == 31 || result == 32)
			System.out.println("Complimenti. 30L!");
		else
			System.out.println("Promosso con " + result + ".");
	}
	
	
	
	public static void main(String[] args) {

		counter50();
		tabellina(7);
		fibonacci(15);
		calcoloVoto(8, 23);
	}
}
