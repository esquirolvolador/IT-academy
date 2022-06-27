import java.io.Serializable;

public class Persona implements Serializable {

  private static final long serialVersionUID = 1L; //identificador
  private String country;
  private int age;
  private String name;

  public Persona(String country, int age, String name) {
    this.country = country;
    this.age = age;
    this.name = name;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}


