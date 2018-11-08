package Singleton;

/**
 * 	TODO ��һ�ַ�ʽ   ����ʽ  �̲߳���ȫ
 *	��֧�ֶ��̣߳���Ϊû�м��� synchronized
 */
public class SingletonI {
	//��������������
	private static SingletonI instance;  
	//����˽�й��캯������ֹ�����µ�ʵ��
    private SingletonI (){}  
    //��������
    public static SingletonI getInstance() {  
    	//�ж�ʵ���Ƿ�Ϊ��
	    if (instance == null) {  
	    	//����ʵ��
	        instance = new SingletonI();  
	    }  
	    //�����ṩ��Ψһʵ��
	    return instance;  
    }  
    
	//���ڲ���
	public void showData() {
		System.out.println(getClass());
	}
	
}
