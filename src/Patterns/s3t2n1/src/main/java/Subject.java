public interface Subject {

  public void attach(EstatBorsa observador);

  public void dettach(EstatBorsa observador);
  public void notifyObservers();
}
