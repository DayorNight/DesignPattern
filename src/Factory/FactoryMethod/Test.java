package Factory.FactoryMethod;

public class Test {
	public static void main(String[] args) {
		//��������Ĺ���
		FactoryA factoryA = new FactoryA();
		//�������Ӧ�Ĳ�Ʒ
		factoryA.getProduct().intro();
		FactoryB factoryB = new FactoryB();
		factoryB.getProduct().intro();
	}
}
