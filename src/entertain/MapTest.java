package entertain;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®");
		String str=sc.next();	
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if(map.containsKey(c)) {
				Integer value=map.get(c);
				value++;
				map.put(c, value);
			}else {
				map.put(c,1);
			}
		}
		for (Character 	key : map.keySet()) {
			Integer value=map.get(key);
			System.out.println(key+"="+value);
		}
		
		System.out.println(map);
	}

}
