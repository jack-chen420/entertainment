package entertain;

public class User {
	private String name;	//����
	private int money;		//�û����
	

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
		System.out.println("�ҽ�"+name+"����"+money+"Ǯ");
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
