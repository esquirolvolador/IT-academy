package n1exercici1;

import java.lang.Exception;

public class VendaBuidaException extends Exception {

	// VendaBuidaException llança un error si la col·lecció de productes està buida.

	//private String missatge =  "Per fer una venda primer has d’afegir productes";
	

	public VendaBuidaException(String missatge) {
		super(missatge);
		//this.missatge = missatge;

	}

}
