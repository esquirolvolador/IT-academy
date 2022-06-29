public class n1exercici2 {

  /*- Exercici 2
Crea una classe anomenada Persona amb els atributs nom, cognom i edat. Després crea una classe anomenada GenericMethods amb un mètode genèric que
accepti tres arguments de tipus genèric. Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe principal,
crida el mètode genèric amb diferents tipus de paràmetres.
Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.*/


Persona persona1 = new Persona("Ari", "Puig", 37 );

GenericMethods objecte = new GenericMethods( persona1, "treballador", 1);

}
