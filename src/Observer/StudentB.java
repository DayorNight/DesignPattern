package Observer;
/**
 * 	StudentB.java
 * 	����Ĺ۲���(ѧ��B)
 */
public class StudentB extends Observer{
	@Override
	void receive(String message) {
		System.out.println("ѧ��B�յ���Ϣ��"+message);
	}
}
