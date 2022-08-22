import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class exercici1 {

  public static void main(String[] args) {
    // ArrayList<String> comandes = new ArrayList();

   /* Scanner dataInput = new Scanner(System.in);
    int i = 0;

    String comanda;
    do {
      System.out.println("Comanda");
      comanda = dataInput.nextLine();
      i++;
      Undo.getInstance().addToArray(comanda);
    }
    while (i < 3);*/


    Undo.getInstance().addToArray( "nova comanda");
    Undo.getInstance().addToArray( "comanda 1");
    Undo.getInstance().addToArray( "comanda 2");
    Undo.getInstance().undo();

   Undo.getInstance().history();
  }
}
