package Factory.AbstractFactory;

/**
 * @ FactoryA.java
 * ���幤��A
 * ��������A���Ʒ����
 */
public class FactoryA extends Factory{
	@Override
	Product getProductA() {
		//������Ȫˮ
		return new ProductAa();
	}
	@Override
	Product getProductB() {
		//�������
		return new ProductBb();
	}
}
