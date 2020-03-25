package entertain;

public class User {
	private String name;	//姓名
	private int money;		//用户余额
	

	public User() {
		super();
	}
	
	/**
	 * @param name
	 * @param money
	 */
	public User(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public void show() {
		System.out.println("我叫"+name+"我有"+money+"钱");
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
