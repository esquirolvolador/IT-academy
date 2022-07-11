import java.util.Arrays;
import java.util.List;

public class n1exercici3 {

  //Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.

  public static void main(String args[] ){

    String mes[] = new String[] { "enero","febrero","marzo","abril","mayo","junio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre" };

    List<String> meses = Arrays.asList(mes);

    meses.stream().forEach(System.out::println);

  }
}
