package Observer;
/**
 * 	StudentA.java
 * 	����Ĺ۲���(ѧ��A)
 */
public class StudentA extends Observer{
	@Override
	void receive(String message) {
		System.out.println("ѧ��A�յ���Ϣ��"+message);
	}
}
