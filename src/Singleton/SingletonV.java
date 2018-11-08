package Singleton;

/**
 * 	TODO �����ַ�ʽ   ����ʽ �Ǽ�ʽ/��̬�ڲ���
 * 	���ַ�ʽ�ܴﵽ˫������ʽһ���Ĺ�Ч����ʵ�ָ���
 */
public class SingletonV {
	//������̬�ڲ��ࡢ��������
	private static class SingletonHolder {  
	    private static final SingletonV INSTANCE = new SingletonV();  
	}  
	//����˽�й��캯������ֹ�����µ�ʵ��
	private SingletonV (){}  
	//�ṩһ���ⲿ���ʵ�����ȡ����
	public static final SingletonV getInstance() {  
	    return SingletonHolder.INSTANCE;  
	}  
	    
	//���ڲ���
	public void showData() {
	   System.out.println("SingletonV");
	}
}
