package com.protom.test.exception;

public class MyException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}
	
	public MyException(String message, Exception e) { //oltre al messaggio gli passiamo anche l'eccezione di partenza così da avere uno stack aggiuntivo
		super(message, e);
	}
	
	
}
