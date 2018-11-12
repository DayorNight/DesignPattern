package Factory.SimpleFactory;

/**
 * @具体产品B
 * @（可以看成是一种饮料：奶茶）
 */
public class BProduct extends Product{
	@Override
	void intro() {
		System.out.println("奶茶");
	}
}
