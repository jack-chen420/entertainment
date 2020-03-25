package entertain;

import java.util.ArrayList;
//群主类

public class Manager extends User {
	public Manager() {
		
	}
	
	public Manager(String name,int money) {
		super(name, money);
	}
	//发红包
	public ArrayList<Integer> send(int totalmoney,int count){
		//需要一个集合存储若干个红包
		ArrayList<Integer> redList=new ArrayList<Integer>();
		int leftmonet=super.getMoney(); //当前余额
		if(totalmoney>leftmonet) {
			System.out.println("余额不足");
			return redList;
		}
		//拆分红包
		int avg=totalmoney/count;
		int mod=totalmoney%count;
		for (int i = 0; i < count-1; i++) {
			redList.add(avg);
		}
		int last=avg+mod;
		redList.add(last);
		return redList;
	}

}
