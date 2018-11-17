package Observer;
/**
 * Test.java
 * 	������
 */
public class Test {
	public static void main(String[] args) {
		//�������۲���(ѧУ�㲥)
		SchoolsBroadcast schoolsBroadcast = new SchoolsBroadcast();
		//�����۲���(ѧ��)
		StudentA studentA = new StudentA();
		//�󶨹۲��� ������ϵ
		schoolsBroadcast.registerReceiver(studentA);
		schoolsBroadcast.registerReceiver(new StudentB());
		schoolsBroadcast.registerReceiver(new StudentC());
		//���۲���(ѧУ�㲥)����֪ͨ
		schoolsBroadcast.sendBroadcast("��ѧ");
		System.out.println("=====================");
		//���۲���(ѧ��A)
		schoolsBroadcast.unRegisterReceiver(studentA);
		//���۲���(ѧУ�㲥)����֪ͨ
		schoolsBroadcast.sendBroadcast("ѧ��A���");
	}
}
