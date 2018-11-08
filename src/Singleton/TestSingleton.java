package Singleton;

public class TestSingleton {
	public static void main(String[] args) {
		//���÷�ʽ
		SingletonI instance = SingletonI.getInstance();
		SingletonII instanceII = SingletonII.getInstance();
		SingletonIII instanceIII = SingletonIII.getInstance();
		SingletonIV instanceIV = SingletonIV.getInstance();
		SingletonV instanceV = SingletonV.getInstance();
		SingletonVI instanceVI = SingletonVI.INSTANCE;
		instance.showData();
		instanceII.showData();
		instanceIII.showData();
		instanceIV.showData();
		instanceV.showData();
		instanceVI.showData();
		//�����Ƿ�ʵ�ֵ���
		//����������һ���˶���ʹ��һ�����ÿ�(��������)�������뻹���ͬһ�����ÿ��ϡ�
		//����һ������һ�����ÿ�ʵ���������� ��ѯ���ÿ����
		Card card = Card.INSTANCE;
		card.query();
		//��������ѧУ����һ�����У�������5000
		System.out.println("��");
		Card card1 = Card.INSTANCE;
		card1.consume(5000);	
		card1.query();
		//����ĸ���ڼ����һ�����У�������7000
		System.out.println("ĸ��");
		Card card2 = Card.INSTANCE;
		card2.consume(7000);	
		card2.query();
		//���踸�׹�˾����һ�����У�������7000
		System.out.println("����");
		Card card3 = Card.INSTANCE;
		card3.repayment(7000);	
		//����ѯ���ÿ��Ķ��
		card.query();
		//ʼ��ʹ�õĶ���ͬһ�ſ�
	}
}	
