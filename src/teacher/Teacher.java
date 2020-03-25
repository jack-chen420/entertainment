package teacher;

import java.io.Serializable;
import java.util.Date;



public class Teacher implements Serializable {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 134133;
	/*Ҫ�󣺱��Ϊ���֣����ʹ��4Ϊλ���֣���ʽΪ0001��0002��.�������ظ���
	������Ϊ�ַ������������20���ַ�������Ϊ�ա�
	�Ա������ֱ�ʾ��true��ʾŮ��false��ʾ�С�����1��ʾŮ ����2��ʾ�� ����Ϊ������ֵ��
	���գ���ʾ�ꡢ�¡��ա���ʽ���磺��ʹ����λ���ֱ�ʾ����ʹ��1-12��ʾ��			��ʹ��1-31��ʾ����Χ�ǣ�1900��2004��
	���᣺ʹ���ַ�����ʾ���������10���ַ�������Ϊ�ա�
	ѧ����ʹ�����ֱ�ʾ����0��ѧʿ1��˶ʿ2����ʿ3������Ϊ4������Ϊ�������֡�
	��ַ��ʹ���ַ�����ʾ���������30���ַ�������Ϊ�ա�
	�绰��ʹ���ַ�����ʾ���������15���ַ�������Ϊ�ա�
	���䣺ʹ�����ֱ�ʾ�����䷶Χ��(0,50]��
	����нˮ��Ϊʵ�ͣ�����Ϊ0��
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
