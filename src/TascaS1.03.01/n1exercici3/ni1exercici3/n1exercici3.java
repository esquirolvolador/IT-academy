import java.io.*;
import java.util.*;

public class n1exercici3 {

  /*- Exercici 3
Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i capitals. El programa ha de llegir el fitxer i guardar les dades en un HashMap<String, String>.
El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria, guardat en el HashMap. Es tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en qüestió.
Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria, llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom
de l’usuari/ària i la seva puntuació.
  */

  public static void main(String[] args) {

    HashMap<String, String> countries = new HashMap<String, String>(); //creem hashmap

    try {

      String linea = " ";

      //importem fitxe

      FileReader lectura = new FileReader("/Users/ariannapuig/Documents/GitHub/IT-academy/src" +
              "/TascaS1.03.01/n1exercici3/Countries.txt");
      BufferedReader buffer_lectura = new BufferedReader(lectura);

      // separem pais i capital per l'espai entre elles

      while ((linea = buffer_lectura.readLine()) != null) {
        String[] palabras = linea.split("\s+");

        countries.put(palabras[0], palabras[1]);

      }
      lectura.close();
    }
    //Excepcions
    catch (FileNotFoundException e) {
      System.out.println("Fitxer no trobat");
    } catch (IOException e) {
      System.out.println("Error genèric");

    }
    countriesGame(countries);
  }
    public static void countriesGame(HashMap<String, String> countries){
      Scanner dataInput = new Scanner(System.in);

      System.out.println("Introdueix el nom d'usuari");
      String user = dataInput.nextLine();
      int contador = 0;
      int puntuació = 0;

      do {
        int countrySize = countries.keySet().size(); // obtenim el tamany
        int randomCountry = new Random().nextInt(countrySize); // obtenim la posició random
        List<String> keyListCountries = new ArrayList<>(countries.keySet()); // posem els països
        // en un array
        String randomKey = keyListCountries.get(randomCountry); // obtenim el  pais random

        System.out.println("Pais");
        System.out.println(randomKey); // imprimim el pais random

       // System.out.println(countries.get(randomKey));

        System.out.println("Introdueix la capital");
        String resposta = dataInput.nextLine();

        if (resposta.equalsIgnoreCase(countries.get(randomKey).replaceAll("_", " "))) {

          puntuació += 1;
          contador += 1;

          System.out.println("Correcte! La teva puntuació és " + puntuació);
        } else {
          puntuació += 0;
          contador += 1;

          System.out.println("No has encertat. La teva puntuació és " + puntuació);
        }
      }
      while (contador <= 10);
    }
  }






