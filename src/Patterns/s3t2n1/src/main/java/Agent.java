public class Agent {

  public void notificaAgencies(DadesBorsa dadesBorsa){
    if (dadesBorsa.getEstat().equals("baixada")) {
      Alarma alarma = new Alarma();
      alarma.notifyObservers();
    }

    else if (dadesBorsa.getEstat().equals("pujada")) {
      Alarma alarma = new Alarma();
      alarma.notifyObservers();
    } else {
      System.out.println("estat de la borsa incorrecte");
    }


  }
}
