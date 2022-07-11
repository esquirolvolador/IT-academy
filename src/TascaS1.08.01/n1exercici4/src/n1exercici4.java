import java.util.Arrays;
import java.util.List;

public class n1exercici4 {

  //Fer la mateixa impressió del punt anterior, però mitjançant method reference.

  public static void main(String args[] ){

    String mes[] = new String[] { "enero","febrero","marzo","abril","mayo","junio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre" };

    List<String> meses = Arrays.asList(mes);

    meses.forEach(System.out::println);

  }
}
