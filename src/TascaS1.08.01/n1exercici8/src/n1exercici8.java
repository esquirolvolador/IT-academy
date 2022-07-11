public class n1exercici8 {

  /*- Exercici 8
Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String.
En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni
la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.
   */

  public static void main(String args[] ){
    Reverse reverse = (stringReverse) -> { String result = "";
      for(int i = stringReverse.length()-1; i >= 0; i--)
        result += stringReverse.charAt(i);
      return result;
    };
    System.out.println("Caracola al revés és " + reverse.reverse("Caracola"));

  }
}
