public class GenericMethods<T> {

  private T argument1;
  private T argument2;
  private T argument3;

  public GenericMethods(T argument1, T argument2, T argument3) {
    this.argument1 = argument1;
    this.argument2 = argument2;
    this.argument3 = argument3;
  }

  public T getArgument1() {
    return argument1;
  }

  public void setArgument1(T argument1) {
    this.argument1 = argument1;
  }

  public T getArgument2() {
    return argument2;
  }

  public void setArgument2(T argument2) {
    this.argument2 = argument2;
  }

  public T getArgument3() {
    return argument3;
  }

  public void setArgument3(T argument3) {
    this.argument3 = argument3;
  }

  @Override
  public String toString() {
    return "GenericMethods{" +
            "argument1=" + argument1 +
            ", argument2=" + argument2 +
            ", argument3=" + argument3 +
            '}';
  }
}
