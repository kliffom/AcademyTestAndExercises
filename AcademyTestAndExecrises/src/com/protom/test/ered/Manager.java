package com.protom.test.ered;

public class Manager extends Impiegato{
	
	private String loc;
	
	public Manager(String inLoc) {
		this.loc = inLoc;
	}

	public String getArea() {
		return this.loc;
	}
	
	

}
