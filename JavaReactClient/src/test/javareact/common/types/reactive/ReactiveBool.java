package test.javareact.common.types.reactive;

/**
 * A reactive variable of boolean type.
 */
public interface ReactiveBool extends ReactiveListenerInterface {

  /**
   * Returns the value of the variable.
   * 
   * @return the value of the variable.
   */
  public boolean get();

}
