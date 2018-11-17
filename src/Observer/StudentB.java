package Observer;
/**
 * 	StudentB.java
 * 	具体的观察者(学生B)
 */
public class StudentB extends Observer{
	@Override
	void receive(String message) {
		System.out.println("学生B收到消息："+message);
	}
}
