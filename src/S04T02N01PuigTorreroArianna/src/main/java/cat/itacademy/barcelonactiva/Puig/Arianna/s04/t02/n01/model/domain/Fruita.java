package cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n01.model.domain;
import javax.persistence.*;

@Entity
@Table(name = "fruites")
public class Fruita {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "nom")
  private String nom;
  @Column(name = "quantitatQuilos")
  private int quantitatQuilos;

  public Fruita() {
  }
  public Fruita(int id, String nom, int quantitatQuilos) {
    this.id = id;
    this.nom = nom;
    this.quantitatQuilos = quantitatQuilos;
  }


  public int getId() {
    return id;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getQuantitatQuilos() {
    return quantitatQuilos;
  }

  public void setQuantitatQuilos(int quantitatQuilos) {
    this.quantitatQuilos = quantitatQuilos;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
