package test.javareact.common.types.reactive;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveDoubleImpl extends Reactive implements ReactiveDouble {

  protected ReactiveDoubleImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.DOUBLE, name, isPublic);
  }

  protected ReactiveDoubleImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.DOUBLE, name, isPublic);
  }

  @Override
  public synchronized double get() {
    requiresUpdatedValue();
    return value.doubleVal();
  }

}