public class NoGenericMethods<T> {
/*Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, juntament amb els
 mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres.
 Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
 */

  private T objecte1;
  private T objecte2;
  private T objecte3;

  public NoGenericMethods(T objecte1, T objecte2, T objecte3) {
    this.objecte1 = objecte1;
    this.objecte2 = objecte2;
    this.objecte3 = objecte3;
  }

  public T getObjecte3() {
    return objecte3;
  }

  public void setObjecte3(T objecte3) {
    this.objecte3 = objecte3;
  }

  public T getObjecte2() {
    return objecte2;
  }

  public void setObjecte2(T objecte2) {
    this.objecte2 = objecte2;
  }

  public T getObjecte1() {
    return objecte1;
  }

  public void setObjecte1(T objecte1) {
    this.objecte1 = objecte1;
  }


}
