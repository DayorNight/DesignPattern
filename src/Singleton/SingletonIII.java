package Singleton;

/**
 * 	TODO �����ַ�ʽ  ����ʽ �̰߳�ȫ
 * 	�������� Ҫ���ʼ���ٶȿ� & ռ���ڴ�С�������� Ҫ���ʼ���ٶȿ� & ռ���ڴ�С
 * 	�ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
 * 	ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
 */
public class SingletonIII {
	  
	  //���ظ���ʱ��������ʵ��
	  private static SingletonIII instance = new SingletonIII();  
	  //����˽�й��캯������ֹ�����µ�ʵ��
	  private SingletonIII (){}  
	  //�ṩһ�����ʸ�ʵ���ķ��ʵ�
	  public static SingletonIII getInstance() {  
		  return instance;  
	  } 
	  //���ڲ���
	  public void showData() {
	  	 System.out.println("SingletonIII");
	  }
}
