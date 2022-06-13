package n1exercici1;

import java.util.ArrayList;

import java.lang.Exception;

public class Venda {

	private ArrayList coleccio;
	private int preutotal;

	public static void calcularTotal() throws VendaBuidaException {

		ArrayList<Venda> coleccio = new ArrayList<>();

		/*
		 * La classe "Venda", té un mètode anomenat calcularTotal() que llança
		 * l’excepció personalitzada VendaBuidaException i mostra per pantalla “Per fer
		 * una venda primer has d’afegir productes” si la col·lecció de productes està
		 * buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i
		 * guardar la suma de tots els preus dels productes a l’atribut preu total de la
		 * venda.
		 */

		
		
		try {

			if (coleccio.size() <= 0) {

				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");

			} else {
				
				int suma = 0;

			for (int i = 0; i < coleccio.size(); i++) {
				suma += i;
				
			}
			}

		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
			
		}

		
	   
	}
}