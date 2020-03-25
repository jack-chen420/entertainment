package entertain;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) { 
		System.out.println("ÊäÈë×Ö·û´®");
		Scanner sc =new Scanner(System.in);
		String input =sc.next();
		int countUpper=0;
		int countLower=0;
		int countNumber=0;
		int countOther=0;
		char []charArray=input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch=charArray[i];
			if ('A'<=ch&&'z'>=ch) {
				countUpper++;
			} else if ('a'<=ch&&'z'>=ch){
				countLower++;
			}else if ('0'<=ch&&'9'>=ch){
				countNumber++;
			}else {
				countOther++;
			}
			
		}
		System.out.println(countUpper);
		System.out.println(countLower);
		System.out.println(countNumber);
		System.out.println(countOther);
	}
}
