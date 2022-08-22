
import java.util.ArrayList;

public class Undo{

  private ArrayList<String> llistaComandes = null;
  private static Undo instance;


  public static Undo getInstance() {
    if (instance == null){
      instance = new Undo();
    }
    return instance;
  }

  private Undo(){
    llistaComandes = new ArrayList<String>();
  }

  public void addToArray(String value) {
    llistaComandes.add(value);
  }

  public void undo() { //desfer
  int ultim = llistaComandes.size() -1;
  llistaComandes.remove(ultim);
  }

  public void history(){ //history
    System.out.println(llistaComandes);
}

}
