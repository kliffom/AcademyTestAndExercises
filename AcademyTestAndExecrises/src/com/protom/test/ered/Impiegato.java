package com.protom.test.ered;

public class Impiegato extends Persona {
	
	protected double stipendio;
	
	public String getDettagli() {
		return super.nome + ", " + stipendio + "€";
	}
}
