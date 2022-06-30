package Classes;

public class Treballador {

  //cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores
  // treballades i el multiplica pel preu/hora

  private String nom;
  private String cognom;
  private int preuHora;

  public Treballador(String nom, String cognom, int preuHora) {
    this.nom = nom;
    this.cognom = cognom;
    this.preuHora = preuHora;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getCognom() {
    return cognom;
  }

  public void setCognom(String cognom) {
    this.cognom = cognom;
  }

  public int getPreuHora() {
    return preuHora;
  }

  public void setPreuHora(int preuHora) {
    this.preuHora = preuHora;
  }

 public void calcularSou(int horesTreballades){
   int sou = horesTreballades * getPreuHora();
   System.out.println("el sou és " + sou);
 }
}
