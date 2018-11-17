package Observer;
/**
 * Observable.java
 * 	抽象被观察者
 */
abstract class Observable {
	 //发送广播
	abstract void sendBroadcast(String message);
}
