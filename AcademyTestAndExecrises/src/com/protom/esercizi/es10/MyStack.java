package com.protom.esercizi.es10;

import java.util.Iterator;

public class MyStack <T> implements Methods<T>, Iterable<T> {
	
	public static class Entry<T> {
		
		private T element;
		private Entry<T> previous;
		
		Entry() {}
		
		private Entry(T t) { this.element = t; }
		
		public T getElement() { return element; }
		
		public Entry<T> getPrevious() { return previous; }
		
	}

	private Entry<T> head;
	private Entry<T> tail;
	
	private int size; //viene automaticamente inizializzato a 0
	
	@Override
	public void add(T t) {

		
		Entry<T> value = new Entry<>(t);
		
		if(head==null) {
			head = value;
			tail = head;
		} else {
			value.previous = tail;
			tail = value;
		}
		size++;
		
	}

	@Override
	public T remove() {
		
		if(--size<0) {
			throw new IndexOutOfBoundsException("Eliminazione elemento fuori dal range.");
		}
		T val = tail.element;
		tail = tail.previous;
		return val;
	}

	@Override
	public T last() {
		return tail.element;
	}

	@Override
	public void printAll() {
		
		if(!isEmpty()) {
			for(T t: this) {
				System.out.print(t + " ");
			}
			System.out.println();
		} else {
			System.out.println("Vuoto.");
		}
	}

	@Override
	public boolean isEmpty() {

		if(size==0)
			return true;
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
			
			private Entry<T> cursor;
			
			{
				cursor = new Entry<>();
				cursor.previous = tail;
			}

			@Override
			public boolean hasNext() {
				return cursor.previous!=null;
			}

			@Override
			public T next() {
				cursor = cursor.previous;
				return cursor.element;
			}
			
		};
	}

}
