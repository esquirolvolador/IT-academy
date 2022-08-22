public class exercici {

  public static void main(String[] args){
    Alarma alarma = new Alarma();
    alarma.attach(new Agencia1());
    alarma.attach(new Agencia2());

    DadesBorsa dadesBorsa = new DadesBorsa();
      dadesBorsa.setEstat("baixada");

      Agent agent = new Agent();
      agent.notificaAgencies(dadesBorsa);

  }
}
