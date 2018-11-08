package Singleton;

/**
 * 	TODO 第一种方式   懒汉式  线程不安全
 *	不支持多线程，因为没有加锁 synchronized
 */
public class SingletonI {
	//声明单例的引用
	private static SingletonI instance;  
	//创建私有构造函数，防止创建新的实例
    private SingletonI (){}  
    //创建单例
    public static SingletonI getInstance() {  
    	//判断实例是否为空
	    if (instance == null) {  
	    	//创建实例
	        instance = new SingletonI();  
	    }  
	    //对外提供的唯一实例
	    return instance;  
    }  
    
	//用于测试
	public void showData() {
		System.out.println(getClass());
	}
	
}
