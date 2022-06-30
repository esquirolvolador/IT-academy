package Classes;

public class TreballadorPresencial extends Treballador{

  private static int benzina= 70;


  public TreballadorPresencial(String nom, String cognom, int preuHora, int benzina) {
    super(nom, cognom, preuHora);
  }

  public static int getBenzina() {
    return benzina;
  }

  public static void setBenzina(int benzina) {
    TreballadorPresencial.benzina = benzina;
  }

  @Override
  public  void calcularSou(int horesTreballades){
    int sou =( horesTreballades * getPreuHora()) + benzina;
    System.out.println("el sou és " + sou);
  }

  @Deprecated
  public int suplementBenzina(int benzina, int pujadaBenzina){
    int suplement = benzina *  pujadaBenzina;
    return suplement;
  }

  @Override
  public String toString() {
    return "TreballadorPresencial{}";
  }
}
