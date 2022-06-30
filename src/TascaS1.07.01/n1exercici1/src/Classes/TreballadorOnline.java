package Classes;

public class TreballadorOnline extends Treballador{

private static final int PREUINTERNET =50;

  public TreballadorOnline(String nom, String cognom, int preuHora, int PREUINTERNET) {
    super(nom, cognom, preuHora);
  }

@Override
  public  void calcularSou(int horesTreballades){
    int sou =( horesTreballades * getPreuHora()) + PREUINTERNET;
  System.out.println("el sou és " + sou);
  }

  @Override
  public String toString() {
    return "TreballadorOnline{}";
  }
}
