package Singleton;

/**
 * 创建信用卡单例
 * 这里采用枚举实现方式 
 */
public enum Card {
	INSTANCE;
	private int Amount = 20000;
	/**
	 * 消费
	 */
	public void consume(int sum) {
		System.out.println("消费了"+sum);
		this.Amount-=sum;
	}
	/**
	 *  还款
	 */
	public void repayment(int sum) {
		System.out.println("还款了"+sum);
		this.Amount+=sum;
	}
	/**
	  *  查询
	 */
	public void query() {
		System.out.println("信用卡额度："+Amount);
	}
}
