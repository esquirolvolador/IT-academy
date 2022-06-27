
import java.io.File;
import java.util.Arrays;

public class n1exercici1Directori {

  /*-
  Els exercicis dels 3 nivells han d'executar-se des de la línia de comandos, i no sols des de l'editor.
  Crea un fitxer anomenat “readme.txt” per explicar el comando a executar a cada exercici.
  Exercici 1
  Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.*/

  public static void main(String[] args) {

    String directorio = "/Users/ariannapuig/Documents/GitHub/IT-academy/src/";
    File carpeta = new File(directorio);
   // String[] listado = carpeta.list();
    File[] archivos = carpeta.listFiles();

    if (carpeta.exists()) {
      if (carpeta.isDirectory()) {
        Arrays.sort(archivos);
        for (int i = 0; i < archivos.length; i++) {
          System.out.println(archivos[i].getName());

      }
    }
    }
  }
}



