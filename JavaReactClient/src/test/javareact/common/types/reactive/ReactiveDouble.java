package test.javareact.common.types.reactive;

/**
 * A reactive variable of double type.
 */
public interface ReactiveDouble extends ReactiveListenerInterface {

  /**
   * Returns the value of the variable.
   * 
   * @return the value of the variable.
   */
  public double get();

}
