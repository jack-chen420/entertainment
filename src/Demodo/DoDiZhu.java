package Demodo;

import java.util.ArrayList;
import java.util.Collections;

public class DoDiZhu {
	public static void main(String[] args) {
		ArrayList<String>	poker=new ArrayList<String>();
		String[]colors= {"♠","♥","♣","♦"};
		String[]numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		poker.add("大王");
		poker.add("小王");
		for (String string1 : numbers) {
			for (String string2 : colors) {
				poker.add(string1+string2);
			}
		}
		
		
		Collections.shuffle(poker);
//		System.out.println(poker);
		ArrayList<String>player01=new ArrayList<String>();
		ArrayList<String>player02=new ArrayList<String>();
		ArrayList<String>player03=new ArrayList<String>();
		ArrayList<String>dipai=new ArrayList<String>();
		
		for (int i	= 0; i < poker.size(); i++) {
			String p=poker.get(i);
			if(i>=51 ) {
				dipai.add(p);
			}else if (i%3==0) {
				player01.add(p);
			}else if (i%3==1) {
				player02.add(p);
			}else if (i%3==2) {
				player03.add(p);
			}
		}
		System.out.println(player01);
		System.out.println(player02);
		System.out.println(player03);
		System.out.println(dipai);
	}
}
