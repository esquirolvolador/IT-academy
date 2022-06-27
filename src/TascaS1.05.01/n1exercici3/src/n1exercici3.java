import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class n1exercici3 {

  /*-
  Els exercicis dels 3 nivells han d'executar-se des de la línia de comandos, i no sols des de l'editor.
- Exercici 3
 Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el
 resultat en un fitxer TXT.*/

  public static void main(String[] args) throws IOException {

    String directorio = "/Users/ariannapuig/Documents/GitHub/IT-academy/src/";
    File carpeta = new File(directorio);
    File fileToWrite = new File("filewriter.txt");
    FileWriter fileWriter =  new FileWriter(fileToWrite);
//    String[] listado = carpeta.list();
//    File[] archivos = carpeta.listFiles();
//
//    if (carpeta.exists()) {
//      if (carpeta.isDirectory()) {
//        Arrays.sort(archivos);
//
//        for (int i = 0; i < archivos.length; i++) {
//          System.out.println(archivos[i].getName());
//
//        }
//      }
 //   }
    llistarArbre(directorio, fileWriter);
    fileWriter.close();

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



  }

