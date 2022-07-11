import java.util.ArrayList;
import java.util.List;

public class Restaurants {

  String name;
  String poblacio;

  public Restaurants(String name, String poblacio) {
    this.name = name;
    this.poblacio = poblacio;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPoblacio() {
    return poblacio;
  }

  public void setPoblacio(String poblacio) {
    this.poblacio = poblacio;
  }

  public static List<Restaurants> crearLlista(){

    List<Restaurants> llistaRestaurants = new ArrayList<>();
    llistaRestaurants.add(new Restaurants("El tupí de la Cerdanya", "Bor"));
    llistaRestaurants.add(new Restaurants("La formatgeria de Llívia", "Llívia"));
    llistaRestaurants.add(new Restaurants("Cal Cofa", "Llívia"));
    llistaRestaurants.add(new Restaurants("El Trill", "Planoles"));
    llistaRestaurants.add(new Restaurants("El Bistrot", "Alp"));
return llistaRestaurants;
  }
}