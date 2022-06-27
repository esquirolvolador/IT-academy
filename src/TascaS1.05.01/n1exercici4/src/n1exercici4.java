import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class n1exercici4 {

  /*-
  Els exercicis dels 3 nivells han d'executar-se des de la línia de comandos, i no sols des de l'editor.
- Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.*/

  public static void main(String[] args) throws IOException {

    String directorio = "/Users/ariannapuig/Documents/GitHub/IT-academy/src/";
    File carpeta = new File(directorio);
    File fileToWrite = new File("filewriter.txt");
    FileWriter fileWriter =  new FileWriter(fileToWrite);

   // llistarArbre(directorio, fileWriter);
   // fileWriter.close();
    llegirFitxer();

  }

  public static String llistarArbre(String directorio, FileWriter fileWriter) {
    File rutaArxiu = new File(directorio);
    File[] arxius = rutaArxiu.listFiles();

    try {

      if (rutaArxiu.exists()) {
        if (arxius == null) {
          fileWriter.write("No hi ha fitxers en el directori que has indicat");

        } else {
          Arrays.sort(arxius);
          for (int i = 0; i < arxius.length; i++) {

            if (arxius[i].isFile()) {
              fileWriter.write("(F)" + arxius[i].getAbsolutePath());

              SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
              fileWriter.write(" Ultima data de modificació: " + DateFormat.format(arxius[i].lastModified())+ "\r\n");


            } else if (arxius[i].isDirectory()) {

              fileWriter.write("(D)" + arxius[i].getAbsolutePath());
              SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
              fileWriter.write(" Ultima data de modificació: " + DateFormat.format(arxius[i].lastModified()) + "\r\n" );

              llistarArbre(arxius[i].getAbsolutePath(), fileWriter );

            }
          }
        }
      } else {
        fileWriter.write("El directori o la ruta no existeixen.");


      }

    } catch (IOException e) {
      e.printStackTrace();
    }


    return directorio;
  }

public static void llegirFitxer () throws IOException {

    /*The read() method of a Java BufferedReader returns an int which contains the char value of
    the next character read. If the read() method returns -1, there is no more data to read in the BufferedReader, and it can be closed.
    That is, -1 as int value, not -1 as byte or char value. There is a difference here! */

  Reader lector =
          new BufferedReader(new FileReader("/Users/ariannapuig/Documents/GitHub/IT-academy/src" +
                  "/TascaS1.05" + ".01/n1exercici4/src/Dades.txt"));

  int valorChar = lector.read();
  while(valorChar != -1) {
    char caracters = (char) valorChar;

    /*reads a single character from the Java BufferedReader and checks if the char numerical value is equal to -1. If not,
    it processes that char and continues reading until -1 is returned from the BufferedReader read() method.
     */

    System.out.print(caracters);

    valorChar = lector.read();
  }
    }
  }










