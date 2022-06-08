package Instruments;

public class corda extends instruments{

	public corda(String nom, int preu) {
		super(nom, preu);
		
	}
	
    static {
        System.out.println("Inicialització estàtica corda");
    }
    

	public void tocar(){
		
		System.out.println("Està sonant un instrument de corda");

	}

	@Override
	public String toString() {
		return "corda [getNom()=" + getNom() + ", getPreu()=" + getPreu() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
