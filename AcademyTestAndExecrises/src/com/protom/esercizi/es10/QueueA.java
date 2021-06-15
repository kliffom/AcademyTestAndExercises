package com.protom.esercizi.es10;

public class QueueA <T> implements Methods<T> {

	
	private T[] arr;
	private final int MAX_SIZE = 256;
	private int first;
	private int last;
	
	public QueueA() {
		arr = (T[]) new Object[MAX_SIZE];
		first = 0; 
		last = 0;
	}
	
	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove() {
		if(!isEmpty())
			;
		return null;
	}

	@Override
	public T last() {
		if(!isEmpty())
			return arr[last];
		return null;
	}

	@Override
	public void printAll() {
		
		for(int i=first; i<last; i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println();
		
	}

	@Override
	public boolean isEmpty() {
		
		if(first==last)
			return false;
		else 
			return true;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
