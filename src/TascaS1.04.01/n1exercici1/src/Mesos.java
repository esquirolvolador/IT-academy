import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mesos {

  /*Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
Verifica amb jUnit que la llista té 12 posicions, que no és nul·la i que en la seva posició 8
conté el nom 'agost'.*/


  private List<String> mesosOrdenat;

  public Mesos() {
    mesosOrdenat = new ArrayList<String>();
    mesosOrdenat.add("Gener");
    mesosOrdenat.add("Febrer");
    mesosOrdenat.add("Març");
    mesosOrdenat.add("Abril");
    mesosOrdenat.add("Maig");
    mesosOrdenat.add("Juny");
    mesosOrdenat.add("Juliol");
    mesosOrdenat.add("Agost");
    mesosOrdenat.add("Setembre");
    mesosOrdenat.add("Octubre");
    mesosOrdenat.add("Novembre");
    mesosOrdenat.add("Desembre");
  }

  public List<String> getMesosOrdenat() {
    return mesosOrdenat;
  }

  public String getMes(int numMes){
    return mesosOrdenat.get(numMes -1);
  }

  public int numMesos() {
   return mesosOrdenat.size();
  }
}








