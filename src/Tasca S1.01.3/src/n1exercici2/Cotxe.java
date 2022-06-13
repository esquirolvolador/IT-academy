package n1exercici2;

public class Cotxe {

	private static final String marca = "marca"; // no es pot inicialitzar al constructor de la classe, la marca no canviarà pels objectes perquè és constant
	private static String model;
	private final int potencia;

	public Cotxe(String model, int potencia) {

		this.model = model;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca() {
	//	this.marca = marca; (no podem fer un setter de la marca perquè l'atribut és static i final, per tant, una constant)
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPotencia() {
		return potencia;
	}
	
	public void setPotencia(int potencia) {   
    this.potencia = potencia; //(no podem fer un setter de la potència perquè l'atribut és final, si no ho comentem, rebem un exception)
	}

	public void imprimirModel() {
		System.out.println(model);
	}
	
	public void imprimirPotencia() {
		System.out.println(potencia);
	}
	
	public void imprimirMarca() {
		System.out.println(marca);
	}
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}

	public void accelerar() {

		System.out.println("El vehicle està accelerant");

	}

}
