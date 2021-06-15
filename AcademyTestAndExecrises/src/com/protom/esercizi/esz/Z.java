package com.protom.esercizi.esz;

public class Z {

	private Z other;
	private int val;
	
	
	
	//1) No, perch� se x.val � maggiore di y.val non soddisfano la condizione di simmetria, quindi x e y non possono essere uguali. 
	
	//2) S�, perch� se x.val e y.val sono entrambi pari, allora soddisferanno le condizioni di riflessivit�, simmetria e transitivit�.
	
	//3) No, perch� possiamo avere x.val==y.val ma non sappiamo se anche gli altri attributi dell'oggetto interno lo sono.
	
	//4) S�, vengono rispettate tutte le condizioni della equals. 
	
	
	@Override
	public boolean equals(Object obj) {
		
		
		if (this.equals(obj))
			return true;
		Z zObj = (Z) obj;
		if(this.other==null && zObj.other==null)
		if(this!=null && zObj.other != null) {
			if(this.val == zObj.val)
				return true;
		}
		return false;
	}

}
