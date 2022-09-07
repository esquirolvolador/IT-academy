package cat.itacademy.barcelonactiva.Puig.Arianna.s04.t02.n02.model.dto;


public class FruitaDto {

  private static String nom;


  private static int quantitatQuilos;

  private static int id;
  public FruitaDto() {
  }

  public FruitaDto(int id, String nom, int quantitatQuilos) {
    this.id = id;
    this.nom = nom;
    this.quantitatQuilos = quantitatQuilos;
  }

  public static String getNom() {
    return nom;
  }

  public static int getId() {
    return id;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public static int getQuantitatQuilos() {
    return quantitatQuilos;
  }

  public void setQuantitatQuilos(int quantitatQuilos) {
    this.quantitatQuilos = quantitatQuilos;
  }
}


