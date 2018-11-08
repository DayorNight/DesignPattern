package Singleton;

/**
 * 	TODO �ڶ��ַ�ʽ  ����ʽ  �̰߳�ȫ
 * 	�ڵ�һ�ַ�ʽ�Ļ����������synchronized
 *	������� synchronized ���ܱ�֤�̰߳�ȫ��
 * 	 ȱ�㣺ÿ�η��ʶ�Ҫ�����߳�ͬ������ ����synchronized��)����ɹ����ͬ������������ = ��ʱ�����ܣ�
 */
public class SingletonII {
	//��������������
    private static SingletonII instance;  
  //����˽�й��캯������ֹ�����µ�ʵ��
    private SingletonII (){}  
    //�����synchronized �ڶ��߳��±�֤�̰߳�ȫ
    public static synchronized SingletonII getInstance() {  
	    if (instance == null) {  
	        instance = new SingletonII();  
	    }  
	    return instance;  
    } 
	
  //���ڲ���
  	public void showData() {
  		System.out.println("SingletonII");
  	}
}
