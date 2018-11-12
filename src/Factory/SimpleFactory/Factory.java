package Factory.SimpleFactory;
/**
 * ����
 * ����ʵ�ִ�������ʵ�����ڲ��߼������ṩһ�������õķ�������������Ĳ�Ʒ����
 */
public class Factory {
	/**
	 * �������õķ���
	 * �����Կ����Ƕ����ṩ�����ְ�ť��
	 * @param type 
	 * @return ��Ʒʵ��
	 */
	public static Product getProduct(String type) {
		switch (type) {
			case "A":
				return new AProduct();
			case "B":
				return new BProduct();
			case "C":
				return new CProduct();
			default:
				return null;
		}
	}
}
