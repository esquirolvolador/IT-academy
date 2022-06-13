package n1exercici1;

import java.util.Scanner;

import Instruments.corda;
import Instruments.instruments;
import Instruments.percussio;
import Instruments.vent;

public class exercici1 {

	/*
	 * En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha
	 * instruments de vent, de corda i de percussió.
	 * 
	 * Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més,
	 * tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe instrument
	 * i, per tant, s’ha d’implementar a les classes filles. Si s’està tocant un
	 * instrument de vent, el mètode ha de mostrar per consola:
	 * "Està sonant un instrument de vent", si s’està tocant un instrument de corda:
	 * “Està sonant un instrument de corda” i si s’està tocant un instrument de
	 * percussió: “Està sonant un instrument de percussió”.
	 * 
	 * El procés de càrrega d'una classe només té lloc una vegada. Demostra que la
	 * càrrega pot ser provocada per la creació de la primera instància d'aquesta
	 * classe o per l'accés a un membre estàtic d'aquesta.
	 * 
	 * Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.
	 */

	public static void main(String[] args) {

		test1();
		// test2();

	}

	public static void test1() { // inicialització d'un objecte que inicialitza de forma estàtica la "i" . Quan
									// printem mostra el valor estàtic

		vent flauta = new vent("hofner", 100);
		flauta.imprimirI();
	}

	public static void test2() { // no inicialitza cap objecte, sino que crida directament un mètode que només
									// printa.
		// I efectivament printa el mateix valor que si haguéssim inicialitzat un
		// objecte

		vent.provaCarrega();
	}

}
