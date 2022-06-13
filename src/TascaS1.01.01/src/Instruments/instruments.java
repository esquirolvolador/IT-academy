package Instruments;

public abstract class instruments {

	private String nom;
	private int preu;

	public instruments(String nom, int preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	public abstract void tocar();

	@Override
	public String toString() {
		return "instruments [nom=" + nom + ", preu=" + preu + "]";
	}
}
