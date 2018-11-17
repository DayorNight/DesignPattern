package Observer;
/**
 * Observer.java
 * 	抽象观察者
 */
abstract class Observer {
	//收到通知
	abstract void receive(String message);
}
