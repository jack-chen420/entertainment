package teacher;

import java.io.Serializable;
import java.util.Date;



public class Teacher implements Serializable {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 134133;
	/*要求：编号为数字，编号使用4为位数字，格式为0001、0002….，不能重复。
	姓名：为字符串，最长不超过20个字符。不能为空。
	性别：用数字表示，true表示女，false表示男。输入1表示女 输入2表示男 不能为其它数值。
	生日：表示年、月、日。格式例如：年使用四位数字表示，月使用1-12表示，			日使用1-31表示。范围是（1900，2004）
	籍贯：使用字符串表示，最长不超过10个字符。不能为空。
	学历：使用数字表示高中0、学士1、硕士2、博士3、其它为4。不能为其它数字。
	地址：使用字符串表示，最长不超过30个字符。不能为空。
	电话：使用字符串表示，最长不超过15个字符。不能为空。
	工龄：使用数字表示，工龄范围是(0,50]。
	基本薪水：为实型，不能为0。
*/
	private int id;
	private String name;
	private Date birth;
	private String from;
	private int xueli;
	private String address;
	private String phonenum;
	private int workage;
	private float money;
	private int sex;
	/**
	 * 
	 */
	
	public Teacher(int id) {
		this.id=id;
	}
	public Teacher() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param sex
	 * @param birth
	 * @param from
	 * @param xueli
	 * @param address
	 * @param phonenum
	 * @param workage
	 * @param money
	 */
	public Teacher(int id, String name, int sex, Date birth, String from, int xueli, String address, String phonenum,
			int workage, int money) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.from = from;
		this.xueli = xueli;
		this.address = address;
		this.phonenum = phonenum;
		this.workage = workage;
		this.money = money;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public int getXueli() {
		return xueli;
	}
	public void setXueli(int xueli) {
		this.xueli = xueli;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public int getWorkage() {
		return workage;
	}
	public void setWorkage(int workage) {
		this.workage = workage;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(Float money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", sex=" + sex + ", birth=" + birth + ", from=" + from
				+ ", xueli=" + xueli + ", address=" + address + ", phonenum=" + phonenum + ", workage=" + workage
				+ ", money=" + money + "]";
	}
	
	

}
