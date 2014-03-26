package test.javareact.common.types.reactive;

/**
 * A reactive variable of string type.
 */
public interface ReactiveString extends ReactiveListenerInterface {

  /**
   * Returns the value of the variable.
   * 
   * @return the value of the variable.
   */
  public String get();

}
