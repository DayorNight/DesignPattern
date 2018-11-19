package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * SchoolsBroadcast.java
 * 	����� ���۲��ߣ�ѧУ�㲥��
 */
public class SchoolsBroadcast extends Observable{
	//�����洢�۲���
	private List<Observer> observers = new ArrayList<Observer>();
	@Override
	void sendBroadcast(String message) {
		System.out.println("ѧУ����֪ͨ��"+message);
		for(Observer ob:observers) {
			ob.receive(message);
		}
	}
	//�󶨹۲��ߣ������ƶ������󱻹۲����У�
	public void registerReceiver(Observer observer) {
		observers.add(observer);
	}
	//���۲��ߣ������ƶ������󱻹۲����У�
	public void unRegisterReceiver(Observer observer) {
		if(observers.contains(observer)) {
			observers.remove(observer);
		}
	}
}
