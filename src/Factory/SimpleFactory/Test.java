package Factory.SimpleFactory;

public class Test {
	public static void main(String[] args) {
		//��������Ĺ���
		Factory factory = new Factory();
		//���ݴ���Ĳ���������ͬ�Ĳ�Ʒʵ��
		//(���²�ͬ�İ�ť����ȡ����)
		Product A = Factory.getProduct("A");
		A.intro();
		Product B = Factory.getProduct("B");
		B.intro();
		Product C = Factory.getProduct("C");
		C.intro();
	}
}
