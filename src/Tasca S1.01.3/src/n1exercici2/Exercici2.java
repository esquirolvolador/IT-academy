package n1exercici2;

public class Exercici2 {
	
	/*
	 * Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca
	 * ha de ser estàtic final, el model estàtic i la potència final. Demostra la
	 * diferència entre els tres. N’hi ha algun que es pugui inicialitzar al
	 * constructor de la classe?
	 * 
	 * Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar()
	 * i un altre no estàtic anomenat accelerar(). El mètode accelerar ha de mostrar
	 * per consola: “El vehicle està accelerant” i el mètode frenar() ha de mostrar:
	 * “El vehicle està frenant”.
	 * 
	 * Demostra com invocar el mètode estàtic i el no estàtic des del main() de la
	 * classe principal.
	 */

	public static void main(String[] args) {

	
		testEstatic();
		
	//	testFinal(); //si no comentem aquest mètode, ens fallarà, perquè estem intentant canviar el valor de potencia, que no és possible perquè és un atribut final
		// rebrem l'excepció "The final field Cotxe.potencia cannot be assigned" si intentem executar-ho
		testMetodes();
		
	}
		
		public static void testEstatic() {

		Cotxe audi = new Cotxe("15", 200);
		audi.imprimirModel();
		
		Cotxe mercedes = new Cotxe("slk", 400);
		mercedes.imprimirModel();
		
		audi.imprimirModel(); //el  model, al ser estàtic, s'ha substituït per haver creat un altre objecte amb un nou valor.
		}
		
		
		
		public static void testFinal() {
			
		Cotxe audi = new Cotxe("15", 200);
		Cotxe mercedes = new Cotxe("slk", 400);
			
		audi.setPotencia(20); //si intentem canviar el valor de la potencia rebrem un error, si deixem la linia 36 de la classe cotxe comentada i intentem executar aquesta,
		//veurem que encara que ho intentem, no podrem canviar el valor 
		
		audi.imprimirPotencia(); // si intentem canviar el valor, veurem que no canvia.
		
		audi.imprimirMarca(); // marca al ser estàtic i final no canvia encara que creem nous objectes.
		mercedes.imprimirMarca(); // marca al ser estàtic i final no canvia encara que creem nous objectes.
		
		}
		
		
		public static void testMetodes() {
			
			Cotxe audi = new Cotxe("15", 200);
			
			audi.frenar();
			audi.accelerar();
			
			Cotxe.frenar();
		}
	
	}


