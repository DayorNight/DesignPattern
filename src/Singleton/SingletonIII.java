package Singleton;

/**
 * 	TODO 第三种方式  饿汉式 线程安全
 * 	单例对象 要求初始化速度快 & 占用内存小单例对象 要求初始化速度快 & 占用内存小
 * 	优点：没有加锁，执行效率会提高。
 * 	缺点：类加载时就初始化，浪费内存。
 */
public class SingletonIII {
	  
	  //加载该类时，立马创建实例
	  private static SingletonIII instance = new SingletonIII();  
	  //创建私有构造函数，防止创建新的实例
	  private SingletonIII (){}  
	  //提供一个访问该实例的访问点
	  public static SingletonIII getInstance() {  
		  return instance;  
	  } 
	  //用于测试
	  public void showData() {
	  	 System.out.println("SingletonIII");
	  }
}
