import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class n1exercici2 {

  /*- Exercici 2
Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings
que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.
   */

  public static void main(String args[] ){

    String mes[] = new String[] { "enero","febrero","marzo","abril","mayo","junio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre" };

    List<String> meses = Arrays.asList(mes);

    meses.parallelStream()
            .filter(name -> (name.length() > 5))
            .filter(name-> name.contains("o"))
            .forEach(System.out::println);
            };

  }


