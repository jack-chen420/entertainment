package teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;





public class TeacherSystem implements TeacherSystemInterface{
	
	
	private File file=new File("user.txt");
	private static Map<Integer, Teacher> teachers =new HashMap<>();
	private Scanner scanner=new Scanner(System.in);
	Teacher t=new Teacher(11);
	
	
	@Override
	public void save() {
		ObjectOutputStream oos=null;
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\陈冠同\\Desktop\\haha.txt",true));
			for (int key : teachers.keySet()) {
				Teacher values = teachers.get(key);
				oos.writeObject(values);
				oos.flush();
				System.out.println("保存成功");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件没找到");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ddddd");
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void load() {
		ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(new FileInputStream("C:\\Users\\陈冠同\\Desktop\\haha.txt"));
			Teacher object =(Teacher) ois.readObject();
			teachers.put(object.getId(), object);
			System.out.println("加载完成");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void welcome() {
		System.out.println("欢迎使用劲佬彤操作系统");
		System.out.println("=====================");
	}
	
	public void exit() {
		System.out.println("退出了喔，88");
	}
	
	public void showMenu() {
		System.out.println("1 	输入老师资料");
		System.out.println("2	删除指定老师资料");
		System.out.println("3	查询指定老师资料");
		System.out.println("4	修改指定老师资料");
		System.out.println("5	计算老师月薪水");
		System.out.println("6	保存老师资料");
		System.out.println("7	排序");
		System.out.println("8	输出所有老师资料");
		System.out.println("9	清空所有老师资料");
		System.out.println("10	打印老师资料信息报表");
		System.out.println("11    加载数据");
		System.out.println("12	 退出了啊");
	}
	

	@Override
	public Teacher add() {
		Teacher teacher = new Teacher();
		/*员工的资料主要包括：编号、姓名、性别、生日、籍贯、学历、地址、电话、工龄、基本薪水。
	1要求：编号为数字，编号使用4为位数字，格式为0001、0002….，不能重复。
	2姓名：为字符串，最长不超过20个字符。不能为空。
	3性别：用数字表示，true表示女，false表示男。输入1表示女 输入2表示男 不能为其它数值。
	4生日：表示年、月、日。格式例如：年使用四位数字表示，月使用1-12表示，			日使用1-31表示。范围是（1900，2004）
	5籍贯：使用字符串表示，最长不超过10个字符。不能为空。
	6学历：使用数字表示高中0、学士1、硕士2、博士3、其它为4。不能为其它数字。
	7地址：使用字符串表示，最长不超过30个字符。不能为空。
	8电话：使用字符串表示，最长不超过15个字符。不能为空。
	9工龄：使用数字表示，工龄范围是(0,50]。
	10基本薪水：为实型，不能为0。
		*/		
		while (true) {
			//错误
//				int id = MyUtil.getInputNum("编号为数字，编号使用4为位数字，格式为0001、0002….，不能重复。", scanner);
//				System.out.println("编号为数字，编号使用4为位数字，格式为0001、0002….，不能重复。");
//				Scanner input = new Scanner(System.in);
//放外面会报错		int id = MyUtil.getInputNum("编号为数字，编号使用4为位数字，格式为0001、0002….，不能重复。", scanner);
				
			
				try {
					int id = MyUtil.getInputNum("编号为数字，编号使用4为位数字，格式为0001、0002….，不能重复。", scanner);
//					Set<Integer> keySet = teachers.keySet();
//					String b=keySet+"";
					String s=id+"";
					if (s.length()==4&&!teachers.containsKey(id)) {
						System.out.println("姓名为  "+s);
						teacher.setId(id);
						break;
					}else {
						System.out.println("输入错误，请重新输入：");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("输出错误");
					scanner.nextLine();   //清空数据作用
//					scanner=new Scanner(System.in);
				}
				
						}	
		
		while (true) {
			String name = MyUtil.getInputStrr("姓名：为字符串，最长不超过20个字符。不能为空。", scanner);
			if (name.length()>0&&name.length()<=20) {
				System.out.println("姓名为  "+name);
				teacher.setName(name);
				break;
			}else {
				System.out.println("输入错误，请重新输入：");
			}
		}
		
		while (true) {
			int sex = MyUtil.getInputNum("性别：用数字表示，true表示女，false表示男。输入1表示女 输入2表示男 不能为其它数值", scanner);
				if (sex==1) {
					System.out.println("性别为  女");
					teacher.setSex(sex);
					break;
				}else if (sex==2) {
					System.out.println("性别为 男 ");
					teacher.setSex(sex);
					break;
				}else {
					System.out.println("输入错误，请重新输入：");
				}
						}
		
		
		while (true) {
			String da = MyUtil.getInputStrr("生日：表示年、月、日。格式例如：年使用四位数字表示，月使用1-12表示，日使用1-31表示。范围是（1900，2004）", scanner);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date = format.parse(da);
				System.out.println("日期为 "+da);
				teacher.setBirth(date);
				break;
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("格式不正确");
			}
		}
		
		while (true) {
			String from = MyUtil.getInputStrr("籍贯：使用字符串表示，最长不超过10个字符。不能为空", scanner);
			if (from.length()>0&&from.length()<=10) {
				System.out.println("籍贯为  "+from);
				teacher.setFrom(from);
				break;
			}else {
				System.out.println("输入错误，请重新输入：");
			}
		}
		
		
		while (true) {
			int xueli = MyUtil.getInputNum("学历：使用数字表示高中0、学士1、硕士2、博士3、", scanner);
				if (xueli==0) {
					System.out.println("学历为高中  ");
					teacher.setXueli(xueli);
					break;
				}else if (xueli==1) {
					System.out.println("学历为学士  ");
					teacher.setXueli(xueli);
					break;             
				}else if (xueli==2) {    
					System.out.println("学历为硕士  ");
					teacher.setXueli(xueli);
					break;            
				}else if (xueli==3) {   
					System.out.println("学历为博士  ");
					teacher.setXueli(xueli);
					break;
				}
				else {
					System.out.println("输入错误，请重新输入：");
				}
						}
		
		while (true) {
			String address = MyUtil.getInputStrr("地址：使用字符串表示，最长不超过30个字符。不能为空。", scanner);
			if (address.length()>0&&address.length()<=30) {
				System.out.println("地址为 "+address);
				teacher.setAddress(address);
				break;
			}else {
				System.out.println("输入错误，请重新输入：");
			}
		}
		
		
		while (true) {
			String name = MyUtil.getInputStrr("电话：使用字符串表示，最长不超过15个字符。不能为空", scanner);
			if (name.length()>0&&name.length()<=15) {
				System.out.println("电话为  "+name);
				teacher.setName(name);
				break;
			}else {
				System.out.println("输入错误，请重新输入：");
			}
		}
		
		while (true) {
			
			try {
				int workage = MyUtil.getInputNum("工龄：使用数字表示，工龄范围是(0,50]。", scanner);
				if (workage>0&&workage<=50) {
					System.out.println("工龄为  "+workage);
					teacher.setWorkage(workage);
					break;
				}else {
					System.out.println("超出范围");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("输入格式错误");
			}
			
		}
		
		
		while (true) {
			try {
				Float money = MyUtil.getInputFloat("基本薪水：为实型，不能为0。", scanner);
				if (money!=0) {
					System.out.println("基本薪水为  "+money);
					teacher.setMoney(money);
					break;
				}else {
					System.out.println("不能为0  ");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("输入格式错误");
			}
		}
		
		
		teachers.put(teacher.getId(), teacher);
		
		
		
		
		
		
		return teacher;
//		Teacher teacher = new Teacher(id, name, sex, birth, from, xueli, address, phonenum, workage, money);
				
						}
	

	@Override
	public void deleteOne(int se) {
		if (se==1) {
			int key = MyUtil.getInputNum("输入学号", scanner);
			if (teachers.containsKey(key)) {
				teachers.remove(key);
				System.out.println("移除成功");
			}else {
				System.out.println("没找到");
			}
		}else if (se==2) {
			ArrayList<Teacher> arrayList = new ArrayList<>();
			String strr = MyUtil.getInputStrr("输入姓名", scanner);
			Collection<Teacher> values = teachers.values();
			Iterator<Teacher> iterator = values.iterator();
			while (iterator.hasNext()) {
				Teacher teacher =  iterator.next();
				while (teacher.getName().equals(strr)) {
					teachers.remove(teacher.getId());
					System.out.println("移除成功");
					break;
				}
				
			}
			
			
		}
		
		
	}
	

	@Override
	public void searchOne(int search) {
		if (search==1) {
			int key = MyUtil.getInputNum("输入学号", scanner);
			if (teachers.containsKey(key)) {
				Teacher teacher = teachers.get(key);
				System.out.println("找到了 ："+teacher);
			}else {
				System.out.println("没找到");
			}
		}else if (search==2) {
			ArrayList<Teacher> arrayList = new ArrayList<>();
			String strr = MyUtil.getInputStrr("输入姓名", scanner);
			Collection<Teacher> values = teachers.values();
			Iterator<Teacher> iterator = values.iterator();
			while (iterator.hasNext()) {
				Teacher teacher =  iterator.next();
				if (teacher.getName().equals(strr)) {
					arrayList.add(teacher);
					System.out.println("找到了 ："+arrayList);
				}
			}
		}
	}

	@Override
	public void modifyOne(int modfi) {
		if (modfi==1) {
			int key = MyUtil.getInputNum("输入学号", scanner);
			if (teachers.containsKey(key)) {
				Teacher teacher = teachers.get(key);
				System.out.println("找到了下面开始修改  ：");
				Teacher add = add();
				teachers.put(key, add);
				
			}else {
				System.out.println("没找到");
			}
		}else if (modfi==2) {
			ArrayList<Teacher> arrayList = new ArrayList<>();
			String strr = MyUtil.getInputStrr("输入姓名", scanner);
			Collection<Teacher> values = teachers.values();
			Iterator<Teacher> iterator = values.iterator();
			while (iterator.hasNext()) {
				Teacher teacher =  iterator.next();
				if (teacher.getName().equals(strr)) {
					teachers.put(teacher.getId(), add());
					System.out.println("修改成功");
					
					
				}
				
			}
	}
	}

	@Override
	public float countMoney() {
		System.out.println("月薪为  18");
		return (float) 18.0;
	}


	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		Iterator<Integer> iterator = teachers.keySet().iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			Teacher teacher = teachers.get(integer);
			System.out.println(teacher);
		}
		
	}

	
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		//不懂
//		Iterator<Integer> iterator = teachers.keySet().iterator();
		Collection<Teacher> values = teachers.values();
		Iterator<Teacher> iterator = values.iterator();
		
		while (iterator.hasNext()) {
			Integer integer = iterator.next().getId();
			teachers.remove(integer);
			
		}
	}

	//budo不懂
	@Override
	//：1 编号排序（升序）、2 姓名排序（升序）和3 工龄排序（降序）。
	public void sortThree(int sor) {
		ArrayList<Teacher> list = new ArrayList<>();
		Iterator<Teacher> iterator = teachers.values().iterator();
		while (iterator.hasNext()) {
			Teacher teacher = iterator.next();
			list.add(teacher);
		}
		if (sor==1) {
			Collections.sort(list, new Comparator<Teacher>() {

				@Override
				public int compare(Teacher o1, Teacher o2) {
					// TODO Auto-generated method stub
					return o1.getId()-o2.getId();
				}


			});
		}else if (sor==2) {
			Collections.sort(list, new Comparator<Teacher>() {

				@Override
				public int compare(Teacher o1, Teacher o2) {
					// TODO Auto-generated method stub
					return o1.getName().charAt(0)-o2.getName().charAt(0);
				}


			});
			
		}else if (sor==3) {
			Collections.sort(list, new Comparator<Teacher>() {

				@Override
				public int compare(Teacher o1, Teacher o2) {
					// TODO Auto-generated method stub
					return o2.getWorkage()-o1.getWorkage();
				}


			});
		}
	}
	

	@Override
	public void printOneMsg() {
		
	}
	

}
