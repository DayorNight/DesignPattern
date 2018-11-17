package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * SchoolsBroadcast.java
 * 	����� ���۲��ߣ�ѧУ�㲥��
 */
public class SchoolsBroadcast extends Observable{
	private List<Observer> observers = new ArrayList<Observer>();
	@Override
	void sendBroadcast(String message) {
		System.out.println("ѧУ����֪ͨ��"+message);
		for(Observer ob:observers) {
			ob.receive(message);
		}
	}
	//�󶨹۲���
	public void registerReceiver(Observer observer) {
		observers.add(observer);
	}
	//���۲���
	public void unRegisterReceiver(Observer observer) {
		if(observers.contains(observer)) {
			observers.remove(observer);
		}
	}
}
