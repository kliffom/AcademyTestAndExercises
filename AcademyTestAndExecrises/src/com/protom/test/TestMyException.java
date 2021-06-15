package com.protom.test;

import com.protom.test.exception.MyException;

public class TestMyException {

	public static void main(String[] args) {
		

		System.out.println("Ora lancio un'eccezione che ho creato io:");

		throw new MyException("Eccezione test");

		
	}

}
