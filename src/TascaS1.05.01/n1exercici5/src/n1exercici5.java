
import java.io.*;

public class n1exercici5 {

  /*- Exercici 5
Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de
desserialitzar.*/

  public static void main(String[] args) {

    Persona objecte1 = new Persona("Spain", 37, "Ari");
    String nomArxiu = "file.ser";


    // Serialization
    try {
      //Saving of object in a file
      FileOutputStream arxiu = new FileOutputStream(nomArxiu);
      ObjectOutputStream outPut = new ObjectOutputStream(arxiu);

      // Method for serialization of object
      outPut.writeObject(objecte1);

      outPut.close();
      arxiu.close();

      System.out.println("L'objecte ha estat serialitzat");

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    }


    // Deserialization
    try {
      // Reading the object from a file
      FileInputStream arxiu = new FileInputStream(nomArxiu);
      ObjectInputStream inPut = new ObjectInputStream(arxiu);

      // Method for deserialization of object
      objecte1 = (Persona) inPut.readObject();

      inPut.close();
      arxiu.close();

      System.out.println("L'Objecte ha estat deserialitzat ");
      System.out.println("pais = " + objecte1.getCountry());
      System.out.println("edat = " + objecte1.getAge());
      System.out.println("nom = " + objecte1.getName());

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException is caught");
    }

  }
}
