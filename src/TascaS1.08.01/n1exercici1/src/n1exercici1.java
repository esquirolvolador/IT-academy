
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n1exercici1 {

  /*Exercici 1
A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes
que contenen la lletra ‘o’. Imprimeix el resultat.*/


  public static void main(String args[] ){

    String mes[] = new String[] { "enero","febrero","marzo","abril","mayo","junio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre" };

    List<String> meses = Arrays.asList(mes);

    meses.stream().filter(name-> name.contains("o")).forEach(System.out::println);
  }
}
