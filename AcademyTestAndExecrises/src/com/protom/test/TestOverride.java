package com.protom.test;

import com.protom.test.override.*;

public class TestOverride {

	public static void main(String[] args) {
		
		A a = new B();
		System.out.println(a.idx + " " + a.getIdx()); //a.idx prende il valore di idx in A, mentre il metodo è sovrascritto e prenderà quello di B
		B b = (B) a;
		System.out.println(b.idx + " " + b.getIdx());

		
	}

}
