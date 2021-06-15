package com.protom.musica;

public class TestFrequenze {

	public static void main(String[] args) {
		
		System.out.println(ScalaDiFrequenza.getInterval(Note.DO, Note.MI));
		System.out.println(ScalaDiFrequenza.getInterval(Note.MI, Note.LA));
		System.out.println(ScalaDiFrequenza.getInterval(Note.LA, Note.SOL));

	}

}
