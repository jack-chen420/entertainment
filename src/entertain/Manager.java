package entertain;

import java.util.ArrayList;
//Ⱥ����

public class Manager extends User {
	public Manager() {
		
	}
	
	public Manager(String name,int money) {
		super(name, money);
	}
	//�����
	public ArrayList<Integer> send(int totalmoney,int count){
		//��Ҫһ�����ϴ洢���ɸ����
		ArrayList<Integer> redList=new ArrayList<Integer>();
		int leftmonet=super.getMoney(); //��ǰ���
		if(totalmoney>leftmonet) {
			System.out.println("����");
			return redList;
		}
		//��ֺ��
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
