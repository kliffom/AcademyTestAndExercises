package com.protom.musica;

public enum Note {

	DO(1),
	RE(3),
	MI(5),
	FA(6),
	SOL(8),
	LA(10),
	SI(12);
	
	private int value;
	
	private Note(int inValue) {
		this.value = inValue;
	}
	
	public int getValue() {
		return this.value;
	}
	
}
