import Classes.Treballador;
import Classes.TreballadorOnline;
import Classes.TreballadorPresencial;


public class n1exercici2 {

  /*- Exercici 2
Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent.
Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings”
er ser obsolets.
   */
  @SuppressWarnings("deprecation") // Annotació per eliminar el warning de deprecated

  public static void main(String[] args) {

    Treballador treballador = new Treballador("Sara", "Mates", 10);
    TreballadorOnline treballador1 = new TreballadorOnline("Ari", "Puig", 10, 30);
    TreballadorPresencial treballador2 = new TreballadorPresencial("Marc", "Saura", 10, 50);

    treballador.calcularSou(40);
    treballador1.calcularSou(40);
    treballador2.calcularSou(40);


    System.out.println("L'antiguitat del treballador és de "+ treballador1.antiguitat(2022, 2020)+ " any/s");

    System.out.println( "Suplement de benzina amb pujada de preu" + treballador2.suplementBenzina(70, 2));

}
}