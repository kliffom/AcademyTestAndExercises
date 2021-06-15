package com.protom.esercizi.es3;

public class Esercizio3 {

	public static void stampaVocali(String inString) {
		
		System.out.println("Variabili in \"" + inString + "\":");
		for(int i=0; i<inString.length(); i++) {
			if(inString.toLowerCase().charAt(i) == 'a' || inString.toLowerCase().charAt(i) == 'e' || inString.toLowerCase().charAt(i) == 'i' || inString.toLowerCase().charAt(i) == 'o' || inString.toLowerCase().charAt(i) == 'u')
				System.out.print(inString.charAt(i));
		}
		System.out.println();
	}
	
	public static void stampaAlContrario(String inString) {
		
		System.out.println("Stampo \"" + inString + "\" al contrario:");
		
		for(int i=inString.length(); i>0; i--) {
			System.out.print(inString.charAt(i-1));
		}
		System.out.println();
	}
	
	public static int contaChar(char c, String s) {
		
		int occurr = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c)
				occurr++;
		}
		
		return occurr;
	}
	
	public static boolean isAnagramma(String s1, String s2) {
		
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int[] letterOccurr = new int[26];
		
		for(int i=0; i<letterOccurr.length; i++) {
			letterOccurr[i] = 0;
		}
		
		//a � in posizione 97
		//Calcolo quante occorrenze di ogni lettera ci sono nella stringa 1
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) >= 97 && s1.charAt(i) <= 123) { //considero solo le lettere dell'alfabeto
				letterOccurr[s1.charAt(i)-97] = letterOccurr[s1.charAt(i)-97] + 1; //funziona il ++ in questo caso? 
			}
		}
		
		//Calcolo quante occorrenze di ogni lettera ci sono nella stringa 2
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i) >= 97 && s2.charAt(i) <= 123) { //considero solo le lettere dell'alfabeto
				letterOccurr[s2.charAt(i)-97] = letterOccurr[s2.charAt(i)-97] - 1; //funziona il ++ in questo caso? 
			}
		}

		
		
		for(int i=0; i<letterOccurr.length; i++) {
			if(letterOccurr[i] != 0) {
				System.out.println("Errore in posizione " + i);
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindroma(String s1) {
		
		String s2 = s1;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");
		
		
		for(int i=0, j=s2.length(); i<s1.length(); i++, j--) {
			if(s1.toLowerCase().charAt(i)!=s2.toLowerCase().charAt(j-1)) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {

		stampaVocali("Ecco la Stringa di test.");
		stampaAlContrario("Stringa al contrario.");
		
		String s = "Stringa abbastanza lunga";
		char c = 'a';
		System.out.println("Il numero di occorrenze di \'" + c + "\' in \"" + s + "\" � " + contaChar(c, s) );
		
		String ana1 = "Tom Marvolo Riddle";
		String ana2 = "  I am Lord Voldemort";
		System.out.println("'" + ana1 + "' e '" + ana2 + "' sono anagrammi? " + isAnagramma(ana1, ana2));
		
		String pal = "I topi non avevano nipoti";
		System.out.println("'" + pal + "' � palindroma? " + isPalindroma(pal));
	}

}
