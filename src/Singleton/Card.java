package Singleton;

/**
 * �������ÿ�����
 * �������ö��ʵ�ַ�ʽ 
 */
public enum Card {
	INSTANCE;
	private int Amount = 20000;
	/**
	 * ����
	 */
	public void consume(int sum) {
		System.out.println("������"+sum);
		this.Amount-=sum;
	}
	/**
	 *  ����
	 */
	public void repayment(int sum) {
		System.out.println("������"+sum);
		this.Amount+=sum;
	}
	/**
	  *  ��ѯ
	 */
	public void query() {
		System.out.println("���ÿ���ȣ�"+Amount);
	}
}
