import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class n1exercici6 {

  public static void main(String args[] ){
    //- Exercici 6
    //Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.


    List<List> listOfMixedTypes = new ArrayList<List>();

    ArrayList<String> listOfStrings = new ArrayList<String>();
    ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

    listOfStrings.add("El tupí de la Cerdanya");
    listOfStrings.add("La formatgeria de Llívia");
    listOfStrings.add("Cal Cofa");
    listOfStrings.add("El Trill");
    listOfStrings.add("El Bistrot");
    listOfIntegers.add(1);
    listOfIntegers.add(2);
    listOfIntegers.add(3);
    listOfIntegers.add(4);
    listOfIntegers.add(5);

    List<String> intToString = new ArrayList<>(listOfIntegers.size());

    for (Integer myInt : listOfIntegers) {
      intToString.add(String.valueOf(myInt));
    }

    listOfStrings.addAll(intToString);



    System.out.println(listOfStrings);

    listOfStrings.sort(Comparator.comparing(String::length));
    listOfStrings.forEach(System.out::println);


  }

  }

