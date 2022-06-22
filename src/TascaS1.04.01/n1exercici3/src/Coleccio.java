public class Coleccio {

  /*- Exercici 3
Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
Verifica el seu correcte funcionament amb un test jUnit.*/

  public Coleccio() {
  }

  public void printColeccio () {    // ArrayIndexOutOfBoundsException


      String[] coleccio = {"producte1", "producte2",};


      for (int i = 0; i < (coleccio.length + 3); i++) {

        System.out.println(coleccio[i]);

      }
    }

}
