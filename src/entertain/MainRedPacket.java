package entertain;

import java.util.ArrayList;

public class MainRedPacket {
		public static void main(String[] args) {
			Manager manager=new Manager("Ⱥ��",100);
			Member one=new Member("ȺԱ",0);	
			Member two=new Member("ȺԱ",0);
			Member three=new Member("ȺԱ",0);
			manager.show();
			one.show();
			two.show();
			three.show();
			ArrayList<Integer> redList = manager.send(20, 3);
			one.receive(redList);
			two.receive(redList);
			three.receive(redList);
			manager.show();
			one.show();
			two.show();
			three.show();
			
		}
}
