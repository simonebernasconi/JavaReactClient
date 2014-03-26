package test.javareact.common.types.reactive;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

class ReactiveStringImpl extends Reactive implements ReactiveString {

  protected ReactiveStringImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.STRING, name, isPublic);
  }

  protected ReactiveStringImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.STRING, name, isPublic);
  }

  @Override
  public synchronized String get() {
    requiresUpdatedValue();
    return value.stringVal();
  }
}
