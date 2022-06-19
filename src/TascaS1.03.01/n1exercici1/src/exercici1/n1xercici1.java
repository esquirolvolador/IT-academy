package exercici1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class n1xercici1 {

  /*- Exercici 1
Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). Afegeix 11 objectes Month
(cadascun amb el seu atribut diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció en
el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.
Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que no permet duplicats.
Recorre la llista amb un for i amb un iterador. */


  public static void main(String[] args) {
    ArrayList<Month> monthArrayList = new ArrayList();


    Month january = new Month("January");
    monthArrayList.add(january);
    Month february = new Month("February");
    monthArrayList.add(february);
    Month march = new Month("March");
    monthArrayList.add(march);
    Month april = new Month("April");
    monthArrayList.add(april);
    Month may = new Month("May");
    monthArrayList.add(may);
    Month june = new Month("June");
    monthArrayList.add(june);
    Month july = new Month("July");
    monthArrayList.add(july);
    Month august = new Month("August");
    Month september = new Month("September");
    monthArrayList.add(september);
    Month october = new Month("October");
    monthArrayList.add(october);
    Month november = new Month("November");
    monthArrayList.add(november);
    Month december = new Month("December");
    monthArrayList.add(december);

    monthArrayList.add(7, august); // efectua la inserció en el lloc que correspon a aquest mes
    System.out.println(monthArrayList); // demostra que l’ArrayList manté l'ordre correcte.

    LinkedHashSet<Month> linkedhashSet = new LinkedHashSet<Month>(monthArrayList); // Converteix l’ArrayList de
    // l’exercici anterior en un HashSet (he fet servir linked perquè surtin ordenats)

    linkedhashSet.add(december); // Assegura’t que no permet duplicats.
    //System.out.println(linkedhashSet); // imprimim i veiem que no afegeix un altre december

    for (Month i : monthArrayList){ //Recorre la llista amb un for.
      System.out.println(i);
    }

    Iterator<Month> it = linkedhashSet.iterator(); //Recorre la llista amb un iterador.
    while (it.hasNext()){
      System.out.println(it.next());

  }
}
}


