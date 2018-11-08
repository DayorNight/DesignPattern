package Singleton;

/**
 * 	TODO �����ַ�ʽ  ����ʽ  ˫����/˫��У����
 * 	���ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ�����
 * 	 ȱ�㣺ʵ�ַ�ʽ�ϸ���
 */
public class SingletonIV {
	//��������������
	private static SingletonIV instance;
	//����˽�й��캯������ֹ�����µ�ʵ��
	private SingletonIV() {}
	//�����̰߳�ȫ�ĵ���
	public static SingletonIV getInstance() {
		//�ж��Ƿ���ڵ���
		if(instance==null) {
			//����ֻ��һ���߳�ִ��
			synchronized(SingletonIV.class) {
				//�ٴ��жϵ����Ƿ񱻴�������ֹ�����߳��Ѿ������������ٴδ�����
				if(instance==null) {
					instance=new SingletonIV();
				}
			}
		}
		return instance;
	}
	 //���ڲ���
	  public void showData() {
	  	 System.out.println("SingletonIV");
	  }
}
