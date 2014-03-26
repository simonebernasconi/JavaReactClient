package test.javareact.common.types.reactive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import test.javareact.client.QueueManager;
import test.javareact.common.Consts;
import test.javareact.common.packets.EventPacket;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.Types;

final class ReactiveAvgImpl extends Reactive implements ReactiveAvg {

  protected ReactiveAvgImpl(String expression, String name, boolean isPublic) {
    super(expression, Types.DOUBLE, name, isPublic);
  }

  protected ReactiveAvgImpl(String expression, Value startingValue, String name, boolean isPublic) {
    super(expression, startingValue, Types.DOUBLE, name, isPublic);
  }

  @Override
  public synchronized double get() {
    requiresUpdatedValue();
    return value.doubleVal();
  }

	Queue<Integer> lastValues = new LinkedList<Integer>();
	double average;
		
	@Override
	public synchronized void notifyValueChanged(EventPacket evPkt) {
		// Update the data structures
		// Contact the queue manager to obtain the list of changes that can be
		// processed
		Set<EventPacket> changes = queueManager.processEventPacket(evPkt, Consts.hostName + name);
		assert (changes.size()==1 && changes.contains(evPkt));
		int newVal = evPkt.getEvent().getAttributeFor("get()").intVal();
		
		int sum = 0;
		if (lastValues.size() < 10){
			lastValues.add(newVal);
		}
		else {
			lastValues.remove();
			lastValues.add(newVal);
		}
		for(int val :lastValues) {
			sum += val;
		}
		average = sum / (lastValues.size());
		
		value = new Value(average);
		
		
		
		
		
		for (ReactiveListener l : reactiveListeners) {
			l.notifyReactiveChange(value);
		}
		
	}

}
