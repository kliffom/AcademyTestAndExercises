package com.protom.studente;

public class Studente {

	protected String nome;
	protected String matricola;
	
	public static class Triennale extends Studente{
		
		private static String prefisso;
		
		public Triennale(String inNome, String inMatricola) {
			nome = inNome;
			matricola = inMatricola;
		}
		
		public static void setPrefisso(String inPrefisso) {
			prefisso = inPrefisso; 
		}
		
		@Override
		public String toString() {
			return nome + " " + prefisso +  "/" + matricola;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this.getClass()!=obj.getClass())
				return false;
			Triennale s = (Triennale) obj;
			if(this.matricola.contentEquals(s.matricola) && this.nome.contentEquals(s.nome))
				return true;
			else
				return false;
		}
		
		
	}
	
	public static class Magistrale extends Studente{
		
		private static String prefisso;
		
		public Magistrale(String inNome, String inMatricola) {
			nome = inNome;
			matricola = inMatricola;
		}
		
		public static void setPrefisso(String inPrefisso) {
			prefisso = inPrefisso; 
		}
		
		@Override
		public String toString() {
			return nome + " " + prefisso +  "/" + matricola;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this.getClass()!=obj.getClass())
				return false;
			Magistrale s = (Magistrale) obj;
			if(this.matricola.contentEquals(s.matricola) && this.nome.contentEquals(s.nome))
				return true;
			else
				return false;
		}
		
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricola == null) ? 0 : matricola.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Studente s = (Studente) obj;
		if(this.matricola.contentEquals(s.matricola) && this.nome.contentEquals(s.nome))
			return true;
		else
			return false;
	}
	 
	
	
	
	
}
