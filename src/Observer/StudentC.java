package Observer;
/**
 * 	StudentC.java
 * 	具体的观察者(学生C)
 */
public class StudentC extends Observer{
	@Override
	void receive(String message) {
		System.out.println("学生C收到消息："+message);
	}
}
