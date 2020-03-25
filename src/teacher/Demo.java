package teacher;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		TeacherSystem system=new TeacherSystem();
		system.welcome();
		while (true) {
			system.showMenu();
			Scanner sc=new Scanner(System.in);
			int in = MyUtil.getInputNum("请输入你的操作", sc);
			switch (in) {
			case 1:
				system.add();
				break;
			case 2:
				while (true) {
					try {
						system.deleteOne(MyUtil.getInputNum("两种方式删除老师 1 编号 2 姓名", sc));
						break;
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("格式有误");
						sc.nextLine();
					}
				
				}
				break;
			case 3:
				system.searchOne(MyUtil.getInputNum("两种方式删除老师 1 编号 2 姓名", sc));
				break;
				
			case 4:
				system.modifyOne(MyUtil.getInputNum("两种方式删除老师 1 编号 2 姓名", sc));
				break;
			case 5:
				system.countMoney();
				break;
			case 6:
				System.out.println("当用户输入员工资料、修改、排序后需要用户决定是否保存老师资料");
				system.save();
				break;
			case 7:
//				system.sortthree(MyUtil.getInputNum("1 编号排序（升序）、2 姓名排序（升序）和3 工龄排序（降序）。", sc));
				break;
			case 8:
				system.printAll();
				break;
			case 9:
				system.deleteAll();
				break;
			case 10:
				system.printOneMsg();
				break;
			case 11:
				system.load();
				break;
			case 12:
				system.exit();
				return;
			}
		}
	}

}
