import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class n1exercici2Directoris {

  /*-
  Els exercicis dels 3 nivells han d'executar-se des de la línia de comandos, i no sols des de l'editor.
  - Exercici 2
Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut de tots els seus
nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un
directori (D) o un fitxer (F), i la seva última data de modificació.*/

    public static void main(String[] args) {

      String directorio = "/Users/ariannapuig/Documents/GitHub/IT-academy/src/";
      File carpeta = new File(directorio);
      String[] listado = carpeta.list();
      File[] archivos = carpeta.listFiles();

      if (carpeta.exists()) {
        if (carpeta.isDirectory()) {
          Arrays.sort(archivos);

          for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i].getName());

          }
        }
      }
      llistarArbre(directorio);
    }

      public static void llistarArbre(String directorio){
        File rutaArxiu = new File(directorio);
        File[] arxius = rutaArxiu.listFiles();

        if (rutaArxiu.exists()) {
          if (arxius == null) {
            System.out.println("No hi ha fitxers en el directori que has indicat");
          } else {
            Arrays.sort(arxius);
            for (int i = 0; i < arxius.length; i++) {

              if (arxius[i].isFile()) {
                System.out.println("(F)" + arxius[i].getAbsolutePath());
                SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                System.out.println(" Ultima data de modificació: " + DateFormat.format(arxius[i].lastModified()));
              } else if (arxius[i].isDirectory()) {

                System.out.println("(D)" + arxius[i].getAbsolutePath());
                SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                System.out.println(" Ultima data de modificació: " + DateFormat.format(arxius[i].lastModified()));
                llistarArbre(arxius[i].getAbsolutePath());

              }
            }
          }
        } else {
          System.out.println("El directori o la ruta no existeixen.");
        }
      }


    }



