package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * SchoolsBroadcast.java
 * 	具体的 被观察者（学校广播）
 */
public class SchoolsBroadcast extends Observable{
	private List<Observer> observers = new ArrayList<Observer>();
	@Override
	void sendBroadcast(String message) {
		System.out.println("学校发出通知："+message);
		for(Observer ob:observers) {
			ob.receive(message);
		}
	}
	//绑定观察者
	public void registerReceiver(Observer observer) {
		observers.add(observer);
	}
	//解绑观察者
	public void unRegisterReceiver(Observer observer) {
		if(observers.contains(observer)) {
			observers.remove(observer);
		}
	}
}
