package n1exercici1;

import java.util.ArrayList;

public class n1exercici1 {

	/*
	 * Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra
	 * classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de
	 * productes i el preu total de la venda.
	 * 
	 * La classe "Venda", té un mètode anomenat calcularTotal() que llança
	 * l’excepció personalitzada VendaBuidaException i mostra per pantalla “Per fer
	 * una venda primer has d’afegir productes” si la col·lecció de productes està
	 * buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i
	 * guardar la suma de tots els preus dels productes a l’atribut preu total de la
	 * venda.
	 * 
	 * L’excepció personalitzada VendaBuidaException ha de ser filla de la classe
	 * Exception. Al seu constructor li hem de passar el missatge “Per fer una venda
	 * primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar
	 * per pantalla amb el mètode getMessage() de l’excepció.
	 * 
	 * Escriu el codi necessari per a generar i capturar una excepció de tipus
	 * ArrayIndexOutOfBoundsException.
	 */

	public static void main(String[] args) throws VendaBuidaException {
		
		
		//test1
		Venda.calcularTotal();
		
		//test2
		testOutOfBounds();

	}

	public static void testOutOfBounds() {
		// ArrayIndexOutOfBoundsException

	
		String[] coleccio = {"producte1", "producte2",};

		Venda item = new Venda();


		for (int i = 0; i < (coleccio.length +3 ); i++) {

			System.out.println(coleccio[i]);

		}

	}
}
