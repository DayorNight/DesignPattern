package Factory.FactoryMethod;

/**
 * @���幤��A
 * @�������Ĳ�ƷA����
 */
public class FactoryA extends Factory{
	@Override
	Product getProduct() {
		return new ProductA();
	}
}
