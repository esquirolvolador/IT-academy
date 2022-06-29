public class n1exercici1 {

  public static void main(String[] args) {

    NoGenericMethods<String> objecteNou1 = new NoGenericMethods<String>("A", "B", "C");
    NoGenericMethods<Integer> objecteNou2 = new NoGenericMethods<Integer>(1, 2, 3);

    System.out.println(objecteNou1.getObjecte1());
    System.out.println(objecteNou1.getObjecte2());
    System.out.println(objecteNou1.getObjecte3());

    String a = "a";
    String b = "b";
    String c = "c";

    NoGenericMethods<String> objecteNou3 = new NoGenericMethods<String>(a, b, c);
    NoGenericMethods<String> objecteNou4 = new NoGenericMethods<String>(c, a, b);

  }
}
