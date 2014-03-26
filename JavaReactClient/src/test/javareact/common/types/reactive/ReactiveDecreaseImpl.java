package test.javareact.common.types.reactive;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import test.javareact.client.QueueManager;
import test.javareact.common.Consts;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveDecreaseImpl extends Reactive implements ReactiveDecrease {

  protected ReactiveDecreaseImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.BOOL, name, isPublic);
  }

  protected ReactiveDecreaseImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.BOOL, name, isPublic);
  }

  @Override
  public synchronized boolean get() {
    requiresUpdatedValue();
    return value.boolVal();
  }

	Queue<Integer> lastValues = new LinkedList<Integer>();
	boolean check;
	
	@Override
	public synchronized void notifyValueChanged(EventPacket evPkt) {
		// Update the data structures
		// Contact the queue manager to obtain the list of changes that can be
		// processed
		Set<EventPacket> changes = queueManager.processEventPacket(evPkt,
				Consts.hostName + name);
		assert (changes.size() == 1 && changes.contains(evPkt));
		int newVal = evPkt.getEvent().getAttributeFor("get()").intVal();

		if (lastValues.size() < 10) {
			lastValues.add(newVal);
		} else {
			lastValues.remove();
			lastValues.add(newVal);
		}
		boolean decreasing = true;

		Iterator<Integer> it = lastValues.iterator();
		if (it.hasNext()) {
			it.next();
		}
		for (int val : lastValues) {
			if (decreasing == true){
	
				if (it.hasNext()) {
					int iteratorValue = (int) it.next();
					if (val <= iteratorValue) {
						decreasing = false;
						check = false;
					}
					else {check = true;}
	
				}
			}

		}
			if (decreasing) {
				value = new Value(true);
			} else {
				value = new Value(false);
			}
		
		for (ReactiveListener l : reactiveListeners) {
			l.notifyReactiveChange(value);
		}

	}

}
