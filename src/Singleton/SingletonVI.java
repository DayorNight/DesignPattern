package Singleton;

/**
 * 	TODO �����ַ�ʽ    ö��
 * 	�����������̰߳�ȫ��ʵ�ּ�������
 */
public enum SingletonVI {
	 //����1��ö�ٵ�Ԫ�أ���Ϊ�������1��ʵ��
	INSTANCE;  
	// ������1���յġ�˽�е� ���췽��
    // private Singleton () {}
	
	// ��ȡ�����ķ�ʽ��
	//Singleton singleton = Singleton.INSTANCE;
	
	//���ڲ���
	public void showData() {
	   System.out.println("SingletonVI");
	}
}
