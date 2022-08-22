import java.util.ArrayList;

public class Alarma implements Subject{

  private static ArrayList<EstatBorsa> observadors = new ArrayList<EstatBorsa>();


  public void attach(EstatBorsa observador) {
    observadors.add(observador);
  }

  public void dettach(EstatBorsa observador) {
    observadors.remove(observador);
  }

  public void notifyObservers() {
    for (int i = 0; i < observadors.size(); i++){
      observadors.get(i).update();
    }

  }
}
