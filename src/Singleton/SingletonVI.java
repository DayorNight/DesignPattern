package Singleton;

/**
 * 	TODO 第六种方式    枚举
 * 	创建单例、线程安全、实现简洁的需求
 */
public enum SingletonVI {
	 //定义1个枚举的元素，即为单例类的1个实例
	INSTANCE;  
	// 隐藏了1个空的、私有的 构造方法
    // private Singleton () {}
	
	// 获取单例的方式：
	//Singleton singleton = Singleton.INSTANCE;
	
	//用于测试
	public void showData() {
	   System.out.println("SingletonVI");
	}
}
