package com.protom.test;
import com.protom.test.ered.*;

public class TestEred {

	public static void main(String[] args) {
		
		
		Impiegato imp = new Impiegato();
		Impiegato op = new Operaio("Vendita");
		Impiegato man = new Manager("SUD");
		Impiegato mann = new Manager("NORD");
		

	}
	
	public static void calcolaStipendio(Impiegato i) { // sfrutto argomenti polimorfici
		
		//con gli argomenti polimorfici bisogna SEMPRE verificare il tipo dell'oggetto passato prima di effettuare il cast, 
		//altrimenti potrebbe dare eccezione
		if(i instanceof Operaio) {
			Operaio o = (Operaio) i; //casto l'oggetto per poterne chiamare gli attriuti
			o.getReparto();
		}
		else if(i instanceof Manager) {
			Manager m = (Manager) i;
			m.getArea();
		}
	}

}
