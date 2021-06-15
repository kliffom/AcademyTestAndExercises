package com.protom.test.generics;

import java.util.Arrays;

public class Contenitore <T>{

	private T[] array;
	
	public Contenitore(int dim) {
		array = (T[]) new Object[dim];
	}
	
	public void add(T inAdd, int pos) {
		if(pos<=array.length)
			array[pos] = inAdd;
	}
	
	public void delete(int pos) {
		if(pos<=array.length)
			array[pos] = null;
	}
	
	public T get(int index) {
		return array[index];
	}

	@Override
	public String toString() {
		
		String ret = "Contenitore [array="; 
		
		for(int i=0; i<array.length; i++)
			ret += "[" + array[i] + "]";
		
		return ret+"]";
	}
	
	
}
