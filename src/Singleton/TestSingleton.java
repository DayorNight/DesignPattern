package Singleton;

public class TestSingleton {
	public static void main(String[] args) {
		//调用方式
		SingletonI instance = SingletonI.getInstance();
		SingletonII instanceII = SingletonII.getInstance();
		SingletonIII instanceIII = SingletonIII.getInstance();
		SingletonIV instanceIV = SingletonIV.getInstance();
		SingletonV instanceV = SingletonV.getInstance();
		SingletonVI instanceVI = SingletonVI.INSTANCE;
		instance.showData();
		instanceII.showData();
		instanceIII.showData();
		instanceIV.showData();
		instanceV.showData();
		instanceVI.showData();
		//测试是否实现单例
		//举例：假设一家人都在使用一张信用卡(单例对象)，消费与还款都在同一张信用卡上。
		//步骤一：创建一张信用卡实例（单例） 查询信用卡额度
		Card card = Card.INSTANCE;
		card.query();
		//假设你在学校（另一个类中）消费了5000
		System.out.println("我");
		Card card1 = Card.INSTANCE;
		card1.consume(5000);	
		card1.query();
		//假设母亲在家里（另一个类中）消费了7000
		System.out.println("母亲");
		Card card2 = Card.INSTANCE;
		card2.consume(7000);	
		card2.query();
		//假设父亲公司（另一个类中）还款了7000
		System.out.println("父亲");
		Card card3 = Card.INSTANCE;
		card3.repayment(7000);	
		//最后查询信用卡的额度
		card.query();
		//始终使用的都是同一张卡
	}
}	
