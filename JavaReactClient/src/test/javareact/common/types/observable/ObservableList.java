package test.javareact.common.types.observable;

import java.util.List;

public class ObservableList extends Observable {
  private List<?> val;

  public ObservableList(String observableId, boolean persistent, List<?> val) {
    super(observableId, persistent);
    set(val);
  }

  public ObservableList(String observableId, List<?> val) {
    super(observableId);
    set(val);
  }

  @ImpactOn(method = { "get" })
  public final void set(List<?> val) {
    this.val = val;
  }

  public final List<?> get() {
    return val;
  }
}
