package Factory.AbstractFactory;

public class Test {
	public static void main(String[] args) {
		//������ʳ�����������幤������
		FactoryA factoryA = new FactoryA();
		//��ȡ��Ȫˮ������������Ʒ��
		factoryA.getProductA().intro();
		factoryA.getProductB().intro();
	}
}
