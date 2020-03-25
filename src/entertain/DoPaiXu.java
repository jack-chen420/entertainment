package entertain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class DoPaiXu {
	public static void main(String[] args) {
		HashMap<Integer, String>poker=new HashMap<Integer, String>();
		ArrayList<Integer>pokerIndex=new ArrayList<Integer>();
		String[]colors= {"♠","♥","♣","♦"};
		String[]numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		int index=0;
		poker.put(index, "大王");
		pokerIndex.add(index);
		index++;
		poker.put(index, "小王");
		//忽略了
		pokerIndex.add(index);
		index++;
		for (String number : numbers) {
			for (String color : colors) {
				poker.put(index,color+number);
				pokerIndex.add(index);
				index++; 
			}
		}
//		System.out.println(poker);
//		System.out.println(pokerIndex);
		//洗牌
		Collections.shuffle(pokerIndex);
//		System.out.println(pokerIndex);
		
		
		//发牌
		ArrayList<Integer>player1=new ArrayList<Integer>();
		ArrayList<Integer>player2=new ArrayList<Integer>();
		ArrayList<Integer>player3=new ArrayList<Integer>();
		ArrayList<Integer>dipai=new ArrayList<Integer>();
		for (int i = 0; i < pokerIndex.size() ; i++) {
			Integer in=pokerIndex.get(i);
			if(i>=51) {
				dipai.add(in);
			}else if (i%3==0) {
				player1.add(in);
			}else if (i%3==1) {
				player2.add(in);
			}else if (i%3==2) {
				player3.add(in);
			}
			
		}
		
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		Collections.sort(dipai);
		
		
		
		//调用看牌方法
		lookPoker("aa", poker, player1);
		lookPoker("bb", poker, player2);
		lookPoker("cc", poker, player3);
		lookPoker("dd", poker, dipai);
		
		
	}	
	//看牌
	public static void lookPoker(String name,HashMap<Integer, String>poker,ArrayList<Integer>list) {
		System.out.print(name+": ");
		for (Integer key : list) {
			String 	value=poker.get(key);
			System.out.print(value+" ");
		}
		System.out.println("");
	}
	
	
	
}
