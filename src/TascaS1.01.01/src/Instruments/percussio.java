package Instruments;

public class percussio extends instruments{

	public percussio(String nom, int preu) {
		super(nom, preu);
	
	}
	
    static {
        System.out.println("Inicialització estàtica percussió");
    }

	public void tocar(){
		
		System.out.println("Està sonant un instrument de percussió");

	}

	@Override
	public String toString() {
		return "percussio [getNom()=" + getNom() + ", getPreu()=" + getPreu() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
