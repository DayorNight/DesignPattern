package Factory.FactoryMethod;

/**
 * @���幤��B
 * �������Ĳ�ƷB����
 */
public class FactoryB extends Factory{
	@Override
	Product getProduct() {
		return new ProductB();
	}
}
