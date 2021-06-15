package com.protom.test.anonim;

/*
 *  TEST CLASSE ANONIMA IN METODO byPower()
 */

public class Engine {

	private double cilindrata;
	private double cavalli;
	
	private boolean confrontoCilindrata;
	private boolean confrontoCavalli;
	
	public Engine(double inCilindrata, double inCavalli) {
		this.cilindrata = inCilindrata;
		this.cavalli = inCavalli;
		confrontoCavalli = true;
		confrontoCilindrata = true;
	}
	
	//dal punto di vista della sicurezza non � il massimo usare i setter in questo caso
	private void setConfrontoCilindrata(boolean confrontoCilindrata) {
		this.confrontoCilindrata = confrontoCilindrata;
	}

	private void setConfrontoCavalli(boolean confrontoCavalli) {
		this.confrontoCavalli = confrontoCavalli;
	}

	public Engine byVolume() {
		
		Engine e = this.clone();
		e.setConfrontoCavalli(false);
		return e;
	}
	
	public Engine byPower()  {
		/*
		Engine e = this.clone();
		e.setConfrontoCilindrata(false);
		*/
		
		
		Engine e = new Engine(cilindrata, cavalli) {
			//qui andiamo a dichiarare tutto il corpo del nuovo oggetto
			//possiamo inserire nuove variabili, nuovi metodi o overridare quelli vecchi
			
			@Override
			public boolean equals(Object obj) { //sovrascrivo la equals in modo che venga controllata solo la potenza
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Engine other = (Engine) obj;
				if (cavalli != other.cavalli)
					return false;
				return true;
			}
			
		};
		return e; 
	}
	
	
	@Override
	protected Engine clone()  {
		// TODO Auto-generated method stub
		return new Engine(this.cilindrata, this.cavalli);
	}

	@Override
	public String toString() {
		return "(" + cilindrata + " cm3, " + cavalli + " CV)";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + cavalli);
		result = (int) (prime * result + cilindrata);
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (cavalli != other.cavalli && confrontoCavalli)
			return false;
		if (cilindrata != other.cilindrata && confrontoCilindrata)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		
		Engine a = new Engine(1200, 69), b = new Engine(1200, 75), c = new Engine(1400, 75);
		System.out.println(a);
		System.out.println(a.equals(b));
		Engine aVol = a.byVolume(), bVol = b.byVolume();
		System.out.println(aVol);
		System.out.println(aVol.equals(bVol));
		System.out.println(a==aVol);
		Engine bPow = b.byPower(), cPow = c.byPower();
		System.out.println(bPow);
		System.out.println(bPow.equals(cPow));
		
	}
	
}
