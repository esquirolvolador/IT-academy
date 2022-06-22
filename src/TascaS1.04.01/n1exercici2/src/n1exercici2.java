import java.util.Scanner;

public class n1exercici2 {

  public static void main(String[] args) {

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Introdueix el teu dni");
//    String dni = sc.nextLine();


    CalculoDni dni = new CalculoDni();
    char resultat =  dni.calculLletra(45544815);
    System.out.println(resultat);

  }

}
