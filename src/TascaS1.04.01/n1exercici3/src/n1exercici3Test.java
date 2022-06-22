
import org.junit.Test;


public class n1exercici3Test {

  Coleccio coleccio1 = new Coleccio();
  String[] coleccio = {"producte1", "producte2",};

  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void testPrintColeccio() {
    System.out.println("Dins de printColeccio");
    coleccio1.printColeccio();
  }
}