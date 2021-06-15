package com.protom.musica;

public class ScalaDiFrequenza {

	public static int getInterval(Note a, Note b) {
		
		return b.getValue() - a.getValue();
	}
}
