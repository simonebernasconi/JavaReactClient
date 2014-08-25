package test.javareact.common.types.reactive;

import test.javareact.common.packets.content.Value;


public interface ReactiveListener {
	
	public void notifyReactiveChange(Value value);
	
//	public void notifyReactiveUpdate(Value value);
	
}
