package Observer;
/**
 * 	StudentC.java
 * 	����Ĺ۲���(ѧ��C)
 */
public class StudentC extends Observer{
	@Override
	void receive(String message) {
		System.out.println("ѧ��C�յ���Ϣ��"+message);
	}
}
