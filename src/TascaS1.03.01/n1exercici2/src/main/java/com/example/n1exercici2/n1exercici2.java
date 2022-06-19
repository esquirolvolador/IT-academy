package com.example.n1exercici2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* - Exercici 2
Crea i emplena un List<Integer>.
Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers.
Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
*/
public class n1exercici2 {

  public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<Integer>();

    list1.add(10);
    list1.add(5);
    list1.add(2);
    list1.add(7);

    test1(list1);
    test2(list1);
  }

  public static void test1(List<Integer> list1) {

    List<Integer> list2 = new ArrayList<Integer>();

    for (int i = list1.size() - 1; i >= 0; i--) { //Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers.
      list2.add(list1.get(i));

      System.out.println(list2);
    }
  }

  private static void test2(List<Integer> list1) { //Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.

    List<Integer> list2 = new ArrayList<Integer>();

    ListIterator<Integer> it = list1.listIterator(list1.size());

    while (it.hasPrevious()) {
      list2.add(it.previous());

      System.out.println(list2);
    }


  }
}



