import Classes.Treballador;
import Classes.TreballadorOnline;
import Classes.TreballadorPresencial;

public class n1exercici1 {

  //Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.

  /*La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores treballades i el multiplica pel preu/hora.
  Les classes filles l'han de sobreescriure,  emprant @Override.

Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.
En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes. A
 l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor d'un atribut static anomenat
 benzina que afegirem en aquesta classe.
En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A
l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.
*/

  public static <String> void main(String[] args) {


    Treballador treballador =new Treballador("Sara", "Mates", 10);
    TreballadorOnline treballador1 = new TreballadorOnline("Ari", "Puig", 10, 30);
    TreballadorPresencial treballador2 = new TreballadorPresencial("Marc", "Saura", 10, 50);

    treballador.calcularSou(40);
    treballador1.calcularSou(40);
    treballador2.calcularSou(40);


  }
}


