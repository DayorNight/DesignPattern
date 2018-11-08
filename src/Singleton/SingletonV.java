package Singleton;

/**
 * 	TODO 第五种方式   懒汉式 登记式/静态内部类
 * 	这种方式能达到双检锁方式一样的功效，但实现更简单
 */
public class SingletonV {
	//创建静态内部类、创建单例
	private static class SingletonHolder {  
	    private static final SingletonV INSTANCE = new SingletonV();  
	}  
	//创建私有构造函数，防止创建新的实例
	private SingletonV (){}  
	//提供一个外部访问点来获取单例
	public static final SingletonV getInstance() {  
	    return SingletonHolder.INSTANCE;  
	}  
	    
	//用于测试
	public void showData() {
	   System.out.println("SingletonV");
	}
}
