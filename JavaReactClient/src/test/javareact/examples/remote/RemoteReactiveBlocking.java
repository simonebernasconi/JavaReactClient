package test.javareact.examples.remote;

import test.javareact.common.Consts;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveInteger;
import test.javareact.common.types.reactive.ReactiveString;

public class RemoteReactiveBlocking {

  public static void main(String args[]) {
    Consts.hostName = "Reactive";
    ReactiveInteger react1 = ReactiveFactory.getInteger("Remote.obInt.get()", "react1");
    ReactiveInteger react2 = ReactiveFactory.getInteger("Remote.obInt.get()", "react2");
    ReactiveString react3 = ReactiveFactory.getString("Remote.obString1.get() + Remote.obString2.get()", "react3");

    while (true) {
      System.out.println("React1: " + react1.getInt());
      System.out.println("React2: " + react2.getInt());
      System.out.println("React3: " + react3.get());
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }
}
