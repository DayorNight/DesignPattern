package Singleton;

/**
 * 	TODO 第四种方式  懒汉式  双检锁/双重校验锁
 * 	这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * 	 缺点：实现方式较复杂
 */
public class SingletonIV {
	//声明单例的引用
	private static SingletonIV instance;
	//创建私有构造函数，防止创建新的实例
	private SingletonIV() {}
	//创建线程安全的单例
	public static SingletonIV getInstance() {
		//判断是否存在单例
		if(instance==null) {
			//保持只有一个线程执行
			synchronized(SingletonIV.class) {
				//再次判断单例是否被创建（防止其他线程已经创建而导致再次创建）
				if(instance==null) {
					instance=new SingletonIV();
				}
			}
		}
		return instance;
	}
	 //用于测试
	  public void showData() {
	  	 System.out.println("SingletonIV");
	  }
}
