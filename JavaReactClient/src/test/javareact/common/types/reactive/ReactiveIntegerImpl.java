package test.javareact.common.types.reactive;

import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveIntegerImpl extends Reactive implements ReactiveInteger {

  protected ReactiveIntegerImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.INT, name, isPublic);
  }

  protected ReactiveIntegerImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.INT, name, isPublic);
  }



@Override
public int getInt() {
	requiresUpdatedValue();
    return value.intVal();
}

@Override
public boolean getBool() {
	requiresUpdatedValue();
    return value.boolVal();
}

}
