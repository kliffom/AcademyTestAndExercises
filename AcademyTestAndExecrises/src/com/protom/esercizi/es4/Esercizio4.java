package com.protom.esercizi.es4;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

public class Esercizio4 {

	
	public static void utilities(int[] arr) {
		
		Random rand = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
	}
	
	public static int maxArray(int[] arr) {
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		
		return max;
	}
	
	public static boolean contains(int e, int[] array) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i]==e)
				return true;
		}
		return false;
	}
	
	public static int media(int[] arr) {
		
		int media = 0;
		
		for(int i=0; i<arr.length; i++) {
			media += arr[i];
		}
		
		return media/arr.length;
	}
	
	public static int mostRecurrentNoSort(int[] array) {
		
		int recurrent = 0;  //conterr� il numero pi� ricorrente
		int recurValue = 0; //conterr� il numero di volte quel numero � presente nell'array
		
		Hashtable<Integer, Integer> numsOccurr = new Hashtable<Integer, Integer>();
		
		for(int i=0; i<array.length; i++) {
			if(!numsOccurr.containsKey(array[i])) { //se non c'�, lo inserisco con contatore 1
//				System.out.println("Valore " + array[i] + " mai visto. Lo inserisco.");
				numsOccurr.put(array[i], 1);
			}
			else { //se c'�, ne incremento il contatore
				numsOccurr.replace(array[i], numsOccurr.get(array[i]) + 1);
//				System.out.println("Valore " + array[i] + " gi� visto. Lo aggiorno. (" + numsOccurr.get(array[i]) + ")");
			}
		}
		
		Enumeration<Integer> values = numsOccurr.keys();
		while(values.hasMoreElements()) {
			int key = values.nextElement();
			if(numsOccurr.get(key) > recurValue) {
				recurValue = numsOccurr.get(key);
				recurrent = key;
//				System.out.println("Trovata occorrenza maggiore: Num " + key + ", " + recurValue + " volte.");
			}
		}
		
		return recurrent;
	}
	
	public static int mostRecurrent(int[] array) {
		int recurrent = 0; //contiene il numero con il massimo numero di occorrenze
		int recurMaxValue = 0; //contiene il massimo numero di occorrenze
		
		int localRecurrent = 0; //lo utilizzo per determinare il numero che sto controllando al momento
		int localCount = 0; //lo utilizzo per tener conto del numero di occorrenze del numero
		
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == localRecurrent) {//se � il numero che sto ancora contando
				localCount++;
			}
			else { //se non � pi� il numero che sto contando
				if(localCount>recurMaxValue) { //controllo se � il massimo tra quelli visti fin'ora
					recurMaxValue = localCount;
					recurrent = localRecurrent;
				}
				localCount = 1;
				localRecurrent = array[i];
			}
		}
		
		
		return recurrent;
	}
	
	public static int mediaDivTre(int[] arr) {
		
		int media = 0;
		int counter = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3 == 0) { //ho un multiplo di 3
				media += arr[i];
				counter++;
			}
		}
		
		return media/counter;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		System.out.println("Assegno valori random all'array:");
		utilities(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("Il maggiore tra i generati � " + maxArray(arr));
		
		//arr[5] = 10;
		System.out.println("L'array contiene 10? " + contains(10, arr));
		
		int[] mediaArr = {2, 4, 6, 8, 10, 12, 10, 10, 12, 12, 12, 15, 10, 10, 10, 10};
		System.out.println("La media dei valori � " + media(mediaArr));
		
		System.out.println("Il valore maggiormente ricorrente � " + mostRecurrentNoSort(mediaArr));
		
		System.out.println("Il valore maggiormente ricorrente � " + mostRecurrent(mediaArr));
		
		System.out.println("La media dei valori multipli di 3 � " + mediaDivTre(mediaArr));
		
	}

}
