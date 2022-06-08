package Instruments;

public class vent extends instruments {
	
	private static int i;

	public vent(String nom, int preu) {
		super(nom, preu);

	}

	    static {
	    	i =3;
	        System.out.println("Inicialització estàtica vent");
	    }
	

	public void tocar() {

		System.out.println("Està sonant un instrument de vent");

	}
	
	public static void provaCarrega() {
		
		  System.out.println("dins de provaCarrega vent");
		  System.out.println(i);
		  
	}
	
	public void imprimirI() {
		 System.out.println(i);
		
	}

	@Override
	public String toString() {
		return "vent [getNom()=" + getNom() + ", getPreu()=" + getPreu() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



}
