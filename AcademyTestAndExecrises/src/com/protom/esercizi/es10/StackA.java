package com.protom.esercizi.es10;


public class StackA <T> implements Methods<T> {

	
	private T[] arr;
	private final int MAX_SIZE = 256;
	private int index;
	
	public StackA() {
		arr = (T[]) new Object[MAX_SIZE];
		index = 0;
	}
	
	@Override
	public void add(T t) {
		
		if(index<MAX_SIZE) {
			arr[index++] = t;
		}
		else
			throw new IndexOutOfBoundsException();
		
	}

	@Override
	public T remove() {
		
		if(!isEmpty()) {
			T last = last();
			arr[--index] = null;
			
			return last;
		}
		return null;
	}

	@Override
	public T last() {
		if(!isEmpty())
			return arr[index-1];
		return null;
	}

	@Override
	public void printAll() {
		
		for(int i=0; i<index; i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println();
		
	}

	@Override
	public boolean isEmpty() {

		if(index>0)
			return false;
		else {
			if(arr[index]!=null)
				return false;
			else
				return true;
		}
		
	}

	@Override
	public int size() {
 
		return index;
	}

}
