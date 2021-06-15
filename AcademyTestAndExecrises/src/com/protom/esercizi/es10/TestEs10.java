package com.protom.esercizi.es10;

public class TestEs10 {

	public static void main(String[] args) {


//		StackA<String> myStackStrA = new StackA<>();
//		
//		System.out.println("Stack vuoto? " + myStackStrA.isEmpty());
//
//		myStackStrA.add("Ciao");
//		myStackStrA.add("Come");
//		myStackStrA.add("Stai");
//		
//		myStackStrA.printAll();
		
//		
//		StackA<Integer> myStackIntA = new StackA<>();
//		myStackIntA.add(1);
//		myStackIntA.add(2);
//		myStackIntA.add(3);
//		myStackIntA.add(4);
//		
//		myStackIntA.printAll();
//		
//		System.out.println("Rimuovo: " + myStackIntA.remove());
//		myStackIntA.add(7);
//		myStackIntA.add(9);
//		
//		myStackIntA.printAll();
//		System.out.println("Rimuovo: " + myStackIntA.remove());
//		myStackIntA.printAll();
//		
//		System.out.println("Ultimo elemento: " + myStackIntA.last());
//		System.out.println("Numero elementi: " + myStackIntA.size());
//		System.out.println("Elementi finiti? " + myStackIntA.isEmpty());
		
		System.out.println("--------------STACK--------------");
		MyStack<Integer> myStack = new MyStack<>();
		
		myStack.add(1);
		myStack.add(2);
		myStack.add(3);
		myStack.add(4);
		
		myStack.printAll();
		
		System.out.println("Rimuovo: " + myStack.remove());
		
		myStack.printAll();
		
		System.out.println("Ultimo: " + myStack.last());
		
		System.out.println("Rimuovo: " + myStack.remove());
		System.out.println("Rimuovo: " + myStack.remove());
		System.out.println("Rimuovo: " + myStack.remove());
		
		myStack.printAll();
		
		System.out.println("--------------FINE STACK--------------");
		System.out.println("--------------QUEUE--------------");
		
		MyQueue<Integer> myQueue = new MyQueue<>();
		
		myQueue.add(1);
		myQueue.add(2);
		myQueue.add(3);
		myQueue.add(4);
		
		myQueue.printAll();
		
		System.out.println("Rimuovo: " + myQueue.remove());
		
		myQueue.printAll();
		
		System.out.println("Ultimo: " + myQueue.last());
		
		System.out.println("Rimuovo: " + myQueue.remove());
		System.out.println("Rimuovo: " + myQueue.remove());
		System.out.println("Rimuovo: " + myQueue.remove());
		
		myQueue.printAll();
		
		System.out.println("--------------FINE QUEUE--------------");
	}

}
